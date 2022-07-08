package com.itbootcamp.qabg13.nedelja5;

import java.util.ArrayList;

public class Vrabac extends Ptica implements Hrani, Leti, Pevaj {
    private ArrayList<Ptica> neprijatelji;

    public Vrabac(String ime, double rasponKrila, ArrayList<String> omiljenaHrana, ArrayList<Ptica> neprijatelji) {
        super(ime, rasponKrila, omiljenaHrana);
        this.neprijatelji = neprijatelji;
    }

    @Override
    public void hraniSe() {
        //System.out.println("Vrabac jede... " + omiljenaHrana.get((int) (Math.random() * omiljenaHrana.size() - 1) * 2));
        System.out.println("Vrabac jede crva...");
    }

    public void leti() {
        System.out.println("leti vrabac...");
    }


    @Override
    public void pevaj() {
        System.out.println("Ciju ciju ci!!!");
    }

//    @Override
//    public String toString() {
//        return super.toString() + "\nNeprijatelji: " + neprijatelji;
//    }
}
