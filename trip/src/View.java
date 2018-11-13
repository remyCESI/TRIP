import com.exia.trip.model.Model;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;


public class View extends Model {

    public void init(){


    JFrame Home = new JFrame();
    Panel pan = new Panel();
    PanelImage logo = new PanelImage();
    PanelGobelet Gobelet = new PanelGobelet();



//ContactB

        JButton ContactB = new JButton(new ImageIcon("D:\\EXIA\\innovaion\\alex\\trip\\phone.png"));
        JButton HomeB = new JButton(new ImageIcon("D:\\EXIA\\innovaion\\alex\\trip\\home.png"));
        JButton TravelB = new JButton(new ImageIcon("D:\\EXIA\\innovaion\\alex\\trip\\truck.png"));
        JButton WasteB = new JButton(new ImageIcon("D:\\EXIA\\innovaion\\alex\\trip\\waste.png"));
        JLabel numGob = new JLabel();
        Color jauneT = new Color(230,232,91);


    // parameters panel background
        pan.setSize(Home.getWidth(),Home.getHeight());
        pan.setLayout(null);

        //button

        ContactB.setBackground(jauneT);
        HomeB.setBackground(jauneT);
        TravelB.setBackground(jauneT);
        WasteB.setBackground(jauneT);


        ContactB.setFocusPainted(false);
        HomeB.setFocusPainted(false);
        TravelB.setFocusPainted(false);
        WasteB.setFocusPainted(false);



        //parameters's frame


        Home.setTitle("Home");
        Home.setSize(1831, 1028);

        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Home.add(pan);


        numGob.setBounds(700, 100, 500, 500);
        ContactB.setBounds(600, 700, 80,35);
        HomeB.setBounds(700, 700, 80,35);
        TravelB.setBounds(800, 700, 80,35);
        WasteB.setBounds(900, 700, 80,35);
        logo.setBounds(680, 580, 245, 141);
        Gobelet.setBounds(1080, 200, 247, 290);


        Font font = new Font("Arial", Font.BOLD, 200); //set font for the label
        numGob.setFont(font); //apply the font to JLabel
        numGob.setForeground(Color.WHITE); //set color of JPanel text


        int gob = getCptCup();
        numGob.setText(Integer.toString(gob));


        pan.add(numGob);
        pan.add(ContactB);
        pan.add(HomeB);
        pan.add(TravelB);
        pan.add(WasteB);
        pan.add(logo);
        pan.add(Gobelet);

        Home.setVisible(true);
    }
}
