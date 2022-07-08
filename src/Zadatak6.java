import java.util.Scanner;

public class Zadatak6 {
    //Zadatak2:
    //napraviti metodu `int stepen(int broj, int n)`
    //input: int broj, int n
    //output: broj "na" n, odnosno, broj^n
    //primer: stepen(2, 3) -> 8, stepen(4, 3) -> 64, stepen(0, 2) -> 0, stepen(3, 0) -> 1, stepen(-1, 3) -> -

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite neki broj: ");
        int broj = s.nextInt();
        System.out.println("Unesite zeljeni stepen: ");
        int stepenBroja = s.nextInt();
        System.out.println("Broj " + broj + " stepenovan na " + stepenBroja + " iznosi " + stepen(broj,stepenBroja));
    }

    public static  int stepen (int broj, int n) {
        int brojNaStepen = 1;
        for (int i = 1; i<=n; i++){
            brojNaStepen *= broj;
        }
        //int brojNaStepen = (int)Math.pow(broj, n);   //laksi nacin
        return brojNaStepen;
    }

}
