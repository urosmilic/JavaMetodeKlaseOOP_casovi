import java.util.ArrayList;

public class Zadatak12_D {
    public static void main(String[] args) {
        //Zadatak 2 - Napraviti listu (nedefinisanog tipa) koja ce se zvati "recenica". U tu listu po ovom redosledu dodeliti clanove: voli, 3, Milovana, Ana
//odstampati listu
//nakon toga zameniti redosled i odstampati listu da ona glasi Ana voli Milovana
//Za stampanje napraviti posebnu metodu

        ArrayList recenica = new ArrayList();
        recenica.add("voli");
        recenica.add(3);
        recenica.add("Milovana");
        recenica.add("Ana");
        stampanje(recenica);
        recenica.remove(1);
        stampanje(recenica);

        Object rezerva = recenica.get(0);
        recenica.set(0, recenica.get(2));
        stampanje(recenica);
        recenica.set(2, recenica.get(1));
        stampanje(recenica);
        recenica.set(1, rezerva);
        stampanje(recenica);

    }

    public static void stampanje(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("---------");
    }


}