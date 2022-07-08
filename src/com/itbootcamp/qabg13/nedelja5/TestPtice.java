package com.itbootcamp.qabg13.nedelja5;

import java.util.ArrayList;

public class TestPtice {
    public static void main(String[] args) {
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

        /*
        vrabcic.leti();
        vrabcic.hraniSe();
        vrabcic.pevaj();

        orao.leti();
        orao.hraniSe();
        orao.pevaj();

         */
        /*
        System.out.println(vrabcic);
        System.out.println(orao);

         */

        ArrayList<Ptica> avijarium = new ArrayList<>();
        avijarium.add(vrabcic);
        avijarium.add(orao);

        for (Ptica p : avijarium) {
            System.out.println(p);
        }



    }
}
