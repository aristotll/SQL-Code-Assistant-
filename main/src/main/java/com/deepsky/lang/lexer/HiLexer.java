/*
 * Copyright (c) 2009,2010 Serhiy Kulyk
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     2. Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *
 * SQL CODE ASSISTANT PLUG-IN FOR INTELLIJ IDEA IS PROVIDED BY SERHIY KULYK
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL SERHIY KULYK BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.deepsky.lang.lexer;



import com.deepsky.database.ora.DbUrlUtil;
import com.deepsky.lang.common.ResolveProvider;
import com.deepsky.lang.plsql.psi.PlSqlElement;
import com.deepsky.lang.plsql.resolver.ResolveFacadeImpl;
import com.deepsky.lang.plsql.resolver.index.IndexTree;
import com.deepsky.lang.plsql.resolver.index.IndexTreeBase;
import com.deepsky.lang.plsql.resolver.psibased.NamesIndexer;
import com.deepsky.lang.plsql.sqlIndex.AbstractSchema;
import com.deepsky.lang.plsql.sqlIndex.impl.DbSchemaIndex;
import com.deepsky.lang.plsql.tree.MarkupGeneratorEx2;
import com.deepsky.lang.validation.impl.SignNameVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.lexer.Lexer;
import com.intellij.lexer.LexerPosition;
import com.intellij.lexer.LexerState;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Lexer implementation which is used to highlight syntax in Color&Fonts configuration
 * Keep SyntaxHighlightAnnotator and PlSqlHighlighterBase in sync to have colors Color&Fonts configuration
 * matched to colors in windows
 *
 * This lexer generates tokens usually generated by a parser i.e. after building a syntax three,
 * also it is trying to resolve references against object definitions in the source file.
 */
public class HiLexer extends Lexer {

    int offset; // tracks position of the lexer
    int size;
    char[] chars;
    CharSequence charSequence;
    List<ElementParams> nodes = new ArrayList<ElementParams>();

    private int index;

    private void startInternal(char[] chars, int startOffset, int endOffset) {
        MarkupGeneratorEx2 generator = new MarkupGeneratorEx2();
        ASTNode root = generator.parse(String.valueOf(chars, startOffset, endOffset - startOffset));
        DbSchemaIndex cindex = new DbSchemaIndex(
                new File("."),
                DbUrlUtil.parse("jdbc:oracle:thin:test$45@localhost:1521:ora").getDbUID()
        ){};

        IndexTree iTree = new IndexTreeBase();
        new NamesIndexer().index(root, iTree);
        cindex.addIndex("test$45", iTree);
        AbstractSchema sIndex = cindex.getSimpleIndex("test$45");

        SignNameVisitor visitor = new SignNameVisitor() {
            protected void annotate(PsiElement psiElement, IElementType elementType) {
                add(elementType,
                        psiElement.getTextRange().getStartOffset(),
                        psiElement.getTextRange().getLength());
            }
        };

        PlSqlElement element = (PlSqlElement) root.getPsi();
        ((ResolveProvider) element).setResolver(new ResolveFacadeImpl(sIndex));
//        element.accept(visitor);
        visitor.processElement(element);
        index = nodes.size() > 0 ? 0 : -1;
    }

    private void start(char[] chars, int i, int i1) {
        this.chars = chars;
        this.offset = i;
        this.size = i1;
        startInternal(chars, i, i1);
    }

    public void start(CharSequence charSequence, int i, int i1, int i2) {
        this.charSequence = charSequence;

        String rt = charSequence.toString();
        this.chars = rt.toCharArray();
        this.offset = i;
        this.size = i1;
        startInternal(chars, i, i1);
    }

    public int getState() {
        return 0;
    }

    public java.lang.CharSequence getTokenSequence() {
        return index != -1 ? new String(chars, nodes.get(index).startOffset, nodes.get(index).length) : null;
    }

    public java.lang.String getTokenText() {
        return index != -1 ? new String(chars, nodes.get(index).startOffset, nodes.get(index).length) : null;
    }


    public IElementType getTokenType() {
        return index != -1 ? nodes.get(index).type : null;
    }


    public int getTokenStart() {
        return index != -1 ? nodes.get(index).startOffset : 0;
    }

    public int getTokenEnd() {
        return index != -1 ? nodes.get(index).startOffset + nodes.get(index).length : 0;
    }

    public void advance() {
        if (index != -1 && index < nodes.size() - 1) {
            index++;
        } else {
            index = -1;
        }
    }


    public LexerPosition getCurrentPosition() {
        return new LexerPositionImpl(offset, new LexerStateImpl());
    }

    public void restore(LexerPosition lexerPosition) {
        if (lexerPosition != null) {
            start(chars, lexerPosition.getOffset(), size);
        }
    }

    public CharSequence getBufferSequence() {
        return this.charSequence;
    }

    public int getBufferEnd() {
        return size; //offset + size;
    }


    private class LexerStateImpl implements LexerState {
        public short intern() {
            return 0;
        }
    }

    private class LexerPositionImpl implements LexerPosition {

        int offset;
        LexerState state;

        public LexerPositionImpl(int offset, LexerState state) {
            this.offset = offset;
            this.state = state;
        }

        public int getOffset() {
            return offset;
        }

        public int getState() {
            // todo
            return 0;
        }
    }


    private class ElementParams {
        int startOffset;
        int length;
        IElementType type;

        public ElementParams(IElementType type, int startOffset, int length) {
            this.type = type;
            this.startOffset = startOffset;
            this.length = length;
        }
    }


    private void add(IElementType type, int startOffset, int length) {
        int endPos = 0;
        int index = 0;
        for (ElementParams p : nodes) {
            if (p.startOffset <= startOffset && p.startOffset + p.length >= startOffset + length) {
                // skip adding element
                return;
            } else if(endPos <= startOffset && p.startOffset >= startOffset + length){
                 // insert element
                break;
            }

            endPos = p.startOffset + p.length;
            index++;
        }
        nodes.add(index, new ElementParams(type, startOffset, length));
    }
}

