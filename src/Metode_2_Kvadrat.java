public class Metode_2_Kvadrat {

    public static void main(String[] args) {
        int broj = 4;
        int kvadratBroja = kvadrat(broj);
        System.out.println("ovo se ne menja " + broj);
        System.out.println("Kvadrat broja " + broj + " je " + kvadratBroja);
        //int broj2 = kvadrat(10);
    }

    public static int kvadrat(int number) {
        //System.out.println(broj); //?? kompajler ne zna sta je broj
        //number je kopija vrednosti koja se prosledjuje
        int kvadratBroja = number * number; // lokalna promeljiva kvadratBroja
        return kvadratBroja;
        //return 4; ne moze vise od 1 return iskaza
        //System.out.println("Ovo se nece izvrsiti");
    }
}