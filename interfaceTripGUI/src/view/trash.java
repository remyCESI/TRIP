package view;

//import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class trash {


    //private JSONObject jsonObj;
    private JTextArea kirikouTextArea;
    private JPanel panel1;
    private HashMap<Integer, String> information = new HashMap<Integer, String>();

    public trash() {
        Random r = new Random();
        int result = r.nextInt(10);
        information.put(0, KgDechetAn());
        information.put(1, KgDechetEnTout());
        information.put(2, PourcentDechetRecycle());
        //information.put(3, NombreDechetParHabitant());
        information.put(4, PoubelleVert());
        information.put(5, PoubelleJaune());
        information.put(6, PoubelleBleu());
        information.put(7, PoubelleClassique());
        information.put(8, PoubellePile());
        information.put(9, PoubelleMultimedia());

        kirikouTextArea.append(information.get(result));

    }

    public void chooseRandom() {
        Random r = new Random();
        int result = r.nextInt();
        kirikouTextArea.append(information.get(result));
    }

    public String KgDechetAn() {
        return "La production mondiale de matières plastiques a atteint un niveau record \nde 320 millions de tonnes en 2015, soit l'équivalent de 10,1 t par seconde !";
    }

    public String KgDechetEnTout() {
        return "Selon une étude,\n9,1 milliards de tonnes de plastique ont été déjà produites \nPlus de la moitié de ce volume, \nsoit 5,4 milliards de tonnes, a fini dans l’environnement.";
    }

    public String PourcentDechetRecycle() {
        String result = "En 2017, seuls 30 % des déchets plastiques des Européens sont recyclés; \n39 % des déchets plastiques sont incinérés pour produire de l’énergie et 31 % finissent en décharge.";
        return result;
    }

    public String PoubelleVert() {
        return "Poubelle Verte : \nLe verre dans la poubelle verte (normal),\nil doit être nettoyé et on ne doit pas y mettre les couvercles de pot.\nDonc, pensez à passer de l’eau sur vos bocaux de sauce bolognaise.";
    }

    public String PoubelleJaune() {
        return "Poubelle Jaune : \nPlastique, cartons, canettes, conserves et le papier (si pas de poubelle bleue).\nVous pouvez garder les bouchons des bouteilles plastiques\nou les donner à une association caritative comme Bouchons d’amour.";
    }

    public String PoubelleBleu() {
        return "Poubelle Bleu : \nOn y met le papier, journaux, annuaires, prospectus.";
    }

    public String PoubelleClassique() {
        return "Poubelle classique : \nLe reste des déchets qui ne conviennent pas aux autres compartiments.";
    }

    public String PoubellePile() {
        return "Les piles, batteries et ampoules électriques \ndoivent aller dans des containers spéciaux que l’on trouve un peu partout, \ndans les supermarchés notamment (ou tout autre endroit qui vend ce type de produit).";
    }

    public String PoubelleMultimedia() {
        return "Les appareils multimédia (télévision, ordinateur) cartouches d’imprimantes vides (très polluantes) \npeuvent être collectés par Les ateliers du bocage », \nune association géré par Emmaüs et en partenariat avec la FNAC. \nSinon, ils peuvent être rapportés chez les commerçants (Darty ou autres).";
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
        panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-15843067));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-15843067));
        panel2.setEnabled(false);
        panel1.add(panel2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Label");
        panel2.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel3.setBackground(new Color(-15843067));
        panel3.setEnabled(true);
        panel1.add(panel3, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        kirikouTextArea = new JTextArea();
        kirikouTextArea.setBackground(new Color(-15843067));
        kirikouTextArea.setEditable(true);
        kirikouTextArea.setEnabled(false);
        Font kirikouTextAreaFont = this.$$$getFont$$$(null, -1, 20, kirikouTextArea.getFont());
        if (kirikouTextAreaFont != null) kirikouTextArea.setFont(kirikouTextAreaFont);
        kirikouTextArea.setRows(3);
        kirikouTextArea.setText("");
        kirikouTextArea.setWrapStyleWord(false);
        panel3.add(kirikouTextArea, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
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

    /*public String NombreDechetParHabitant() {
        int dechetParHabitant = 0;
        try {
            URL url = new URL("https://data.rennesmetropole.fr/api/records/1.0/search/?dataset=stats-collecte-dechets");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            System.out.println("Output from Server .... \n");
            String stringJson = "";
            String output;
            while ((output = br.readLine()) != null) {
                stringJson += output;
            }
            jsonObj = new JSONObject(stringJson);
            System.out.println(jsonObj.toString(1));
            //dechetParHabitant = jsonObj.getJSONObject("records").getJSONArray("9")
            dechetParHabitant = jsonObj.getJSONArray("records").getJSONObject(9).getJSONObject("fields").getInt("coll_dechets_ens_hab");
            System.out.println(dechetParHabitant);

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        String dechet = "En France chaque habitant rejette plus de " + dechetParHabitant + " kg de déchets par an, une quantité qui a doublé en 40 ans.";
        return dechet;
    }*/


}
