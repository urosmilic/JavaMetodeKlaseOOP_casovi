public class Zadatak5_M {






    public static int apsolut(int broj) {
        //broj > 0, vrati samo broj
        // broj <= 0 vrati |-x| = x.. x * (-1).. -

        //if (broj < 0) return -broj;
        //   return broj; //broj * (-1)
        //ternarni operator
        return (broj < 0) /*uslov(condition)*/ ? /*ako je uslov tacan (prvo grananje*/ -broj : /*inace(2 grana)*/ broj;
    }









}
