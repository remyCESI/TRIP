package view;

import javax.swing.*;
import java.awt.*;

public class truck {
    private JPanel panel1;
    private JTextArea queDeviennentVosDéchetsTextArea;

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
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        panel1.setBackground(new Color(-15843067));
        panel1.setEnabled(false);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel2.setBackground(new Color(-15843067));
        panel1.add(panel2, BorderLayout.NORTH);
        queDeviennentVosDéchetsTextArea = new JTextArea();
        queDeviennentVosDéchetsTextArea.setBackground(new Color(-15843067));
        Font queDeviennentVosDéchetsTextAreaFont = this.$$$getFont$$$(null, -1, 36, queDeviennentVosDéchetsTextArea.getFont());
        if (queDeviennentVosDéchetsTextAreaFont != null)
            queDeviennentVosDéchetsTextArea.setFont(queDeviennentVosDéchetsTextAreaFont);
        queDeviennentVosDéchetsTextArea.setForeground(new Color(-513));
        queDeviennentVosDéchetsTextArea.setText("Que deviennent vos déchets ?");
        panel2.add(queDeviennentVosDéchetsTextArea);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));
        panel3.setBackground(new Color(-15843067));
        panel3.setEnabled(true);
        panel1.add(panel3, BorderLayout.CENTER);
        final JLabel label1 = new JLabel();
        label1.setIcon(new ImageIcon(getClass().getResource("/banc.png")));
        label1.setText("");
        panel3.add(label1);
        final JLabel label2 = new JLabel();
        label2.setIcon(new ImageIcon(getClass().getResource("/cd.png")));
        label2.setText("");
        panel3.add(label2);
        final JLabel label3 = new JLabel();
        label3.setIcon(new ImageIcon(getClass().getResource("/ceintre.png")));
        label3.setText("");
        panel3.add(label3);
        final JLabel label4 = new JLabel();
        label4.setIcon(new ImageIcon(getClass().getResource("/pot.png")));
        label4.setText("");
        panel3.add(label4);
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
        return panel1;
    }
}
