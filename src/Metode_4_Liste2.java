import java.util.ArrayList;

public class Metode_4_Liste2 {
    public static void main(String[] args) {

        ArrayList imenaListe = new ArrayList();

        imenaListe.add("Milos");
        imenaListe.add(2);
        imenaListe.add('a');
        imenaListe.add(true);
        imenaListe.add(1.274);
        System.out.println("Lista ima " + imenaListe.size() + " clanova");
        for (int i = 0; i < imenaListe.size(); i++) {
            System.out.println((i+1) + ". clan je " + imenaListe.get(i));
        }

        System.out.println("Nakon oduzimanja clanova, nova lista");

        imenaListe.add("Uros");
        imenaListe.add(87);
        imenaListe.add(false);
        imenaListe.remove(0); //izbacivanje prvog clana
        imenaListe.remove(imenaListe.size()-1); //izbacivanje poslednjeg clana

        System.out.println("Lista ima " + imenaListe.size() + " clanova");
        for (int i = 0; i < imenaListe.size(); i++) {
            System.out.println((i+1) + ". clan je " + imenaListe.get(i));
        }


        String imena[] = {"Marko", "Milica", "Jovana", "Aca", "Ognjen", "Kristina"};
        ArrayList koDolaziNaRodjendanLista = new ArrayList();

        for (int i = 0; i < imena.length; i++) {
            koDolaziNaRodjendanLista.add(imena[i]);
        }

        for (int i = 0; i < koDolaziNaRodjendanLista.size(); i++) {
            System.out.println("Dolazi " + koDolaziNaRodjendanLista.get(i));
        }




    }
}