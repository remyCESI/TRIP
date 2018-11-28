package view;

import contracts.IObservable;
import contracts.IObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trip implements IObserver {

    private JButton homeButton;
    public JPanel MainPanel;
    private JPanel ButtonP;
    private JPanel LogoP;
    private JPanel BottomPanel;
    private JPanel CenterPanel;
    private JLabel Gobelet;
    private JLabel Compteur;
    private JLabel Logo;
    private JButton phoneBtn;
    private JButton trashBtn;
    private JButton truckBtn;
    private JTextArea leSaviezVousVousTextArea;
    private JTextArea Objectif;

    //Object to observe
    private IObservable model;

    private JFrame frame;

    //Current view on display
    private JPanel currentPanel;

    //Panels bind to view of ihm
    private JPanel contactPanel;

    //Panels bind to view of ihm
    private JPanel trashPanel;

    // Panels bind to view of ihm
    private JPanel truckPanel;

    public trip() {
        phoneBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayPanel(contactPanel);
            }
        });
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayPanel(CenterPanel);
            }
        });
        truckBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayPanel(truckPanel);
            }
        });
        trashBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel trashPanel = (JPanel) new trash().$$$getRootComponent$$$();
                displayPanel(trashPanel);

            }
        });
    }

    private void displayPanel(JPanel newPanel) {

        this.MainPanel.remove(currentPanel);
        this.MainPanel.add(newPanel, BorderLayout.CENTER);
        currentPanel = newPanel;

        this.frame.revalidate();
        this.MainPanel.repaint();
    }

    //Set the subject (object observe)
    public void initIHM(IObservable model, JFrame frame) {
        this.model = model;
        model.register(this);
        this.frame = frame;
        this.currentPanel = this.CenterPanel;
        this.contactPanel = (JPanel) new contact().$$$getRootComponent$$$();
        this.trashPanel = (JPanel) new trash().$$$getRootComponent$$$();
        this.truckPanel = (JPanel) new truck().$$$getRootComponent$$$();
    }


    @Override
    public void update() {
        this.Compteur.setText(this.model.getUpdate(this).toString());
    }

    @Override
    public void setObservable(IObservable obj) {

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
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
        MainPanel = new JPanel();
        MainPanel.setLayout(new BorderLayout(0, 0));
        MainPanel.setBackground(new Color(-15843067));
        MainPanel.setOpaque(true);
        BottomPanel = new JPanel();
        BottomPanel.setLayout(new BorderLayout(0, 0));
        BottomPanel.setOpaque(false);
        MainPanel.add(BottomPanel, BorderLayout.SOUTH);
        ButtonP = new JPanel();
        ButtonP.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 5));
        ButtonP.setOpaque(false);
        ButtonP.setPreferredSize(new Dimension(1000, 50));
        BottomPanel.add(ButtonP, BorderLayout.SOUTH);
        homeButton = new JButton();
        homeButton.setBackground(new Color(-660643));
        homeButton.setBorderPainted(true);
        homeButton.setContentAreaFilled(true);
        homeButton.setDoubleBuffered(false);
        homeButton.setFocusPainted(false);
        homeButton.setFocusable(false);
        homeButton.setForeground(new Color(-660643));
        homeButton.setHideActionText(false);
        homeButton.setIcon(new ImageIcon(getClass().getResource("/home.png")));
        homeButton.setInheritsPopupMenu(false);
        homeButton.setMaximumSize(new Dimension(99, 30));
        homeButton.setMinimumSize(new Dimension(99, 30));
        homeButton.setOpaque(true);
        homeButton.setPreferredSize(new Dimension(88, 40));
        homeButton.setText("");
        homeButton.setVerifyInputWhenFocusTarget(true);
        ButtonP.add(homeButton);
        phoneBtn = new JButton();
        phoneBtn.setAutoscrolls(false);
        phoneBtn.setBackground(new Color(-660643));
        phoneBtn.setBorderPainted(true);
        phoneBtn.setIcon(new ImageIcon(getClass().getResource("/phone.png")));
        phoneBtn.setPreferredSize(new Dimension(88, 40));
        phoneBtn.setText("");
        ButtonP.add(phoneBtn);
        trashBtn = new JButton();
        trashBtn.setBackground(new Color(-660643));
        trashBtn.setIcon(new ImageIcon(getClass().getResource("/waste.png")));
        trashBtn.setPreferredSize(new Dimension(88, 40));
        trashBtn.setText("");
        ButtonP.add(trashBtn);
        truckBtn = new JButton();
        truckBtn.setBackground(new Color(-660643));
        truckBtn.setBorderPainted(true);
        truckBtn.setIcon(new ImageIcon(getClass().getResource("/truck.png")));
        truckBtn.setPreferredSize(new Dimension(88, 40));
        truckBtn.setText("");
        ButtonP.add(truckBtn);
        LogoP = new JPanel();
        LogoP.setLayout(new BorderLayout(0, 0));
        LogoP.setOpaque(false);
        BottomPanel.add(LogoP, BorderLayout.CENTER);
        Logo = new JLabel();
        Logo.setForeground(new Color(-1));
        Logo.setHorizontalAlignment(0);
        Logo.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
        Logo.setPreferredSize(new Dimension(200, 125));
        Logo.setText("");
        LogoP.add(Logo, BorderLayout.CENTER);
        CenterPanel = new JPanel();
        CenterPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        CenterPanel.setEnabled(true);
        CenterPanel.setOpaque(false);
        CenterPanel.setVisible(true);
        MainPanel.add(CenterPanel, BorderLayout.CENTER);
        leSaviezVousVousTextArea = new JTextArea();
        Font leSaviezVousVousTextAreaFont = this.$$$getFont$$$("Arial", -1, 14, leSaviezVousVousTextArea.getFont());
        if (leSaviezVousVousTextAreaFont != null) leSaviezVousVousTextArea.setFont(leSaviezVousVousTextAreaFont);
        leSaviezVousVousTextArea.setForeground(new Color(-918273));
        leSaviezVousVousTextArea.setOpaque(false);
        leSaviezVousVousTextArea.setText("Le saviez-vous ?\n\nVous pouvez utiliser votre mug dans la machine à café.\nPlacer le simplement à l'endroit prévu et choisissez votre boisson, facile !");
        CenterPanel.add(leSaviezVousVousTextArea, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(200, 50), null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 3, new Insets(30, 10, 0, 10), -1, -1));
        panel1.setOpaque(false);
        CenterPanel.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(200, -1), null, 0, false));
        Gobelet = new JLabel();
        Gobelet.setHorizontalAlignment(11);
        Gobelet.setIcon(new ImageIcon(getClass().getResource("/Gobelet.png")));
        Gobelet.setIconTextGap(5);
        Gobelet.setOpaque(false);
        Gobelet.setText("");
        Gobelet.setVisible(true);
        panel1.add(Gobelet, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 3, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        Objectif = new JTextArea();
        Objectif.setEditable(false);
        Font ObjectifFont = this.$$$getFont$$$("Arial", -1, 36, Objectif.getFont());
        if (ObjectifFont != null) Objectif.setFont(ObjectifFont);
        Objectif.setForeground(new Color(-918273));
        Objectif.setOpaque(false);
        Objectif.setText("gobelets jetés sur 200 gobelets");
        panel1.add(Objectif, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(200, 50), null, 0, false));
        Compteur = new JLabel();
        Font CompteurFont = this.$$$getFont$$$("Arial", -1, 72, Compteur.getFont());
        if (CompteurFont != null) Compteur.setFont(CompteurFont);
        Compteur.setForeground(new Color(-1));
        Compteur.setOpaque(false);
        Compteur.setText("0");
        panel1.add(Compteur, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
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
