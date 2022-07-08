package Klase;
//Zadatak 4 - Kreirati paket "Klase" i unutar tog paketa kreirati klasu "MainKlasa" i "Podaci".
// U klasi Podaci deklarisati ime, prezime, fakultet i prosecnu ocenu sa fakulteta.
// U klasi MainKlasa kreirati 3 objekta i odstampati podatke koje prosledjujete preko konstruktora u klasu Podaci.
//Klasa Podaci sadrzi i metodu za stampanje.

public class Podaci {
    String ime;             //nisam pisao public String ime; kao sto je pisao Dragoljub
    String prezime;         //nisam pisao public String prezime;
    String fakultet;        //nisam pisao public String fakultet;
    double prosecnaOcena;   //nisam pisao public String prosecnaOcena;

    public Podaci (String ime, String prezime, String fakultet, double prosecnaOcena) {

        this.ime = ime;
        this.prezime = prezime;
        this.fakultet = fakultet;
        this.prosecnaOcena = prosecnaOcena;
    }

    public void stampanje () {
        System.out.println("Student " + this.ime + " " + this.prezime + " je zavrsio " + this.fakultet + " sa prosecnom ocenom " + this.prosecnaOcena);
    }

}
