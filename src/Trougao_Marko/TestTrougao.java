package Trougao_Marko;

public class TestTrougao {
    public static void main(String[] args) {
        JednakostranicniTrougao t1 = new JednakostranicniTrougao(3); //a = 3.0
        Pravougli t2 = new Pravougli(3,4,5);
        Jednakokraki t3 = new Jednakokraki(3,4);

        System.out.println("Obim jednakostranicnog trougla je: " + t1.obim());
        System.out.println("Povrsina jednakostranicnog trougla je: " + t1.povrsina());

        System.out.println("Obim pravouglog trougla je: " + t2.obim());
        System.out.println("Povrsina pravouglog trougla je: " + t2.povrsina());


        System.out.println("Obim jednakokrakog trougla je: " + t3.obim());
        System.out.println("Povrsina jednakokrakog trougla je: " + t3.povrsina());


    }
}