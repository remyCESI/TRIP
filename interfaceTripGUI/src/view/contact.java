package view;

import javax.swing.*;
import java.awt.*;

public class contact {
    public JPanel MainPanel;
    private JLabel projectPresentation;
    private JTextPane tripMetEnPlaceTextPane;
    private JLabel contact;

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
        MainPanel = new JPanel();
        MainPanel.setLayout(new BorderLayout(0, 0));
        MainPanel.setInheritsPopupMenu(true);
        MainPanel.setMinimumSize(new Dimension(1008, 386));
        MainPanel.setOpaque(false);
        MainPanel.setPreferredSize(new Dimension(1008, 386));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setOpaque(false);
        MainPanel.add(panel1, BorderLayout.CENTER);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        panel2.setOpaque(false);
        panel1.add(panel2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        projectPresentation = new JLabel();
        projectPresentation.setAutoscrolls(false);
        projectPresentation.setBackground(new Color(-262657));
        Font projectPresentationFont = this.$$$getFont$$$("Arial", -1, 24, projectPresentation.getFont());
        if (projectPresentationFont != null) projectPresentation.setFont(projectPresentationFont);
        projectPresentation.setForeground(new Color(-262657));
        projectPresentation.setOpaque(false);
        projectPresentation.setText("Le projet TRIP");
        panel2.add(projectPresentation, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        tripMetEnPlaceTextPane = new JTextPane();
        tripMetEnPlaceTextPane.setBackground(new Color(-15843067));
        tripMetEnPlaceTextPane.setCaretColor(new Color(-15843067));
        tripMetEnPlaceTextPane.setEditable(false);
        Font tripMetEnPlaceTextPaneFont = this.$$$getFont$$$("Arial", -1, 20, tripMetEnPlaceTextPane.getFont());
        if (tripMetEnPlaceTextPaneFont != null) tripMetEnPlaceTextPane.setFont(tripMetEnPlaceTextPaneFont);
        tripMetEnPlaceTextPane.setForeground(new Color(-262657));
        tripMetEnPlaceTextPane.setMargin(new Insets(50, 50, 50, 50));
        tripMetEnPlaceTextPane.setOpaque(true);
        tripMetEnPlaceTextPane.setSelectedTextColor(new Color(-15843067));
        tripMetEnPlaceTextPane.setText("Trip met en place des solutions de traitements et d'analyses dans les entreprises pour les aider à réduire leur consommation de déchets : gobelets plastiques, papier, carton...  \n\nCette poubelle sensibilise les collaborateurs sur leur consommation de gobelets et leur fournit des informations sur le recyclage des déchets.\n\nVous avez une question ? Une remarque ? Une suggestion ? Un problème ? Contactez-nous !");
        panel1.add(tripMetEnPlaceTextPane, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel3.setOpaque(false);
        MainPanel.add(panel3, BorderLayout.SOUTH);
        contact = new JLabel();
        contact.setBackground(new Color(-918273));
        Font contactFont = this.$$$getFont$$$("Arial", -1, 24, contact.getFont());
        if (contactFont != null) contact.setFont(contactFont);
        contact.setForeground(new Color(-262657));
        contact.setOpaque(false);
        contact.setRequestFocusEnabled(false);
        contact.setText("Contact : ask@trip.fr");
        panel3.add(contact);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return MainPanel;
    }
}
