package com.exia.trip.model;

public class Model {

    private int cptCup;

    public Model(){
        EngineCom engine = EngineCom.getInstance();
        engine.ListenSocket(this);
    }

    public void addCup(){
        this.cptCup += 1;
        System.out.println(this.cptCup);
    }

    public int getCptCup() {
        return cptCup;
    }

    public void setCptCup(int cpt_cup) {
        this.cptCup = cpt_cup;
    }
}
