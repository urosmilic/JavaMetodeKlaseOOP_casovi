import java.util.Arrays;
import java.util.Scanner;

public class UrosMilic_13_05_2022 {
    //Napisati funkciju koja od korisnika prikuplja njegove najdraze pesme, kao rezultat vrtatiti niz tih
    //pesama (niz String-ova). Od korisnika najpre traziti koliko pesama zeli da unese.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       System.out.println("Unesite broj pesama: ");
        int brojPesama = s.nextInt();
        s.nextLine();

        System.out.println("Unesite naziv pesme: ");
        String svePesme = s.nextLine();

        for (int i = 1; i < brojPesama ; i++) {
            System.out.println("Unesite naziv pesme: ");
            String pesma = s.nextLine();

            svePesme = svePesme + "-" + pesma;
        }

        System.out.println(Arrays.toString(nizPesama(svePesme)));

    }

    public static String [] nizPesama (String Pesme) {
        String [] nizPesama = Pesme.split("-");
        return nizPesama;
    }

}
