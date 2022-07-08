package com.itbootcamp.qabg13.nedelja4.trouglovi;

import java.util.ArrayList;

public class TestTrougao {
    public static void main(String[] args) {

        JednakostranicniTrougao t1 = new JednakostranicniTrougao(3.0); //a = 3.0
        /*
        System.out.println("Obim: " + t1.obim());
        System.out.println("Povrsina: " + t1.povrsina());

        Jednakokraki t2 = new Jednakokraki(4, 10);
        System.out.println("Obim: " + t2.obim());
        System.out.println("Povrsina: " + t2.povrsina());

        Pravougli t3 = new Pravougli(3, 4, 5);
        System.out.println("Obim: " + t3.obim());
        System.out.println("Povrsina: " + t3.povrsina());

         */

        Trougao trougao = new JednakostranicniTrougao(2); // dete moze biti tip roditelja
        //JednakostranicniTrougao trouga1 = new Trougao(2, 3, 4); ne moze roditelj biti tipa dete

        Trougao t4 = new JednakostranicniTrougao(5);
        Trougao t5 = new Jednakokraki(5, 12);
        Trougao t6 = new Pravougli(3, 4, 5);
        Trougao t7 = new RaznostraniTrougao(4, 5, 10); // vraca NaN zato sto je iracionalan broj...


        //Trougao[] trogloviNiz = new Trougao[4]; ovo i ovo dole je slicno
        ArrayList<Trougao> trouglovi = new ArrayList<>();
        trouglovi.add(t1);
        trouglovi.add(t4);
        trouglovi.add(t5);
        trouglovi.add(t6);
        trouglovi.add(t7);
        //trouglovi.add(t7);

        // 'pojacani for' = enhanced for loop
        for (Trougao trougaoUnutarListeTrouglovi : trouglovi) {
            System.out.println("Obim je: " + trougaoUnutarListeTrouglovi.obim());
            System.out.println("Povrsina je: " + trougaoUnutarListeTrouglovi.povrsina()); //polimorfizam
        }


    }
}
