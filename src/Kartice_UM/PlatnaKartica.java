package Kartice_UM;

public class PlatnaKartica {
    private double suma;
    //7105-1579-5191-6184, 11/2024, $212
    private String brojKartice;
    private int mesec;
    private int godina;

    public PlatnaKartica(double suma, String brojKartice, int mesec, int godina) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.mesec = mesec;
        this.godina = godina;
    }
    public void dodajSredstva (double uplata) {
        this.suma += uplata;
    }

    public void izvrsiTransakciju (double isplata) {
        this.suma -= isplata;
    }

    public void stampa () {
        System.out.println(this.brojKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
    }
    public double getSuma() {
        return suma;
    }
    public String getBrojKartice() {
        return brojKartice;
    }
    public int getMesec() {
        return mesec;
    }
    public int getGodina() {
        return godina;
    }





}
