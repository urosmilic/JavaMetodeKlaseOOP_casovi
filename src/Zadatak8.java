public class Zadatak8 {
    //Zadatak4:
    //napraviti metodu `boolean palindrom(String s)`
    //input: String s
    //output: boolean isPalindrom
    //primer: palindrom("cao") -> false, palindrom("anavolimilovana") -> true
    public static void main(String[] args) {
        System.out.println(palindrom("anavolimilovana"));
    }
    public static boolean palindrom (String rec) {
        String [] nizOdRecenice = rec.split("");
        int i;
        int j;
        boolean pali = false;
        int tacnost = 0;
        for (i = 0, j = nizOdRecenice.length - 1; (i <= nizOdRecenice.length - 1) && (j >= 0); i++, j--) {
            if (nizOdRecenice[i].equals(nizOdRecenice[j])) {
                //pali = true;
                tacnost++;
            }                                 //new StringBuilder(hi).reverse().toString() - metoda za brze i lakse
        }
        if (tacnost == nizOdRecenice.length)  {
            pali = true;
        }
        return pali;
    }
}
