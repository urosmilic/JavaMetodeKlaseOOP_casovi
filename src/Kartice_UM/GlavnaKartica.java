package Kartice_UM;
//Napraviti paket Kartice koji ce u sebi imati 4 klase. GlavnaKlasa, PlatnaKartica, MasterKartica i VisaKartica.
// MasterKartica i VisaKartica nasledjuju PlatnaKartica klasu. Svi atributi su PRIVATE u klasama.
// U PlatnaKartica klasi imamo atribute mesec, godina, broj kartice i suma.
public class GlavnaKartica {

    public static void main(String[] args) {

        PlatnaKartica p = new PlatnaKartica(2000,"7455-552-455-286", 11,24);
        PlatnaKartica v = new VisaKartica(1000,"7455-552-455-286", 11,24, "Uros", "Milic");
        PlatnaKartica m = new MasterKartica(1000,"7455-552-455-286", 11,24);

       v.izvrsiTransakciju(100);
       v.stampa();

       m.izvrsiTransakciju(100);

       m.stampa();













    }
}
