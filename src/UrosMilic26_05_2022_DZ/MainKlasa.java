package UrosMilic26_05_2022_DZ;

import java.util.ArrayList;
import java.util.Scanner;

public class MainKlasa {
    //Main klasa sadrzi ArrrayList<Pitanje> pitanja popuniti listu sa 5 pitanja.
    //Koristeci petlju proci kroz ovih 5 pitanja i odgovoriti na jedno po jedno pitanje.
    //Drugom petljom proci kroz ovih 5 pitanja i dodeliti bodove za odgovore, istovremeno beleziti
    //sumu osvojenih poena.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        KlasicnoPitanje k1 = new KlasicnoPitanje("Ko je proglasen za MVP-a NBA lige za sezonu 2021/22?","Nikola Jokic");
        KlasicnoPitanje k2 = new KlasicnoPitanje("Koliko sekundi iznosi svetski rekord u trci na 100 m?","9.58");
        KlasicnoPitanje k3 = new KlasicnoPitanje("Koja je nadmorska visina Pancicivog vrha?","2017");
        PitanjeSaPonudjenimOdgovorom p4 = new PitanjeSaPonudjenimOdgovorom("Koja reprezentacija je osvojila Svetsko prvenstvo u fudbalu 2002. godine?","A) Nemacka", "B) Brazil","C) Italija","D) Argentina","B");
        PitanjeSaPonudjenimOdgovorom p5 = new PitanjeSaPonudjenimOdgovorom("Ko je najmladji sampion u istoriji F1?", "A) Hamilton","B) Verstapen","C) Schumaher","D) Fetel","D");

        ArrayList <Pitanje> pitanja = new ArrayList<>();
        pitanja.add(0,k1);
        pitanja.add(1,k2);
        pitanja.add(2,k3);
        pitanja.add(3,p4);
        pitanja.add(4,p5);

        int sumaBodova = 0;

        for (int i = 0; i < pitanja.size(); i++) {

            if (pitanja.get(i) instanceof KlasicnoPitanje) {
                System.out.println(pitanja.get(i).getTextPitanja());
                System.out.print("Vas odgovor je : ");
                ((KlasicnoPitanje) pitanja.get(i)).setOdgovorNaPitanje(s.nextLine());

            } else if (pitanja.get(i) instanceof PitanjeSaPonudjenimOdgovorom) {
                System.out.println(pitanja.get(i).getTextPitanja());
                System.out.println("Izaberite jedan od ponudjenih odgovora A-D: ");
                System.out.println(((PitanjeSaPonudjenimOdgovorom) pitanja.get(i)).getOdgovorA());
                System.out.println(((PitanjeSaPonudjenimOdgovorom) pitanja.get(i)).getOdgovorB());
                System.out.println(((PitanjeSaPonudjenimOdgovorom) pitanja.get(i)).getOdgovorC());
                System.out.println(((PitanjeSaPonudjenimOdgovorom) pitanja.get(i)).getOdgovorD());
                System.out.print("Vas odgovor je: ");
                ((PitanjeSaPonudjenimOdgovorom) pitanja.get(i)).setOdgovorNaPitanje(s.nextLine());
            }
        }

        for (int i = 0; i < pitanja.size(); i++) {
            if (pitanja.get(i) instanceof KlasicnoPitanje) {
                if (((KlasicnoPitanje) pitanja.get(i)).getOdgovorNaPitanje().equalsIgnoreCase(((KlasicnoPitanje) pitanja.get(i)).getTacanOdgovor())){
                    pitanja.get(i).setOsvojeniBrojPoena(pitanja.get(i).getOsvojeniBrojPoena() + 1);
                    pitanja.get(i).setPitanjePregledano(true);

                }
            } else if (pitanja.get(i) instanceof PitanjeSaPonudjenimOdgovorom) {
                if (((PitanjeSaPonudjenimOdgovorom) pitanja.get(i)).getOdgovorNaPitanje().equalsIgnoreCase(((PitanjeSaPonudjenimOdgovorom) pitanja.get(i)).getTacanOdgovor())) {
                    pitanja.get(i).setOsvojeniBrojPoena(pitanja.get(i).getOsvojeniBrojPoena() + 1);
                    pitanja.get(i).setPitanjePregledano(true);

                }
            }
        }

        for (int i = 0; i < pitanja.size(); i++) {
            sumaBodova += pitanja.get(i).getOsvojeniBrojPoena();
        }
        System.out.println("Osvojili ste " + sumaBodova + " od ukupno " + Pitanje.brojMaxPoena + " poena.");
    }
}
