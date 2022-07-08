import java.util.ArrayList;

public class Zadatak12 {
    //Zadatak 2 - Napraviti listu (nedefinisanog tipa) koja ce se zvati "recenica".
    // U tu listu po ovom redosledu dodeliti clanove: voli, 3, Milovana, Ana
    //odstampati listu
    //nakon toga zameniti redosled i odstampati listu da ona glasi Ana voli Milovana
    //Za stampanje napraviti posebnu metodu

    public static void main(String[] args) {

        ArrayList recenica = new ArrayList();

        recenica.add("voli");
        recenica.add("3");
        recenica.add("Milovana");
        recenica.add("Ana");

        stampanje(recenica);
        System.out.println("------------------");

        recenica.set(1, recenica.get(0));
        recenica.set(0, recenica.get(3));
        recenica.remove(3);

        stampanje(recenica);
    }

    public static void stampanje (ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }






}
