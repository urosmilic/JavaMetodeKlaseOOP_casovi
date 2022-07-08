package TestiranjeUcenika;

import java.util.ArrayList;
import java.util.Scanner;

public class MainKlasa {
    public static void main(String[] args) {

        /*Main klasa sadrzi ArrrayList<Pitanje> pitanja popuniti listu sa 5 pitanja.
        Koristeci petlju proci kroz ovih 5 pitanja i odgovoriti na jedno po jedno pitanje.
        Drugom petljom proci kroz ovih 5 pitanja i dodeliti bodove za odgovore, istovremeno beleziti
        sumu osvojenih poena*/
        Scanner sc = new Scanner(System.in);
        String odgovor = new String();

        ArrayList<Pitanje> pitanja = new ArrayList<>();
        KlasicnoPitanje kp1 = new KlasicnoPitanje("Ko je pisac romana 'Na Drini cuprija'?", 20, 0, false, "Ivo Andric");
        KlasicnoPitanje kp2 = new KlasicnoPitanje("Iz kog veka datira prvo slovensko pismo?", 20, 0, false, "deveti vek");
        PitanjeSaPonudjenimOdgovorima pspo1 = new PitanjeSaPonudjenimOdgovorima("Koji glasovi pored vokala mogu biti nosioci sloga?", 20, 0, false, "A) R, L, N", "B) A, B, C", "C) M, H, K", "D) J, D, V", "A");
        PitanjeSaPonudjenimOdgovorima pspo2 = new PitanjeSaPonudjenimOdgovorima("Ocem istorije se naziva?", 20, 0, false, "A) Homer Simpson", "B) Pera Peric", "C) Herodot", "D) Sima Simic", "C");
        PitanjeSaPonudjenimOdgovorima pspo3 = new PitanjeSaPonudjenimOdgovorima("Paleolit je...?", 20, 0, false, "A) Starije kameno doba", "B) Vrsta sladoleda", "C) Kozmeticki prozivod", "D) Fudbalski klub", "A");

        pitanja.add(kp1);
        pitanja.add(kp2);
        pitanja.add(pspo1);
        pitanja.add(pspo2);
        pitanja.add(pspo3);

        for (int i = 0; i < pitanja.size(); i++) {

            System.out.println("");

            if (pitanja.get(i) instanceof KlasicnoPitanje) {
                System.out.println("Odgovorite na pitanje " + (i + 1));
                System.out.println(pitanja.get(i).getTekstPitanja());
                odgovor = sc.nextLine();
                // ((KlasicnoPitanje) pitanja.get(i)).setOdgovorNaPitanje(odgovor);
                if (odgovor.equals(((KlasicnoPitanje) pitanja.get(i)).getOdgovorNaPitanje())) {
                    ((KlasicnoPitanje) pitanja.get(i)).setOsvojenBrojPoena(pitanja.get(i).getBrojMaxPoena());

                } else {
                    ((KlasicnoPitanje) pitanja.get(i)).setOsvojenBrojPoena(0);

                }

                pitanja.get(i).setPitanjePregledano(true);
            }

            //System.out.println("");

            if (pitanja.get(i) instanceof PitanjeSaPonudjenimOdgovorima) {
                System.out.println("Odaberite tacan odgovor na pitanje " + (i + 1));
                System.out.println("");
                System.out.println(pitanja.get(i).getTekstPitanja());
                System.out.println("");
                System.out.println("Ponudjeni odgovori su:");
                System.out.println(((PitanjeSaPonudjenimOdgovorima) pitanja.get(i)).getOdgovorA());
                System.out.println(((PitanjeSaPonudjenimOdgovorima) pitanja.get(i)).getOdgovorB());
                System.out.println(((PitanjeSaPonudjenimOdgovorima) pitanja.get(i)).getOdgovorC());
                System.out.println(((PitanjeSaPonudjenimOdgovorima) pitanja.get(i)).getOdgovorD());

                odgovor = sc.nextLine();

                if (odgovor.equals(((PitanjeSaPonudjenimOdgovorima) pitanja.get(i)).getTacanOdgovor())) {
                    ((PitanjeSaPonudjenimOdgovorima) pitanja.get(i)).setOsvojenBrojPoena(pitanja.get(i).getBrojMaxPoena());

                } else {
                    ((PitanjeSaPonudjenimOdgovorima) pitanja.get(i)).setOsvojenBrojPoena(0);

                }

                pitanja.get(i).setPitanjePregledano(true);
            }

        }

        int suma = 0;

        for (int i = 0; i < pitanja.size(); i++) {
            if (pitanja.get(i).isPitanjePregledano()) {
                suma = suma + pitanja.get(i).getOsvojenBrojPoena();
            }

        }

        System.out.println("Osvojen broj poena je: " + suma);

    }
}

