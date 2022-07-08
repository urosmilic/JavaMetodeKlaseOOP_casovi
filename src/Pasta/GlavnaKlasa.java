package Pasta;

public class GlavnaKlasa {

    public static void main(String[] args) {

        Sastojak s1 = new Sastojak("fusili",270);
        Sastojak s2 = new Sastojak("paradajz sos",300);
        Sastojak s3 = new Sastojak("junece meso",1200);
        Sastojak s4 = new Sastojak("mocarela",350);
        Sastojak s5 = new Sastojak("parmezan",250);

        Pasta p = new Pasta();

        p.dodajSastojak(s1);
        p.dodajSastojak(s2);
        p.dodajSastojak(s3);
        p.dodajSastojak(s4);
        p.obrisiSastojak(s4);
        p.dodajSastojak(s5);

        p.stampa();
    }
}
