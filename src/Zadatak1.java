public class Zadatak1 {
    //Napisati funkciju koja vraca zbir dva broja.
    //pozvite metodu u main-u barem 3 puta

    public static void main(String[] args) {
        zbir(5,4);
        System.out.println("Zbir brojeva 9 i 10 je " + zbir(9,10));
        System.out.println("Zbir brojeva 8 i 7 je " + zbir(8,7));
        System.out.println("Zbir brojeva -5 i 6 je " + zbir(-5,6));

        imena("Dusan", "Petar");

    }
    public static int zbir (int x, int y) {
        int zbirbrojeva = x + y;
        return zbirbrojeva;
    }

    public static void imena (String ime1, String ime2) {
        System.out.println("Ime prvog korisnika je " + ime1);
        System.out.println("Ime drugog korisnika je " + ime2);

    }






}
