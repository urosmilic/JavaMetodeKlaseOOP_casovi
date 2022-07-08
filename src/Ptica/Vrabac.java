package Ptica;
import java.util.ArrayList;

public class Vrabac {
    private String ime;
    private double rasponKrila = 0.0;
    ArrayList<String> omiljenaHrana = new ArrayList<>();

    public Vrabac(String ime, double rasponKrila, ArrayList<String> omiljenaHrana) {
        this.ime = ime;
        this.rasponKrila = rasponKrila;
        this.omiljenaHrana = omiljenaHrana;
    }

    @Override
    public String toString() {
        //return "Cao ja sam vrabac";
        return "Ime: " + this.ime + "\nRaspon krila: " + this.rasponKrila + "\nOmiljena hrana: " + this.omiljenaHrana;
    }



}
