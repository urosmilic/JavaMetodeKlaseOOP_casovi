
public class Metode_2_Zbir {

    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        int zbir1 = zbir(x + y, x + x + y); // parametri se odvajaju zarezom
        int zbir2 = zbir(x, y);
        System.out.println(zbir1); // 18
        System.out.println(zbir2); // 9
        int zbir3 = zbir(x);
        System.out.println(zbir3);
    }

    public static int zbir(int a, int b) {
        // Definicija (POTPIS) metode:
        // 1. Tip izlazne vrednosti (int, boolean, char, String, Object...)
        // 2. Ime metode (case sentitive) zbir Zbir ZBIR
        // 3. Broj i tip ulaznih parametara
        int rezultat = a + b;
        return rezultat;
    }

    public static int zbir(int x) {
        int rezultat = x + x;

        return rezultat;
    }
}