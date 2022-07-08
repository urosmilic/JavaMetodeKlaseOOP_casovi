package com.itbootcamp.qabg13.nedelja5;

import java.util.ArrayList;

public class Orao extends Ptica implements Hrani, Leti, Pevaj {
    private int brojLovina;

    public Orao(String ime, double rasponKrila, ArrayList<String> omiljenaHrana, int brojLovina) {
        super(ime, rasponKrila, omiljenaHrana);
        this.brojLovina = brojLovina;
    }

    @Override
    public void hraniSe() {
        System.out.println("Orao jede manje ptice");
    }

    @Override
    public void leti() {
        System.out.println("Orao leti na visokim planinama");
    }

    @Override
    public void pevaj() {
        System.out.println("Orao peva?");
    }

//    @Override
//    public String toString() {
//        return super.toString() + "\nBroj lovina: " + brojLovina;
//
//    }
}
