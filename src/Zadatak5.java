import java.util.Scanner;

public class Zadatak5 {

    //napraviti metodu int apsolut(int broj)
    //input: int broj
    //output: int apsolutBroj
    //primer: apsolut(5) -> 5, apsolut(-5) -> 5, apsolut(0) -> 0

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite neki broj: ");
        int nekiBroj = s.nextInt();
        apsolutno(nekiBroj);
        System.out.println("Apsolutna vrednost toj broja je: " + apsolutno(nekiBroj));

    }

    public static int apsolutno (int broj) {
        int apsolutniBroj = 1;
        if (broj < 0) {
            apsolutniBroj = broj * (-1);
        } else {
            apsolutniBroj = broj;
        }

        //int apsolutniBroj = Math.abs(broj);  //drugi i laksi nacin
        return apsolutniBroj;
    }





}
