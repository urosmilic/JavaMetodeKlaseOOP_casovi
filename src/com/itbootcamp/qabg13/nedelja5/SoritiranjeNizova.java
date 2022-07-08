package com.itbootcamp.qabg13.nedelja5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SoritiranjeNizova {
    public static void main(String[] args) {
        /*
        int[] brojevi = {3, 100, -1, 200, 5, 444};
        System.out.println("===Pre sortiranja===");
        System.out.println(Arrays.toString(brojevi));
        Arrays.sort(brojevi);
        System.out.println("===Posle sortiranja===");
        System.out.println(Arrays.toString(brojevi));

        ArrayList<Integer> brojeviUListi = new ArrayList<>();
        brojeviUListi.add(1);
        brojeviUListi.add(-100);
        brojeviUListi.add(3);
        brojeviUListi.add(2);
        System.out.println("===Pre sortiranja liste===");
        System.out.println(brojeviUListi);
        Collections.sort(brojeviUListi);
        System.out.println("===Posle sortiranja liste===");
        System.out.println(brojeviUListi);
        ArrayList<String> omiljenaHrana = new ArrayList<>();
        omiljenaHrana.add("crvic");
        omiljenaHrana.add("hlebic");

         */
        ArrayList<String> omiljenaHrana = new ArrayList<>();
        omiljenaHrana.add("crvic");
        omiljenaHrana.add("hlebic");

        ArrayList<String> oraoHrana = new ArrayList<>();
        oraoHrana.add("golub");
        oraoHrana.add("kokoska");

        Orao orao = new Orao("orlic", 200.00, oraoHrana, 32);
        ArrayList<Ptica> neprijateljiVrabcu = new ArrayList<>();
        neprijateljiVrabcu.add(orao);

        Vrabac vrabcic = new Vrabac("vrabcic", 10.0, omiljenaHrana, neprijateljiVrabcu);


        ArrayList<Ptica> avijarium = new ArrayList<>();
        avijarium.add(vrabcic);
        avijarium.add(orao);
        avijarium.add(new Vrabac("pera", 20.00, omiljenaHrana, neprijateljiVrabcu));
        System.out.println("=== Pre sortiranja ptica");
        System.out.println(avijarium);
        Collections.sort(avijarium);
        System.out.println("=== Posle sortiranja ptica");
        System.out.println(avijarium);





    }



}
