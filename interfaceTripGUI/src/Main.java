import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        JFrame f = new JFrame("trip");


        f.setContentPane(new trip().MainPanel);

        f.setVisible(true);


    }
}
