package com.deepsky.gui2;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import oracle.sql.ArrayDescriptor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TNSParamsPanel2 {

    public static final String TNS_NAMES_PANEL = "TNS_NAMES_PANEL";

    private JPanel rootPanel;
    private JTextField tnsnamesLocationText;
    private JButton browseLocationButton;
    private JButton openFileButton;
    private JComboBox networkAliasComboBox;


    private ActionListener openFileListener = null;
    private ActionListener chooseFileListener = null;
    private String pkFilePath;

    public TNSParamsPanel2() {
        rootPanel.putClientProperty(TNS_NAMES_PANEL, this);
        openFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (openFileListener != null) {
                    openFileListener.actionPerformed(e);
                }
            }
        });
        browseLocationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (chooseFileListener != null) {
                    chooseFileListener.actionPerformed(e);
                }
            }
        });
    }

    public void validate() throws ConnectionSettings4.ValidationException {
        if (networkAliasComboBox.getItemCount() == 0) {
            throw new ConnectionSettings4.ValidationException(networkAliasComboBox, "Network Alias must be specified");
        }
    }

    public void addOpenTnsFileListener(ActionListener actionListener) {
        this.openFileListener = actionListener;
    }

    public void addChooseTnsFileListener(ActionListener actionListener) {
        this.chooseFileListener = actionListener;
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public String getTnsFilePath() {
        return tnsnamesLocationText.getText();
    }

    public void setTnsFilePath(String path) {
        tnsnamesLocationText.setText(path);
    }

    public void removeAllItems() {
        networkAliasComboBox.removeAllItems();
    }

    public void addItem(ConnectionSettings4.NetServiceItem netServiceItem) {
        networkAliasComboBox.addItem(netServiceItem);
    }

    public int getItemCount() {
        return networkAliasComboBox.getItemCount();
    }

    public void setSelectedItem(String networkAlias) {
        for (int i = 0; i < networkAliasComboBox.getItemCount(); i++) {
            if (networkAliasComboBox.getItemAt(i).toString().equalsIgnoreCase(networkAlias)) {
                networkAliasComboBox.setSelectedItem(networkAliasComboBox.getItemAt(i));
                break;
            }
        }
    }

    public ConnectionSettings4.NetServiceItem getItemAt(int i) {
        return i < networkAliasComboBox.getItemCount() ?
                (ConnectionSettings4.NetServiceItem) networkAliasComboBox.getItemAt(i) :
                null;
    }

    public ConnectionSettings4.NetServiceItem getSelectedItem() {
        return (ConnectionSettings4.NetServiceItem) networkAliasComboBox.getSelectedItem();
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(3, 4, new Insets(0, 0, 0, 0), -1, -1));
        rootPanel.add(panel1, new GridConstraints(1, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Network Alias");
        panel1.add(label1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Location of tnsnames.ora ");
        panel1.add(label2, new GridConstraints(2, 0, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        tnsnamesLocationText = new JTextField();
        panel1.add(tnsnamesLocationText, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        browseLocationButton = new JButton();
        browseLocationButton.setIcon(new ImageIcon(getClass().getResource("/icons/menu-open.png")));
        browseLocationButton.setText("");
        panel1.add(browseLocationButton, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        openFileButton = new JButton();
        openFileButton.setIcon(new ImageIcon(getClass().getResource("/icons/preview.png")));
        openFileButton.setText("");
        panel1.add(openFileButton, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        networkAliasComboBox = new JComboBox();
        panel1.add(networkAliasComboBox, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        rootPanel.add(spacer1, new GridConstraints(0, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        rootPanel.add(spacer2, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
