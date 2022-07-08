package Filmovi_JR;

import java.util.ArrayList;

public class MainKlasa {

    public static void main(String[] args) {
        Film f1 = new Film(1958,5_000_000, "Action", "Titanik");
        DomaciFilm df1 = new DomaciFilm(1999,500_000, "Drama", "Nebeska udica", "Beograd");
        StraniFilm sf1 = new StraniFilm(2012, 65_000_000,"Fantasy", "Hobbit", false);
        Film fdf1 = new DomaciFilm(2021,2_000_000, "Akcija", "Juzni vetar 2", "Beograd");


        ArrayList <Film> listaFilmova = new ArrayList<>();
        listaFilmova.add(f1);
        listaFilmova.add(df1);
        listaFilmova.add(sf1);
        listaFilmova.add(fdf1);

        for (Film f : listaFilmova) {
            if (f instanceof DomaciFilm) {
                System.out.println(f.getNazivFilma());
            } else {
                System.out.println(f.getNazivFilma() + " nije domaci film.");
            }
        }


    }










}
