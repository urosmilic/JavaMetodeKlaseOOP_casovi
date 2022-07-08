package UrosMilic_16_05_2022_z2;

public class MainKlasa {
    // Napraviti klasu Proizvod koja sadrzi:
    // naziv, cenu i rok trajanja
    // Napisati metodu koja stampa proizvod, i konstruktor kojem se prosledjuju ova 3 atributa.
    // U main metodi napraviti 3 proizvoda i ispisati ih
    public static void main(String[] args) {

        Proizvod p1 = new Proizvod("Mleko", 110.99, "02.06.2022. godine.");
        Proizvod p2 = new Proizvod("Hleb", 89.49, "20.05.2022. godine.");
        Proizvod p3 = new Proizvod("Jogurt", 120.99, "30.05.2022. godine.");

        p1.stampa();
        p2.stampa();
        p3.stampa();





    }
}
