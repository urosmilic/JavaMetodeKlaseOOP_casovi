package Filmovi_JR;

public class Film {

    private int godinaIzlaska;
    private double zarada;
    private String zanr;

    private String nazivFilma;

    public Film(int godinaIzlaska, double zarada, String zanr, String nazivFilma) {
        this.godinaIzlaska = godinaIzlaska;
        this.zarada = zarada;
        this.zanr = zanr;
        this.nazivFilma = nazivFilma;
    }

    public void snimanje () {
        System.out.println("Paznja, Film se snima!");
    }

    public int getGodinaIzlaska() {
        return godinaIzlaska;
    }

    public double getZarada() {
        return zarada;
    }

    public String getZanr() {
        return zanr;
    }

    public String getNazivFilma() {
        return nazivFilma;
    }
}
