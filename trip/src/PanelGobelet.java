import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class  PanelGobelet extends JPanel {

    public void paintComponent(Graphics g){


        try {

            Image img = ImageIO.read(new File("Gobelet.png"));



            //Pour une image de fond

            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

        } catch (IOException e) {

            e.printStackTrace();

        }





    }
}
