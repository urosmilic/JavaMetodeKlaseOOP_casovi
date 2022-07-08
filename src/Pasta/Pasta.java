package Pasta;

import java.util.ArrayList;

//Kreirati klasu Pasta koja ima:
//listu sastojaka
//metodu dodavanja sastojaka
//metodu za brisanje sastojaka. U metodu se salje naziv sastojka koji se brise
//defaultni konstruktor
//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din
public class Pasta {
    private ArrayList <Sastojak> listaSastojaka;
    public Pasta() {
        this.listaSastojaka = new ArrayList<>();
    }
    public void dodajSastojak (Sastojak s) {
        listaSastojaka.add(s);
    }
    public void obrisiSastojak (Sastojak s) {
        listaSastojaka.remove(s);
    }
    public double cenaPaste () {
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
        System.out.println("Cena paste je " + cenaPaste() + ".din");
    }
}

