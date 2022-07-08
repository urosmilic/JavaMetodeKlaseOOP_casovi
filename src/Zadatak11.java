import java.util.ArrayList;

public class Zadatak11 {
    //Zadatak 1 - Kreirati listu namirnica iz prodavnice, dodeliti vrednosti, odstampati sve vrednosti,
    // zatim obrisati drugi i cetvrti clan pa ponovo odstampati listu


    public static void main(String[] args) {

        ArrayList namirnicaLista = new ArrayList();

        namirnicaLista.add("Mleko");
        namirnicaLista.add("Jaja");
        namirnicaLista.add("Meso");
        namirnicaLista.add("Jogurt");
        namirnicaLista.add("Hleb");

        for(int i = 0; i < namirnicaLista.size(); i++) {
            System.out.println(namirnicaLista.get(i));
        }

        namirnicaLista.remove(1);
        namirnicaLista.remove(3);

        System.out.println("Nakon izbacivanja odredjenih namirnica, na listi se sada nalaze: ");

        for(int i = 0; i < namirnicaLista.size(); i++) {
            System.out.println(namirnicaLista.get(i));
        }









    }





}
