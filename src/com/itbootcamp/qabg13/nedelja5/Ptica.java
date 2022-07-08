package com.itbootcamp.qabg13.nedelja5;

import java.util.ArrayList;

public abstract class Ptica implements Comparable {
     public String ime;
     public double rasponKrila;
     public ArrayList<String> omiljenaHrana;

    public Ptica(String ime, double rasponKrila, ArrayList<String> omiljenaHrana) {
        this.ime = ime;
        this.rasponKrila = rasponKrila;
        this.omiljenaHrana = omiljenaHrana;
    }


    public String getIme() {
        return ime;
    }

    public double getRasponKrila() {
        return rasponKrila;
    }

    public ArrayList<String> getOmiljenaHrana() {
        return omiljenaHrana;
    }

    @Override
    public String toString() {
        //return "Cao ja sam vrabac";
        return "\nIme: " + this.ime + "\nRaspon krila: " + this.rasponKrila + "\nOmiljena hrana: " + this.omiljenaHrana;
    }

    @Override
    public int compareTo(Object drugaPtica) {
        Ptica p = (Ptica) drugaPtica;
        return (int) (this.rasponKrila - p.rasponKrila);
    }
}
