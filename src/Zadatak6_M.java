public class Zadatak6_M {

    public static int apsolut(int broj) {
        //broj > 0, vrati samo broj
        // broj <= 0 vrati |-x| = x.. x * (-1).. -

        //if (broj < 0) return -broj;
        //   return broj; //broj * (-1)
        //ternarni operator
        return (broj < 0) /*uslov(condition)*/ ? /*ako je uslov tacan (prvo grananje*/ -broj : /*inace(2 grana)*/ broj;
    }


    public static int stepen(int broj, int n) {
        int stepenovaniBroj = 1;

        for (int i = 0; i < n; i++) {
            //broj pomnozi sa samim sobom n puta
            stepenovaniBroj = stepenovaniBroj * broj;
        }
        return stepenovaniBroj;
    }


    public static double stepen2(int broj, int n) { // n^-m = 1 / n^m, 2^-3 = 1/2^3 ....
        int stepenovaniBroj = 1;
        for (int i = 0; i < apsolut(n); i++) {
            //broj pomnozi sa samim sobom n puta
            stepenovaniBroj = stepenovaniBroj * broj;
        }

        if (n >= 0) {
            return stepenovaniBroj;
        }

        return (double) 1 / stepenovaniBroj;
    }











}
