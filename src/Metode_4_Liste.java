import java.util.ArrayList;

public class Metode_4_Liste {
    public static void main(String[] args) {

        //Napraviti niz imena ljudi koji mi dolaze na rodjendan

        String imena[] = new String[5];
        imena[0] = "Stefan";
        imena[1] = "Jovana";
        imena[4] = "Marko";
        imena[3] = "Milica";
        imena[2] = "Milos";
        //imena[5] = "Ivana";

        System.out.println("Ko ce sve doci na rodjendan");
        for (int i = 0; i < imena.length; i++) {
            System.out.println(imena[i]);
        }

        //-----------------

        ArrayList <String>imenaZaDolazak = new ArrayList <String>();
        imenaZaDolazak.add("Stefan"); //index 0
        imenaZaDolazak.add("Jovana"); //index 1
        imenaZaDolazak.add("Jovana"); //index 2
        imenaZaDolazak.add("Marko"); //index 3
        System.out.println("Na rodjendan sa liste ce doci " + imenaZaDolazak.size() + " ljudi");
        imenaZaDolazak.remove(3);
        imenaZaDolazak.remove("Jovana");

        System.out.println("Na rodjendan sa liste ce doci " + imenaZaDolazak.size() + " ljudi");

        System.out.println("Ko ce doci sa liste na rodjendan");
        for (int i = 0; i < imenaZaDolazak.size(); i++) {
            System.out.println(imenaZaDolazak.get(i));
        }



    }
}