import java.util.ArrayList;
import java.util.Scanner;

public class UrosMilic_16_05_2022_z1 {
    //Napisati metodu koja vraca ArrayList-u vasih omiljenih zivotinja, unos vrsiti preko Scanner-a.
    //Napraviti drugu metodu koja stampa sadrzaj liste. Napraviti metodu
    //public static ArrayList<String> dodaj(ArrayList<String> listaZaDodavanje, String nazivZivotinije)
    //koja dodaje datu zivotinju u listu.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList <String> listaZivotinja = new ArrayList<>();
        System.out.print("Unesite broj zivotinja: ");
        int brojZivotinja = s.nextInt();
        s.nextLine();

        String zivotinja;
        for (int i = 0; i < brojZivotinja; i++) {
            System.out.print("Unesite naziv zivotinje: ");
            zivotinja = s.nextLine();

            dodaj(listaZivotinja,zivotinja);
        }
        stampa(listaZivotinja);
    }
    public static ArrayList<String> dodaj (ArrayList<String> listaZaDodavanje, String nazivZivotinje) {
        listaZaDodavanje.add(nazivZivotinje);
        return listaZaDodavanje;
    }
    public static void stampa (ArrayList konacnaLista) {
        for (int i = 0; i < konacnaLista.size(); i++) {
            System.out.println(konacnaLista.get(i));
        }
    }
}
