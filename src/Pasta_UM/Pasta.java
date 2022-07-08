package Pasta_UM;

import java.util.ArrayList;
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din
public class Pasta {
    private ArrayList<Sastojak> listaSastojaka;
    public Pasta () {
        this.listaSastojaka = new ArrayList<>();
    }
    public void dodajSastojak (Sastojak s) {
        listaSastojaka.add(s);
    }
    public void brisanjeSastojka (Sastojak s) {
        listaSastojaka.remove(s);
    }

    public void brisanjeSastojka2 (double cena) {
        for (int i = 0; i < listaSastojaka.size(); i++) {
            if (listaSastojaka.get(i).getCena() == cena) {
                listaSastojaka.remove(i);
            }
        }
    }

    public Double cenaPaste () {
        double suma = 0;
        for (int i = 0; i < listaSastojaka.size(); i++) {
            suma += listaSastojaka.get(i).getCena();
        }
        return suma;
    }
    public void stampa () {
        System.out.println("Pasta je sa sastojcima:");
        for (int i = 0; i < listaSastojaka.size(); i++) {
            System.out.println(listaSastojaka.get(i).getNaziv() + " - " + listaSastojaka.get(i).getCena() + ".din");
        }
        System.out.println("Cena paste je " + this.cenaPaste() + ".din");
    }
}
