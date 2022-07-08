package com.itbootcamp.qabg13.nedelja4;

import java.util.Scanner;

public class TestZaposleni1 {
    public static void main(String[] args) {
        Zaposleni pera = new Zaposleni("Pera", "Peric", 1000);
        System.out.println("Inicijalna plata "+pera.getPlata());
        //manipulacija polja (stanja) objekata 'pera'
        //pera.plata = 100; ne moze ako je plata private
        //pera.ime = "Milos";
//        System.out.println("ups, plata je smanjena..." + pera.getPlata());
//        System.out.println("Pera je sad: " + pera.getIme());
        System.out.println("Pera je vredno radio...");
        pera.setPlata(1200);
        System.out.println("Nova" + pera.getPlata());
        Scanner scan = new Scanner(System.in);
    }
}