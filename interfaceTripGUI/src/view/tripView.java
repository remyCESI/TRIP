package view;

import contracts.IObservable;

import javax.swing.*;

public class tripView {

    public tripView(IObservable model){

        JFrame f = new JFrame("trip");
        trip ihm = new trip();
        ihm.initIHM(model, f);
        f.setSize(1024,600);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setContentPane(ihm.MainPanel);
        f.setVisible(true);
    }
}
