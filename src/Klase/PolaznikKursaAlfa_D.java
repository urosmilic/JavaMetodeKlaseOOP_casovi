package Klase;

public class PolaznikKursaAlfa_D {
    public String ime; //Atributi
    public String prezime;
    public int ocena;

    public PolaznikKursaAlfa_D(String ime, String prezime, int ocena) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocena = ocena;
    }

    public void stampanje() {
        System.out.println("Polaznik " + this.ime + " " + this.prezime + " ima ocenu " + this.ocena);
    }


}
