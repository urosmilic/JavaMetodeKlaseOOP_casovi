import java.util.ArrayList;

public class Zadatak13_D {
    public static void main(String[] args) {

        //Zadatak 3 - Napraviti listu (nedefinisanog tipa) koja ce se nazvati "boje".
        // Ubaciti u listu sledece podatke: true, 6.12, belo, zeleno, plavo, false, ITBOOTCAMP, crveno
//Preko petlje obrisati sve unose koji nisu neka boja
//Zatim poredjati boje da se prikazu crveno, plavo, belo
//Koristiti getere i setere

        ArrayList boje = new ArrayList();
        ArrayList samoBoje = new ArrayList();

        boje.add(true);
        boje.add(6.12);
        boje.add("belo");
        boje.add("zeleno");
        boje.add("plavo");
        boje.add(false);
        boje.add("ITBOOTCAMP");
        boje.add("crveno");

        stampanje(boje);
        System.out.println("==============");

        for (int i = 0; i < boje.size(); i++) {
            if (boje.get(i).equals("belo")) {
                samoBoje.add(boje.get(i));
            }
        }
        for (int i = 0; i < boje.size(); i++) {
            if (boje.get(i).equals("zeleno")) {
                samoBoje.add(boje.get(i));
            }
        }
        for (int i = 0; i < boje.size(); i++) {
            if (boje.get(i).equals("plavo")) {
                samoBoje.add(boje.get(i));
            }
        }
        for (int i = 0; i < boje.size(); i++) {
            if (boje.get(i).equals("crveno")) {
                samoBoje.add(boje.get(i));
            }
        }
        stampanje(samoBoje);
        samoBoje.remove("zeleno");
        stampanje(samoBoje);

        Object crveno = samoBoje.get(2);
        samoBoje.set(2, samoBoje.get(0));
        samoBoje.set(0, crveno);
        stampanje(samoBoje);

    }


    public static void stampanje(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("---------");
    }
}