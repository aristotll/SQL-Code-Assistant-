package com.deepsky.integration.lexer.generated;

import com.intellij.psi.tree.IElementType;

public class PlSqlTokenTypesMapping {
	public final static IElementType[] table;

	static {
		table = new IElementType[834];

		table[39] = PlSqlBaseTokenTypes.DOLLAR;
		table[9] = PlSqlBaseTokenTypes.LT;
		table[20] = PlSqlBaseTokenTypes.QUOTED_STR;
		table[8] = PlSqlBaseTokenTypes.STORAGE_SIZE;
		table[36] = PlSqlBaseTokenTypes.DOUBLEDOT;
		table[18] = PlSqlBaseTokenTypes.ANY_CHARACTER;
		table[5] = PlSqlBaseTokenTypes.BAD_CHARACTER;
		table[27] = PlSqlBaseTokenTypes.ASTERISK;
		table[50] = PlSqlBaseTokenTypes.ML_COMMENT;
		table[52] = PlSqlBaseTokenTypes.THEN_COND_CMPL;
		table[26] = PlSqlBaseTokenTypes.COMMA;
		table[19] = PlSqlBaseTokenTypes.IDENTIFIER;
		table[53] = PlSqlBaseTokenTypes.ELSE_COND_CMPL;
		table[13] = PlSqlBaseTokenTypes.CUSTOM_TOKEN;
		table[22] = PlSqlBaseTokenTypes.AT_PREFIXED;
		table[30] = PlSqlBaseTokenTypes.PLUS;
		table[16] = PlSqlBaseTokenTypes.TABLE_NAME_SPEC;
		table[29] = PlSqlBaseTokenTypes.CLOSE_PAREN;
		table[54] = PlSqlBaseTokenTypes.END_COND_CMPL;
		table[42] = PlSqlBaseTokenTypes.PASS_BY_NAME;
		table[4] = PlSqlBaseTokenTypes.BAD_ML_COMMENT;
		table[34] = PlSqlBaseTokenTypes.EQ;
		table[25] = PlSqlBaseTokenTypes.DOT;
		table[41] = PlSqlBaseTokenTypes.ASSIGNMENT_EQ;
		table[55] = PlSqlBaseTokenTypes.ERROR_COND_CMPL;
		table[32] = PlSqlBaseTokenTypes.DIVIDE;
		table[21] = PlSqlBaseTokenTypes.DOUBLE_QUOTED_STRING;
		table[38] = PlSqlBaseTokenTypes.START_LABEL;
		table[11] = PlSqlBaseTokenTypes.GE;
		table[37] = PlSqlBaseTokenTypes.CONCAT;
		table[7] = PlSqlBaseTokenTypes.BAD_NUMBER_LITERAL;
		table[46] = PlSqlBaseTokenTypes.N;
		table[6] = PlSqlBaseTokenTypes.BAD_CHAR_LITERAL;
		table[45] = PlSqlBaseTokenTypes.NUMBER;
		table[15] = PlSqlBaseTokenTypes.COLON_OLD;
		table[28] = PlSqlBaseTokenTypes.OPEN_PAREN;
		table[31] = PlSqlBaseTokenTypes.MINUS;
		table[23] = PlSqlBaseTokenTypes.SEMI;
		table[35] = PlSqlBaseTokenTypes.PERCENTAGE;
		table[12] = PlSqlBaseTokenTypes.NOT_EQ;
		table[43] = PlSqlBaseTokenTypes.VERTBAR;
		table[24] = PlSqlBaseTokenTypes.COLON;
		table[17] = PlSqlBaseTokenTypes.PLSQL_ENV_VAR;
		table[47] = PlSqlBaseTokenTypes.WS;
		table[40] = PlSqlBaseTokenTypes.END_LABEL;
		table[49] = PlSqlBaseTokenTypes.SL_COMMENT;
		table[44] = PlSqlBaseTokenTypes.GT;
		table[51] = PlSqlBaseTokenTypes.IF_COND_CMPL;
		table[14] = PlSqlBaseTokenTypes.COLON_NEW;
		table[10] = PlSqlBaseTokenTypes.LE;
		table[33] = PlSqlBaseTokenTypes.BACKSLASH;
		table[48] = PlSqlBaseTokenTypes.LF;
		table[399] = PlSqlBaseTokenTypes.KEYWORD_USING;
		table[634] = PlSqlBaseTokenTypes.KEYWORD_ERROR_INDEX;
		table[548] = PlSqlBaseTokenTypes.KEYWORD_STORE;
		table[517] = PlSqlBaseTokenTypes.KEYWORD_REFERENCING;
		table[610] = PlSqlBaseTokenTypes.KEYWORD_FIPSFLAG;
		table[560] = PlSqlBaseTokenTypes.KEYWORD_EXTERNAL;
		table[758] = PlSqlBaseTokenTypes.KEYWORD_WAIT;
		table[539] = PlSqlBaseTokenTypes.KEYWORD_PCTFREE;
		table[665] = PlSqlBaseTokenTypes.KEYWORD_FLOAT;
		table[795] = PlSqlBaseTokenTypes.KEYWORD_LRTRIM;
		table[793] = PlSqlBaseTokenTypes.KEYWORD_MISSING;
		table[414] = PlSqlBaseTokenTypes.KEYWORD_REFERENCES;
		table[650] = PlSqlBaseTokenTypes.KEYWORD_TIME;
		table[717] = PlSqlBaseTokenTypes.KEYWORD_OVER;
		table[773] = PlSqlBaseTokenTypes.KEYWORD_CHARACTERSET;
		table[411] = PlSqlBaseTokenTypes.KEYWORD_MOVEMENT;
		table[378] = PlSqlBaseTokenTypes.KEYWORD_ROLE;
		table[500] = PlSqlBaseTokenTypes.KEYWORD_LOGON;
		table[741] = PlSqlBaseTokenTypes.KEYWORD_RIGHT;
		table[638] = PlSqlBaseTokenTypes.KEYWORD_ELSE;
		table[543] = PlSqlBaseTokenTypes.KEYWORD_MONITORING;
		table[438] = PlSqlBaseTokenTypes.KEYWORD_HOST;
		table[765] = PlSqlBaseTokenTypes.KEYWORD_SAVEPOINT;
		table[641] = PlSqlBaseTokenTypes.KEYWORD_NUMBER;
		table[711] = PlSqlBaseTokenTypes.KEYWORD_EXTRACT;
		table[538] = PlSqlBaseTokenTypes.KEYWORD_NOCOMPRESS;
		table[506] = PlSqlBaseTokenTypes.KEYWORD_DIASSOCIATE;
		table[405] = PlSqlBaseTokenTypes.KEYWORD_SYSDATE;
		table[556] = PlSqlBaseTokenTypes.KEYWORD_NOVALIDATE;
		table[613] = PlSqlBaseTokenTypes.KEYWORD_SUBTYPE;
		table[516] = PlSqlBaseTokenTypes.KEYWORD_EACH;
		table[364] = PlSqlBaseTokenTypes.KEYWORD_VIEW;
		table[774] = PlSqlBaseTokenTypes.KEYWORD_BIG;
		table[682] = PlSqlBaseTokenTypes.KEYWORD_SERIALLY_REUSABLE;
		table[715] = PlSqlBaseTokenTypes.KEYWORD_NEXTVAL;
		table[522] = PlSqlBaseTokenTypes.KEYWORD_UNIQUE;
		table[536] = PlSqlBaseTokenTypes.KEYWORD_DIRECT_LOAD;
		table[619] = PlSqlBaseTokenTypes.KEYWORD_RAISE;
		table[764] = PlSqlBaseTokenTypes.KEYWORD_EXCLUSIVE;
		table[496] = PlSqlBaseTokenTypes.KEYWORD_BEFORE;
		table[703] = PlSqlBaseTokenTypes.KEYWORD_SQLERRM;
		table[474] = PlSqlBaseTokenTypes.KEYWORD_NOGUARANTEE;
		table[562] = PlSqlBaseTokenTypes.KEYWORD_INSTANCES;
		table[757] = PlSqlBaseTokenTypes.KEYWORD_NOWAIT;
		table[814] = PlSqlBaseTokenTypes.KEYWORD_PREPROCESSOR;
		table[614] = PlSqlBaseTokenTypes.KEYWORD_LOOP;
		table[696] = PlSqlBaseTokenTypes.KEYWORD_CURRENT;
		table[740] = PlSqlBaseTokenTypes.KEYWORD_LEFT;
		table[498] = PlSqlBaseTokenTypes.KEYWORD_SHUTDOWN;
		table[701] = PlSqlBaseTokenTypes.KEYWORD_MEMBER;
		table[435] = PlSqlBaseTokenTypes.KEYWORD_DEFINE;
		table[739] = PlSqlBaseTokenTypes.KEYWORD_SID;
		table[607] = PlSqlBaseTokenTypes.KEYWORD_RESTRICT_REFERENCES;
		table[555] = PlSqlBaseTokenTypes.KEYWORD_PARTITIONS;
		table[661] = PlSqlBaseTokenTypes.KEYWORD_INTEGER;
		table[713] = PlSqlBaseTokenTypes.KEYWORD_HOUR;
		table[744] = PlSqlBaseTokenTypes.KEYWORD_JOIN;
		table[376] = PlSqlBaseTokenTypes.KEYWORD_OPERATOR;
		table[502] = PlSqlBaseTokenTypes.KEYWORD_ANALYZE;
		table[593] = PlSqlBaseTokenTypes.KEYWORD_REF;
		table[520] = PlSqlBaseTokenTypes.KEYWORD_NEW;
		table[477] = PlSqlBaseTokenTypes.KEYWORD_INCLUDING;
		table[371] = PlSqlBaseTokenTypes.KEYWORD_SEQUENCE;
		table[380] = PlSqlBaseTokenTypes.KEYWORD_LIBRARY;
		table[437] = PlSqlBaseTokenTypes.KEYWORD_REM;
		table[697] = PlSqlBaseTokenTypes.KEYWORD_EXISTS;
		table[753] = PlSqlBaseTokenTypes.KEYWORD_HAVING;
		table[374] = PlSqlBaseTokenTypes.KEYWORD_PUBLIC;
		table[651] = PlSqlBaseTokenTypes.KEYWORD_ZONE;
		table[780] = PlSqlBaseTokenTypes.KEYWORD_SIZES;
		table[359] = PlSqlBaseTokenTypes.KEYWORD_BODY;
		table[587] = PlSqlBaseTokenTypes.KEYWORD_VISIBLE;
		table[361] = PlSqlBaseTokenTypes.KEYWORD_DROP;
		table[681] = PlSqlBaseTokenTypes.KEYWORD_EXCEPTION;
		table[708] = PlSqlBaseTokenTypes.KEYWORD_LEAD;
		table[488] = PlSqlBaseTokenTypes.KEYWORD_BY;
		table[419] = PlSqlBaseTokenTypes.KEYWORD_LONG;
		table[625] = PlSqlBaseTokenTypes.KEYWORD_CLOSE;
		table[714] = PlSqlBaseTokenTypes.KEYWORD_ANY;
		table[783] = PlSqlBaseTokenTypes.KEYWORD_NOBADFILE;
		table[413] = PlSqlBaseTokenTypes.KEYWORD_KEY;
		table[425] = PlSqlBaseTokenTypes.KEYWORD_EXECUTE;
		table[389] = PlSqlBaseTokenTypes.KEYWORD_PACKAGES;
		table[428] = PlSqlBaseTokenTypes.KEYWORD_OSERROR;
		table[663] = PlSqlBaseTokenTypes.KEYWORD_DOUBLE;
		table[445] = PlSqlBaseTokenTypes.KEYWORD_REPHEADER;
		table[479] = PlSqlBaseTokenTypes.KEYWORD_AND;
		table[534] = PlSqlBaseTokenTypes.KEYWORD_COMPRESS;
		table[771] = PlSqlBaseTokenTypes.KEYWORD_DELIMITED;
		table[553] = PlSqlBaseTokenTypes.KEYWORD_OVERFLOW;
		table[639] = PlSqlBaseTokenTypes.KEYWORD_AUTONOMOUS_TRANSACTION;
		table[387] = PlSqlBaseTokenTypes.KEYWORD_COLUMN;
		table[654] = PlSqlBaseTokenTypes.KEYWORD_DAY;
		table[732] = PlSqlBaseTokenTypes.KEYWORD_COLLECT;
		table[515] = PlSqlBaseTokenTypes.KEYWORD_UPDATE;
		table[647] = PlSqlBaseTokenTypes.KEYWORD_RAW;
		table[492] = PlSqlBaseTokenTypes.KEYWORD_CONNECT;
		table[532] = PlSqlBaseTokenTypes.KEYWORD_NOLOGGING;
		table[722] = PlSqlBaseTokenTypes.KEYWORD_TIMEZONE_HOUR;
		table[418] = PlSqlBaseTokenTypes.KEYWORD_SET;
		table[421] = PlSqlBaseTokenTypes.KEYWORD_VAR;
		table[791] = PlSqlBaseTokenTypes.KEYWORD_DATA_CACHE;
		table[505] = PlSqlBaseTokenTypes.KEYWORD_DDL;
		table[385] = PlSqlBaseTokenTypes.KEYWORD_STATISTICS;
		table[557] = PlSqlBaseTokenTypes.KEYWORD_ORGANIZATION;
		table[707] = PlSqlBaseTokenTypes.KEYWORD_LAG;
		table[392] = PlSqlBaseTokenTypes.KEYWORD_INDEXTYPES;
		table[685] = PlSqlBaseTokenTypes.KEYWORD_NAME;
		table[408] = PlSqlBaseTokenTypes.KEYWORD_DISABLE;
		table[390] = PlSqlBaseTokenTypes.KEYWORD_TYPES;
		table[705] = PlSqlBaseTokenTypes.KEYWORD_TRIM;
		table[535] = PlSqlBaseTokenTypes.KEYWORD_ALL;
		table[529] = PlSqlBaseTokenTypes.KEYWORD_PARALLEL;
		table[785] = PlSqlBaseTokenTypes.KEYWORD_NODISCARDFILE;
		table[612] = PlSqlBaseTokenTypes.KEYWORD_CONSTANT;
		table[664] = PlSqlBaseTokenTypes.KEYWORD_PRECISION;
		table[828] = PlSqlBaseTokenTypes.KEYWORD_ORACLE_LOADER;
		table[470] = PlSqlBaseTokenTypes.KEYWORD_UNIFORM;
		table[695] = PlSqlBaseTokenTypes.KEYWORD_AT;
		table[519] = PlSqlBaseTokenTypes.KEYWORD_AS;
		table[503] = PlSqlBaseTokenTypes.KEYWORD_AUDIT;
		table[736] = PlSqlBaseTokenTypes.KEYWORD_FLUSH;
		table[365] = PlSqlBaseTokenTypes.KEYWORD_CASCADE;
		table[441] = PlSqlBaseTokenTypes.KEYWORD_OFF;
		table[684] = PlSqlBaseTokenTypes.KEYWORD_JAVA;
		table[817] = PlSqlBaseTokenTypes.KEYWORD_DISABLED;
		table[706] = PlSqlBaseTokenTypes.KEYWORD_MULTISET;
		table[801] = PlSqlBaseTokenTypes.KEYWORD_ENCLOSED;
		table[580] = PlSqlBaseTokenTypes.KEYWORD_NO;
		table[486] = PlSqlBaseTokenTypes.KEYWORD_NOCACHE;
		table[358] = PlSqlBaseTokenTypes.KEYWORD_PACKAGE;
		table[772] = PlSqlBaseTokenTypes.KEYWORD_FIXED;
		table[512] = PlSqlBaseTokenTypes.KEYWORD_OF;
		table[709] = PlSqlBaseTokenTypes.KEYWORD_RANK;
		table[646] = PlSqlBaseTokenTypes.KEYWORD_BYTE;
		table[403] = PlSqlBaseTokenTypes.KEYWORD_ON;
		table[600] = PlSqlBaseTokenTypes.KEYWORD_ONLY;
		table[738] = PlSqlBaseTokenTypes.KEYWORD_RESET;
		table[363] = PlSqlBaseTokenTypes.KEYWORD_PURGE;
		table[694] = PlSqlBaseTokenTypes.KEYWORD_694; // KEYWORD_**
		table[564] = PlSqlBaseTokenTypes.KEYWORD_LIMIT;
		table[487] = PlSqlBaseTokenTypes.KEYWORD_INCREMENT;
		table[590] = PlSqlBaseTokenTypes.KEYWORD_FINAL;
		table[626] = PlSqlBaseTokenTypes.KEYWORD_FETCH;
		table[451] = PlSqlBaseTokenTypes.KEYWORD_OR;
		table[805] = PlSqlBaseTokenTypes.KEYWORD_VARRAWC;
		table[497] = PlSqlBaseTokenTypes.KEYWORD_STARTUP;
		table[410] = PlSqlBaseTokenTypes.KEYWORD_ROW;
		table[394] = PlSqlBaseTokenTypes.KEYWORD_MANAGED;
		table[770] = PlSqlBaseTokenTypes.KEYWORD_NEWLINE;
		table[490] = PlSqlBaseTokenTypes.KEYWORD_NOORDER;
		table[776] = PlSqlBaseTokenTypes.KEYWORD_ENDIAN;
		table[735] = PlSqlBaseTokenTypes.KEYWORD_SESSION;
		table[637] = PlSqlBaseTokenTypes.KEYWORD_THEN;
		table[653] = PlSqlBaseTokenTypes.KEYWORD_MONTH;
		table[767] = PlSqlBaseTokenTypes.KEYWORD_RECORDS;
		table[501] = PlSqlBaseTokenTypes.KEYWORD_LOGOFF;
		table[402] = PlSqlBaseTokenTypes.KEYWORD_COMMENT;
		table[547] = PlSqlBaseTokenTypes.KEYWORD_INTERVAL;
		table[702] = PlSqlBaseTokenTypes.KEYWORD_SQLCODE;
		table[622] = PlSqlBaseTokenTypes.KEYWORD_MERGE;
		table[416] = PlSqlBaseTokenTypes.KEYWORD_CONSTRAINT;
		table[558] = PlSqlBaseTokenTypes.KEYWORD_PCTTHRESHOLD;
		table[439] = PlSqlBaseTokenTypes.KEYWORD_QUIT;
		table[751] = PlSqlBaseTokenTypes.KEYWORD_ROWNUM;
		table[475] = PlSqlBaseTokenTypes.KEYWORD_AUTOEXTEND;
		table[809] = PlSqlBaseTokenTypes.KEYWORD_ZONED;
		table[400] = PlSqlBaseTokenTypes.KEYWORD_NULL;
		table[630] = PlSqlBaseTokenTypes.KEYWORD_ROWCOUNT;
		table[692] = PlSqlBaseTokenTypes.KEYWORD_TRUE;
		table[799] = PlSqlBaseTokenTypes.KEYWORD_LDTRIM;
		table[627] = PlSqlBaseTokenTypes.KEYWORD_SQL;
		table[786] = PlSqlBaseTokenTypes.KEYWORD_DISCARDFILE;
		table[370] = PlSqlBaseTokenTypes.KEYWORD_FORCE;
		table[514] = PlSqlBaseTokenTypes.KEYWORD_INSERT;
		table[724] = PlSqlBaseTokenTypes.KEYWORD_TIMEZONE_REGION;
		table[756] = PlSqlBaseTokenTypes.KEYWORD_LAST;
		table[636] = PlSqlBaseTokenTypes.KEYWORD_COUNT;
		table[655] = PlSqlBaseTokenTypes.KEYWORD_SECOND;
		table[689] = PlSqlBaseTokenTypes.KEYWORD_SAVE;
		table[811] = PlSqlBaseTokenTypes.KEYWORD_LOCATION;
		table[645] = PlSqlBaseTokenTypes.KEYWORD_CHAR;
		table[746] = PlSqlBaseTokenTypes.KEYWORD_WHERE;
		table[372] = PlSqlBaseTokenTypes.KEYWORD_TYPE;
		table[603] = PlSqlBaseTokenTypes.KEYWORD_AUTHID;
		table[640] = PlSqlBaseTokenTypes.KEYWORD_PRIOR;
		table[509] = PlSqlBaseTokenTypes.KEYWORD_REVOKE;
		table[568] = PlSqlBaseTokenTypes.KEYWORD_MAXEXTENTS;
		table[545] = PlSqlBaseTokenTypes.KEYWORD_PARTITION;
		table[440] = PlSqlBaseTokenTypes.KEYWORD_SPOOL;
		table[521] = PlSqlBaseTokenTypes.KEYWORD_WHEN;
		table[412] = PlSqlBaseTokenTypes.KEYWORD_PRIMARY;
		table[581] = PlSqlBaseTokenTypes.KEYWORD_ACTION;
		table[433] = PlSqlBaseTokenTypes.KEYWORD_NONE;
		table[760] = PlSqlBaseTokenTypes.KEYWORD_RETURNING;
		table[483] = PlSqlBaseTokenTypes.KEYWORD_CYCLE;
		table[482] = PlSqlBaseTokenTypes.KEYWORD_MINVALUE;
		table[540] = PlSqlBaseTokenTypes.KEYWORD_PCTUSED;
		table[730] = PlSqlBaseTokenTypes.KEYWORD_MINUS;
		table[748] = PlSqlBaseTokenTypes.KEYWORD_TRAILING;
		table[660] = PlSqlBaseTokenTypes.KEYWORD_INT;
		table[460] = PlSqlBaseTokenTypes.KEYWORD_DATAFILE;
		table[635] = PlSqlBaseTokenTypes.KEYWORD_ERROR_CODE;
		table[527] = PlSqlBaseTokenTypes.KEYWORD_ROWS;
		table[729] = PlSqlBaseTokenTypes.KEYWORD_INTERSECT;
		table[480] = PlSqlBaseTokenTypes.KEYWORD_DATAFILES;
		table[544] = PlSqlBaseTokenTypes.KEYWORD_NOMONITORING;
		table[446] = PlSqlBaseTokenTypes.KEYWORD_SERVEROUTPUT;
		table[789] = PlSqlBaseTokenTypes.KEYWORD_READSIZE;
		table[585] = PlSqlBaseTokenTypes.KEYWORD_NOSORT;
		table[432] = PlSqlBaseTokenTypes.KEYWORD_ROLLBACK;
		table[721] = PlSqlBaseTokenTypes.KEYWORD_FROM;
		table[582] = PlSqlBaseTokenTypes.KEYWORD_ADD;
		table[463] = PlSqlBaseTokenTypes.KEYWORD_ONLINE;
		table[615] = PlSqlBaseTokenTypes.KEYWORD_WHILE;
		table[657] = PlSqlBaseTokenTypes.KEYWORD_REAL;
		table[467] = PlSqlBaseTokenTypes.KEYWORD_EXTENT;
		table[617] = PlSqlBaseTokenTypes.KEYWORD_IF;
		table[472] = PlSqlBaseTokenTypes.KEYWORD_RETENTION;
		table[599] = PlSqlBaseTokenTypes.KEYWORD_READ;
		table[528] = PlSqlBaseTokenTypes.KEYWORD_COMPUTE;
		table[551] = PlSqlBaseTokenTypes.KEYWORD_LESS;
		table[700] = PlSqlBaseTokenTypes.KEYWORD_BETWEEN;
		table[404] = PlSqlBaseTokenTypes.KEYWORD_IS;
		table[466] = PlSqlBaseTokenTypes.KEYWORD_REUSE;
		table[798] = PlSqlBaseTokenTypes.KEYWORD_RTRIM;
		table[596] = PlSqlBaseTokenTypes.KEYWORD_ROWTYPE;
		table[733] = PlSqlBaseTokenTypes.KEYWORD_INTO;
		table[583] = PlSqlBaseTokenTypes.KEYWORD_MODIFY;
		table[608] = PlSqlBaseTokenTypes.KEYWORD_INTERFACE;
		table[812] = PlSqlBaseTokenTypes.KEYWORD_CONCAT;
		table[549] = PlSqlBaseTokenTypes.KEYWORD_IN;
		table[381] = PlSqlBaseTokenTypes.KEYWORD_DATABASE;
		table[406] = PlSqlBaseTokenTypes.KEYWORD_SYSTIMESTAMP;
		table[469] = PlSqlBaseTokenTypes.KEYWORD_LOCAL;
		table[628] = PlSqlBaseTokenTypes.KEYWORD_FOUND;
		table[803] = PlSqlBaseTokenTypes.KEYWORD_VARRAW;
		table[759] = PlSqlBaseTokenTypes.KEYWORD_MATCHED;
		table[597] = PlSqlBaseTokenTypes.KEYWORD_VARRAY;
		table[754] = PlSqlBaseTokenTypes.KEYWORD_NULLS;
		table[573] = PlSqlBaseTokenTypes.KEYWORD_OPTIMAL;
		table[373] = PlSqlBaseTokenTypes.KEYWORD_VALIDATE;
		table[384] = PlSqlBaseTokenTypes.KEYWORD_ASSOCIATE;
		table[510] = PlSqlBaseTokenTypes.KEYWORD_SCHEMA;
		table[574] = PlSqlBaseTokenTypes.KEYWORD_BUFFER_POOL;
		table[570] = PlSqlBaseTokenTypes.KEYWORD_FREELISTS;
		table[648] = PlSqlBaseTokenTypes.KEYWORD_BOOLEAN;
		table[652] = PlSqlBaseTokenTypes.KEYWORD_YEAR;
		table[686] = PlSqlBaseTokenTypes.KEYWORD_PIPELINED;
		table[598] = PlSqlBaseTokenTypes.KEYWORD_OPTION;
		table[669] = PlSqlBaseTokenTypes.KEYWORD_NVARCHAR;
		table[478] = PlSqlBaseTokenTypes.KEYWORD_CONTENTS;
		table[824] = PlSqlBaseTokenTypes.KEYWORD_WHITESPACE;
		table[366] = PlSqlBaseTokenTypes.KEYWORD_CONSTRAINTS;
		table[589] = PlSqlBaseTokenTypes.KEYWORD_UNDER;
		table[680] = PlSqlBaseTokenTypes.KEYWORD_CHARSET;
		table[825] = PlSqlBaseTokenTypes.KEYWORD_OPTIONALLY;
		table[448] = PlSqlBaseTokenTypes.KEYWORD_DECLARE;
		table[606] = PlSqlBaseTokenTypes.KEYWORD_PRAGMA;
		table[719] = PlSqlBaseTokenTypes.KEYWORD_DBTIMEZONE;
		table[393] = PlSqlBaseTokenTypes.KEYWORD_SYSTEM;
		table[747] = PlSqlBaseTokenTypes.KEYWORD_LEADING;
		table[601] = PlSqlBaseTokenTypes.KEYWORD_601; // KEYWORD_VIEW_COLUMN_DEF_$INTERNAL$
		table[662] = PlSqlBaseTokenTypes.KEYWORD_PLS_INTEGER;
		table[782] = PlSqlBaseTokenTypes.KEYWORD_LOAD;
		table[569] = PlSqlBaseTokenTypes.KEYWORD_PCTINCREASE;
		table[611] = PlSqlBaseTokenTypes.KEYWORD_EXCEPTION_INIT;
		table[525] = PlSqlBaseTokenTypes.KEYWORD_DESC;
		table[584] = PlSqlBaseTokenTypes.KEYWORD_SORT;
		table[829] = PlSqlBaseTokenTypes.KEYWORD_ORACLE_DATAPUMP;
		table[461] = PlSqlBaseTokenTypes.KEYWORD_NEXT;
		table[674] = PlSqlBaseTokenTypes.KEYWORD_CLOB;
		table[821] = PlSqlBaseTokenTypes.KEYWORD_DATA;
		table[444] = PlSqlBaseTokenTypes.KEYWORD_REPFOOTER;
		table[565] = PlSqlBaseTokenTypes.KEYWORD_UNLIMITED;
		table[806] = PlSqlBaseTokenTypes.KEYWORD_ORACLE_NUMBER;
		table[649] = PlSqlBaseTokenTypes.KEYWORD_DATE;
		table[676] = PlSqlBaseTokenTypes.KEYWORD_BFILE;
		table[602] = PlSqlBaseTokenTypes.KEYWORD_TIMESTAMP;
		table[727] = PlSqlBaseTokenTypes.KEYWORD_ELSIF;
		table[609] = PlSqlBaseTokenTypes.KEYWORD_BUILTIN;
		table[426] = PlSqlBaseTokenTypes.KEYWORD_WHENEVER;
		table[687] = PlSqlBaseTokenTypes.KEYWORD_PARALLEL_ENABLE;
		table[368] = PlSqlBaseTokenTypes.KEYWORD_PROCEDURE;
		table[667] = PlSqlBaseTokenTypes.KEYWORD_VARCHAR;
		table[586] = PlSqlBaseTokenTypes.KEYWORD_REVERSE;
		table[642] = PlSqlBaseTokenTypes.KEYWORD_BINARY_INTEGER;
		table[716] = PlSqlBaseTokenTypes.KEYWORD_CURRVAL;
		table[668] = PlSqlBaseTokenTypes.KEYWORD_VARCHAR2;
		table[731] = PlSqlBaseTokenTypes.KEYWORD_BULK;
		table[360] = PlSqlBaseTokenTypes.KEYWORD_ALTER;
		table[794] = PlSqlBaseTokenTypes.KEYWORD_FIELD;
		table[452] = PlSqlBaseTokenTypes.KEYWORD_REPLACE;
		table[807] = PlSqlBaseTokenTypes.KEYWORD_ORACLE_DATE;
		table[530] = PlSqlBaseTokenTypes.KEYWORD_NOPARALLEL;
		table[779] = PlSqlBaseTokenTypes.KEYWORD_STRING;
		table[436] = PlSqlBaseTokenTypes.KEYWORD_PROMPT;
		table[422] = PlSqlBaseTokenTypes.KEYWORD_VARIABLE;
		table[575] = PlSqlBaseTokenTypes.KEYWORD_KEEP;
		table[737] = PlSqlBaseTokenTypes.KEYWORD_SHARED_POOL;
		table[493] = PlSqlBaseTokenTypes.KEYWORD_TO;
		table[423] = PlSqlBaseTokenTypes.KEYWORD_COL;
		table[749] = PlSqlBaseTokenTypes.KEYWORD_BOTH;
		table[375] = PlSqlBaseTokenTypes.KEYWORD_SYNONYM;
		table[742] = PlSqlBaseTokenTypes.KEYWORD_INNER;
		table[787] = PlSqlBaseTokenTypes.KEYWORD_NOLOGFILE;
		table[494] = PlSqlBaseTokenTypes.KEYWORD_IDENTIFIED;
		table[495] = PlSqlBaseTokenTypes.KEYWORD_AFTER;
		table[826] = PlSqlBaseTokenTypes.KEYWORD_TIMEZONE;
		table[550] = PlSqlBaseTokenTypes.KEYWORD_VALUES;
		table[675] = PlSqlBaseTokenTypes.KEYWORD_NCLOB;
		table[431] = PlSqlBaseTokenTypes.KEYWORD_COMMIT;
		table[577] = PlSqlBaseTokenTypes.KEYWORD_ENCRYPT;
		table[718] = PlSqlBaseTokenTypes.KEYWORD_SESSIONTIMEZONE;
		table[833] = PlSqlBaseTokenTypes.KEYWORD_LDRTRIM;
		table[768] = PlSqlBaseTokenTypes.KEYWORD_PARAMETERS;
		table[792] = PlSqlBaseTokenTypes.KEYWORD_FIELDS;
		table[816] = PlSqlBaseTokenTypes.KEYWORD_ENABLED;
		table[369] = PlSqlBaseTokenTypes.KEYWORD_INDEX;
		table[523] = PlSqlBaseTokenTypes.KEYWORD_BITMAP;
		table[442] = PlSqlBaseTokenTypes.KEYWORD_STA;
		table[723] = PlSqlBaseTokenTypes.KEYWORD_TIMEZONE_MINUTE;
		table[621] = PlSqlBaseTokenTypes.KEYWORD_SELECT;
		table[481] = PlSqlBaseTokenTypes.KEYWORD_MAXVALUE;
		table[391] = PlSqlBaseTokenTypes.KEYWORD_INDEXES;
		table[397] = PlSqlBaseTokenTypes.KEYWORD_COST;
		table[465] = PlSqlBaseTokenTypes.KEYWORD_SIZE;
		table[704] = PlSqlBaseTokenTypes.KEYWORD_CAST;
		table[552] = PlSqlBaseTokenTypes.KEYWORD_THAN;
		table[424] = PlSqlBaseTokenTypes.KEYWORD_EXEC;
		table[620] = PlSqlBaseTokenTypes.KEYWORD_CASE;
		table[578] = PlSqlBaseTokenTypes.KEYWORD_FOREIGN;
		table[643] = PlSqlBaseTokenTypes.KEYWORD_NATURAL;
		table[571] = PlSqlBaseTokenTypes.KEYWORD_FREELIST;
		table[725] = PlSqlBaseTokenTypes.KEYWORD_TIMEZONE_ABBR;
		table[462] = PlSqlBaseTokenTypes.KEYWORD_MAXSIZE;
		table[458] = PlSqlBaseTokenTypes.KEYWORD_TEMPFILE;
		table[820] = PlSqlBaseTokenTypes.KEYWORD_COMPATIBLE;
		table[802] = PlSqlBaseTokenTypes.KEYWORD_DATE_FORMAT;
		table[588] = PlSqlBaseTokenTypes.KEYWORD_NOVISIBLE;
		table[633] = PlSqlBaseTokenTypes.KEYWORD_BULK_EXCEPTIONS;
		table[788] = PlSqlBaseTokenTypes.KEYWORD_LOGFILE;
		table[813] = PlSqlBaseTokenTypes.KEYWORD_LOBFILE;
		table[388] = PlSqlBaseTokenTypes.KEYWORD_FUNCTIONS;
		table[533] = PlSqlBaseTokenTypes.KEYWORD_FILESYSTEM_LIKE_LOGGING;
		table[678] = PlSqlBaseTokenTypes.KEYWORD_NOCOPY;
		table[734] = PlSqlBaseTokenTypes.KEYWORD_IMMEDIATE;
		table[808] = PlSqlBaseTokenTypes.KEYWORD_COUNTED;
		table[537] = PlSqlBaseTokenTypes.KEYWORD_OPERATIONS;
		table[830] = PlSqlBaseTokenTypes.KEYWORD_LATEST;
		table[656] = PlSqlBaseTokenTypes.KEYWORD_SMALLINT;
		table[398] = PlSqlBaseTokenTypes.KEYWORD_SELECTIVITY;
		table[677] = PlSqlBaseTokenTypes.KEYWORD_OUT;
		table[456] = PlSqlBaseTokenTypes.KEYWORD_SMALLFILE;
		table[766] = PlSqlBaseTokenTypes.KEYWORD_AGGREGATE;
		table[594] = PlSqlBaseTokenTypes.KEYWORD_CURSOR;
		table[604] = PlSqlBaseTokenTypes.KEYWORD_WRAPPED;
		table[658] = PlSqlBaseTokenTypes.KEYWORD_NUMERIC;
		table[491] = PlSqlBaseTokenTypes.KEYWORD_FOR;
		table[720] = PlSqlBaseTokenTypes.KEYWORD_DISTINCT;
		table[624] = PlSqlBaseTokenTypes.KEYWORD_OPEN;
		table[832] = PlSqlBaseTokenTypes.KEYWORD_ARE;
		table[566] = PlSqlBaseTokenTypes.KEYWORD_INITIAL;
		table[542] = PlSqlBaseTokenTypes.KEYWORD_MAXTRANS;
		table[504] = PlSqlBaseTokenTypes.KEYWORD_NOAUDIT;
		table[679] = PlSqlBaseTokenTypes.KEYWORD_ANY_CS;
		table[693] = PlSqlBaseTokenTypes.KEYWORD_FALSE;
		table[815] = PlSqlBaseTokenTypes.KEYWORD_COMPRESSION;
		table[572] = PlSqlBaseTokenTypes.KEYWORD_GROUPS;
		table[362] = PlSqlBaseTokenTypes.KEYWORD_TABLE;
		table[698] = PlSqlBaseTokenTypes.KEYWORD_LIKE;
		table[450] = PlSqlBaseTokenTypes.KEYWORD_CREATE;
		table[429] = PlSqlBaseTokenTypes.KEYWORD_EXIT;
		table[407] = PlSqlBaseTokenTypes.KEYWORD_NOT;
		table[592] = PlSqlBaseTokenTypes.KEYWORD_RECORD;
		table[576] = PlSqlBaseTokenTypes.KEYWORD_RECYCLE;
		table[524] = PlSqlBaseTokenTypes.KEYWORD_ASC;
		table[443] = PlSqlBaseTokenTypes.KEYWORD_START;
		table[401] = PlSqlBaseTokenTypes.KEYWORD_TRUNCATE;
		table[691] = PlSqlBaseTokenTypes.KEYWORD_INDICES;
		table[683] = PlSqlBaseTokenTypes.KEYWORD_LANGUAGE;
		table[800] = PlSqlBaseTokenTypes.KEYWORD_POSITION;
		table[796] = PlSqlBaseTokenTypes.KEYWORD_NOTRIM;
		table[781] = PlSqlBaseTokenTypes.KEYWORD_BYTES;
		table[546] = PlSqlBaseTokenTypes.KEYWORD_RANGE;
		table[541] = PlSqlBaseTokenTypes.KEYWORD_INITRANS;
		table[382] = PlSqlBaseTokenTypes.KEYWORD_LINK;
		table[618] = PlSqlBaseTokenTypes.KEYWORD_GOTO;
		table[778] = PlSqlBaseTokenTypes.KEYWORD_NOCHECK;
		table[464] = PlSqlBaseTokenTypes.KEYWORD_OFFLINE;
		table[699] = PlSqlBaseTokenTypes.KEYWORD_ESCAPE;
		table[819] = PlSqlBaseTokenTypes.KEYWORD_VERSION;
		table[762] = PlSqlBaseTokenTypes.KEYWORD_MODE;
		table[671] = PlSqlBaseTokenTypes.KEYWORD_CHARACTER;
		table[784] = PlSqlBaseTokenTypes.KEYWORD_BADFILE;
		table[690] = PlSqlBaseTokenTypes.KEYWORD_EXCEPTIONS;
		table[434] = PlSqlBaseTokenTypes.KEYWORD_DEF;
		table[728] = PlSqlBaseTokenTypes.KEYWORD_UNION;
		table[513] = PlSqlBaseTokenTypes.KEYWORD_DELETE;
		table[632] = PlSqlBaseTokenTypes.KEYWORD_BULK_ROWCOUNT;
		table[688] = PlSqlBaseTokenTypes.KEYWORD_DETERMINISTIC;
		table[605] = PlSqlBaseTokenTypes.KEYWORD_END;
		table[383] = PlSqlBaseTokenTypes.KEYWORD_TRIGGER;
		table[631] = PlSqlBaseTokenTypes.KEYWORD_ISOPEN;
		table[415] = PlSqlBaseTokenTypes.KEYWORD_RELY;
		table[485] = PlSqlBaseTokenTypes.KEYWORD_CACHE;
		table[595] = PlSqlBaseTokenTypes.KEYWORD_RETURN;
		table[471] = PlSqlBaseTokenTypes.KEYWORD_DICTIONARY;
		table[455] = PlSqlBaseTokenTypes.KEYWORD_BIGFILE;
		table[810] = PlSqlBaseTokenTypes.KEYWORD_UNSIGNED;
		table[769] = PlSqlBaseTokenTypes.KEYWORD_ACCESS;
		table[827] = PlSqlBaseTokenTypes.KEYWORD_TRANSFORMS;
		table[750] = PlSqlBaseTokenTypes.KEYWORD_CURRENT_TIMESTAMP;
		table[561] = PlSqlBaseTokenTypes.KEYWORD_DEGREE;
		table[379] = PlSqlBaseTokenTypes.KEYWORD_DIRECTORY;
		table[823] = PlSqlBaseTokenTypes.KEYWORD_TERMINATED;
		table[518] = PlSqlBaseTokenTypes.KEYWORD_OLD;
		table[567] = PlSqlBaseTokenTypes.KEYWORD_MINEXTENTS;
		table[507] = PlSqlBaseTokenTypes.KEYWORD_GRANT;
		table[761] = PlSqlBaseTokenTypes.KEYWORD_TRANSACTION;
		table[459] = PlSqlBaseTokenTypes.KEYWORD_UNDO;
		table[670] = PlSqlBaseTokenTypes.KEYWORD_NVARCHAR2;
		table[508] = PlSqlBaseTokenTypes.KEYWORD_RENAME;
		table[409] = PlSqlBaseTokenTypes.KEYWORD_ENABLE;
		table[822] = PlSqlBaseTokenTypes.KEYWORD_MASK;
		table[775] = PlSqlBaseTokenTypes.KEYWORD_LITTLE;
		table[420] = PlSqlBaseTokenTypes.KEYWORD_SHOW;
		table[790] = PlSqlBaseTokenTypes.KEYWORD_SKIP;
		table[526] = PlSqlBaseTokenTypes.KEYWORD_PRESERVE;
		table[367] = PlSqlBaseTokenTypes.KEYWORD_FUNCTION;
		table[559] = PlSqlBaseTokenTypes.KEYWORD_HEAP;
		table[457] = PlSqlBaseTokenTypes.KEYWORD_TABLESPACE;
		table[818] = PlSqlBaseTokenTypes.KEYWORD_ENCRYPTION;
		table[644] = PlSqlBaseTokenTypes.KEYWORD_POSITIVE;
		table[726] = PlSqlBaseTokenTypes.KEYWORD_WORK;
		table[554] = PlSqlBaseTokenTypes.KEYWORD_HASH;
		table[804] = PlSqlBaseTokenTypes.KEYWORD_VARCHARC;
		table[453] = PlSqlBaseTokenTypes.KEYWORD_GLOBAL;
		table[777] = PlSqlBaseTokenTypes.KEYWORD_MARK;
		table[531] = PlSqlBaseTokenTypes.KEYWORD_LOGGING;
		table[616] = PlSqlBaseTokenTypes.KEYWORD_FORALL;
		table[579] = PlSqlBaseTokenTypes.KEYWORD_RESTRICT;
		table[396] = PlSqlBaseTokenTypes.KEYWORD_DEFAULT;
		table[468] = PlSqlBaseTokenTypes.KEYWORD_MANAGEMENT;
		table[710] = PlSqlBaseTokenTypes.KEYWORD_DENSE_RANK;
		table[831] = PlSqlBaseTokenTypes.KEYWORD_CHARACTERS;
		table[563] = PlSqlBaseTokenTypes.KEYWORD_REJECT;
		table[454] = PlSqlBaseTokenTypes.KEYWORD_TEMPORARY;
		table[499] = PlSqlBaseTokenTypes.KEYWORD_SERVERERROR;
		table[591] = PlSqlBaseTokenTypes.KEYWORD_OBJECT;
		table[712] = PlSqlBaseTokenTypes.KEYWORD_MINUTE;
		table[763] = PlSqlBaseTokenTypes.KEYWORD_SHARE;
		table[489] = PlSqlBaseTokenTypes.KEYWORD_ORDER;
		table[745] = PlSqlBaseTokenTypes.KEYWORD_FULL;
		table[797] = PlSqlBaseTokenTypes.KEYWORD_LTRIM;
		table[629] = PlSqlBaseTokenTypes.KEYWORD_NOTFOUND;
		table[386] = PlSqlBaseTokenTypes.KEYWORD_WITH;
		table[417] = PlSqlBaseTokenTypes.KEYWORD_CHECK;
		table[623] = PlSqlBaseTokenTypes.KEYWORD_LOCK;
		table[752] = PlSqlBaseTokenTypes.KEYWORD_THE;
		table[427] = PlSqlBaseTokenTypes.KEYWORD_SQLERROR;
		table[666] = PlSqlBaseTokenTypes.KEYWORD_DECIMAL;
		table[447] = PlSqlBaseTokenTypes.KEYWORD_BEGIN;
		table[673] = PlSqlBaseTokenTypes.KEYWORD_BLOB;
		table[484] = PlSqlBaseTokenTypes.KEYWORD_NOCYCLE;
		table[743] = PlSqlBaseTokenTypes.KEYWORD_OUTER;
		table[430] = PlSqlBaseTokenTypes.KEYWORD_CONTINUE;
		table[511] = PlSqlBaseTokenTypes.KEYWORD_INSTEAD;
		table[473] = PlSqlBaseTokenTypes.KEYWORD_GUARANTEE;
		table[476] = PlSqlBaseTokenTypes.KEYWORD_GROUP;
		table[755] = PlSqlBaseTokenTypes.KEYWORD_FIRST;
		table[377] = PlSqlBaseTokenTypes.KEYWORD_USER;
		table[672] = PlSqlBaseTokenTypes.KEYWORD_ROWID;
		table[395] = PlSqlBaseTokenTypes.KEYWORD_STORAGE;
	}
}
