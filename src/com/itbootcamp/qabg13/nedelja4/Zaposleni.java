package com.itbootcamp.qabg13.nedelja4;

public class Zaposleni {
    private String ime; // protected - default modifikator pristupa
    private String prezime; // protected
    private double plata; // protected
    public static final/*ulgavnom je ovako*/ String IME_FIRME = "IT BOOTCAMP";
    public static double koeficijentMinulogRada = 5;
    private double brojCina = 10;

    public Zaposleni(String novoIme, String novoPrezime, double plata) {
        ime = novoIme; // moze ovako bez this
        prezime = novoPrezime; // moze i ovako sa this.
        this.plata = plata;
        //this.plata referira na privatno polje 'plata' klase Zaposleni,
        //a plata referira na lokalnu promenljivu kao parametar metode
    }

    static {
        System.out.println("-POCETAK ZIVOTA KLASE ");
        //koeficijentMinulogRada = 0.01;
    }

    //Geteri
    public String getIme() {
        return ime; // privatno polje 'ime'
    }

    public String getPrezime() {
        return this.prezime;
    }

    public double getPlata() {
        return this.plata;
    }

    //Seter
    public void setPlata(double novaPlata) {
        int slucajniDodatak = 100;
        this.plata = novaPlata + slucajniDodatak;
    }

    public double getBrojCina() {
        return brojCina;
    }

    public static double getKoeficijentMinulogRada() {
        return koeficijentMinulogRada;
    }

    private void zdravo() {
        System.out.println(ime);
    }

    public static void kaziZdravo() {
        System.out.println("Zdravo");
    }
}
