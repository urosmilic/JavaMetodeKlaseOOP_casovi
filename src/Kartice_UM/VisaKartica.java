package Kartice_UM;

public class VisaKartica extends PlatnaKartica {

    private String ime;
    private String prezime;

    public VisaKartica(double suma, String brojKartice, int mesec, int godina, String ime, String prezime) {
        super(suma, brojKartice, mesec, godina);
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void stampa () {
        System.out.println("Visa Card: " + super.getBrojKartice() + ", " + super.getMesec() + "/" + super.getGodina() + ", $" + super.getSuma());
    }

    public void izvrsiTransakciju (double isplata) {
        double provizija = isplata * 0.018;
        if (provizija < 4) {
            super.izvrsiTransakciju(isplata + 4);
        } else {
            super.izvrsiTransakciju(isplata + provizija);
        }
    }










}
