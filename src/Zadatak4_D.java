import java.util.Scanner;
public class Zadatak4_D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite string ");
        System.out.println("Broj samoglasnika je " + brojSamoglasnika(sc.next()));

    }

    public static int brojSamoglasnika(String rec) {
        String[] nizKaraktera = rec.split("");
        int brojSamoglasnika = 0;
        for (int i = 0; i < nizKaraktera.length; i++) {
            if (nizKaraktera[i].equalsIgnoreCase("a") ||
                    nizKaraktera[i].equalsIgnoreCase("e") ||
                    nizKaraktera[i].equalsIgnoreCase("i") ||
                    nizKaraktera[i].equalsIgnoreCase("o") ||
                    nizKaraktera[i].equalsIgnoreCase("u"))
                brojSamoglasnika++;
        }

        return brojSamoglasnika;
    }
}