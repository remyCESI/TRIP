package main;

import model.Model;
import view.trip;
import view.tripView;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        Model appTrip = new Model();

        tripView view = new tripView(appTrip);


    }
}
