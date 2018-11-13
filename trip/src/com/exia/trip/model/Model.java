package com.exia.trip.model;

import java.io.*;
import java.util.Properties;

public class Model {

    private int cptCup;

    public Model(){
        EngineCom engine = EngineCom.getInstance();
        engine.ListenSocket(this);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\resultat.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                cptCup = Integer.parseInt(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void addCup(){
        this.cptCup += 1;
        System.out.println(cptCup);
        try {
            File ff = new File("D:\\resultat.txt");
            ff.createNewFile();
            FileWriter ffw = new FileWriter(ff);
            ffw.write(Integer.toString(cptCup));
            ffw.close();
        } catch (Exception e){

        }
    }

    public int getCptCup() {
        return cptCup;
    }

    public void setCptCup(int cpt_cup) {
        this.cptCup = cpt_cup;
    }
}
