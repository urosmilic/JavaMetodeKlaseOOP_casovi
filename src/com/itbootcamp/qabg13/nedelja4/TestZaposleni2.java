package com.itbootcamp.qabg13.nedelja4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestZaposleni2 {
    public static void main(String[] args) {
       Zaposleni pera = new Zaposleni("Pera", "Peric", 1000); //lokacija 123
       Zaposleni zika = new Zaposleni("Zika", "Zikic", 1000); //456
        Zaposleni mika = new Zaposleni("Mika", "Mikic", 1000); //789

        //System.out.println(Zaposleni.IME_FIRME);
        Zaposleni.kaziZdravo();

        System.out.println("Perina firma je " + pera.IME_FIRME);


        System.out.println(Zaposleni.getKoeficijentMinulogRada());
        System.out.println(pera.getKoeficijentMinulogRada());
        System.out.println(pera.getBrojCina());


    }
}
