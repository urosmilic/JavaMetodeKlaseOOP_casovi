import java.util.Arrays;

public class Zadatak9 {
    //Zadatak5:
    //napraviti metodu `int[] presekNiza(int[] a, int[] b)`
    //input: int[] a, int[] b
    //output: int[] presek
    //primer: presekNiza(new int[]{1,2,3,4,5}, new int[]{1,4,3,8,5,10}) -> new int[] {1,3,5}
    //			presekNiza(new int[]{1, 3, 5}, new int[]{2,4,6}) -> {}

    public static void main(String[] args) {

        int [] nizA = {1,2,3,4,5};
        int [] nizB = {9,4,3,10,2};

        System.out.println(Arrays.toString(presekNiza(nizA, nizB)));

    }

    public static int[] presekNiza(int[] a, int[] b) {

        int [] nizP = new int [a.length];

        int i;
        int j;
        int k = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (a[i] == b[j]) {
                    nizP[k] = a[i];
                    k++;
                }
            }
        }

        return nizP;





    }





}