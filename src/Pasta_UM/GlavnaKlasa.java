package Pasta_UM;
public class GlavnaKlasa {
    public static void main(String[] args) {

        Sastojak s1 = new Sastojak("makarone", 200.0);
        Sastojak s2 = new Sastojak("paradajz sos", 250.0);
        Sastojak s3 = new Sastojak("cedar sir", 300.0);
        Sastojak s4 = new Sastojak("parmezan", 300.0);
        Sastojak s5 = new Sastojak("junece meso", 900.0);



        Pasta p = new Pasta();

        p.dodajSastojak(s1);
        p.dodajSastojak(s2);
        p.dodajSastojak(s3);
        p.dodajSastojak(s3);
        p.dodajSastojak(s4);
        p.dodajSastojak(s5);
        p.stampa();
        System.out.println("------------------------");
        p.brisanjeSastojka(s3);
        p.stampa();
        System.out.println("------------------------");
        p.brisanjeSastojka2(350);
        p.stampa();
        System.out.println("------------------------");

        System.out.println(p.cenaPaste());

    }
}
