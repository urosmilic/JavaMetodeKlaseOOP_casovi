import java.util.ArrayList;

public class Zadatak13 {
    //Zadatak 3 - Napraviti listu (nedefinisanog tipa) koja ce se nazvati "boje". Ubaciti u listu sledece podatke:
    // true, 6.12, belo, zeleno, plavo, false, ITBOOTCAMP, crveno
//Preko petlje obrisati sve unose koji nisu neka boja
//Zatim poredjati boje da se prikazu crveno, plavo, belo
//Koristiti getere i setere

    public static void main(String[] args) {
        ArrayList boje = new ArrayList();
        boje.add(true);
        boje.add(6.12);
        boje.add("belo");
        boje.add("zeleno");
        boje.add("plavo");
        boje.add(false);
        boje.add("ITBOOTCAMP");
        boje.add("crveno");

        for (int i = 0; i < boje.size(); i++) {
            if (boje.get(i) != "crveno" ||  boje.get(i) != "plavo" || boje.get(i) != "zeleno" || boje.get(i) != "belo"){
                boje.remove(i);
            }
        }

        stampa(boje);
    }

    public static void stampa (ArrayList lista) {
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }

}
