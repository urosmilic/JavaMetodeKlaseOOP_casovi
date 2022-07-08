package Automobil;

public class GlavnaKlasa2 {
    public static void main(String[] args) {

        Automobil a1 = new Automobil("Peugeot", "308", "dizel", 5, 2018);
        Automobil a2 = new Automobil("Peugeot", "207", "dizel", 5, 2009);
        Automobil a3 = new Automobil("Renault", "Megane", "dizel", 5, 2020);

        a1.Stampanje();
        a2.Stampanje();
        a3.Stampanje();
    }
}
