package Zivotinje;

public class Patka extends Zivotinje {
    private int brojKrila;

    public Patka(String ime, String omiljenoJelo, double prosecnaStarost, int brojKrila) {
        super(ime, omiljenoJelo, prosecnaStarost);
        this.brojKrila = brojKrila;
    }


    public void jedi () {
        System.out.println("Patka kljuca travu!");
    }

    public void proizvodiZvuk () {
        System.out.println("Patka guguce!");
    }

    public int getBrojKrila() {
        return brojKrila;
    }

    public void setBrojKrila(int brojKrila) {
        this.brojKrila = brojKrila;
    }
}

