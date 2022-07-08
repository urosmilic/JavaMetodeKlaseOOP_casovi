public class Zadatak7 {
    //Zadatak3:
    //napraviti metodu `String obrniString(String s)`
    //input: String s
    //output: String sObrnuto
    //primer: obrniString("cao") -> "oac", obrniString("naravno") -> "onvaran", obrniString("ana") -> "ana"

    public static void main(String[] args) {

        System.out.println("Vasa rec obrnuto glasi: " + obrniString("bravo"));
    }

    public static String obrniString (String rec) {

        String [] nizOdRecenice = rec.split("");
        String obrnutoooo = "";
        for (int i = nizOdRecenice.length - 1; i >= 0; i--) {
            obrnutoooo += nizOdRecenice[i];
        }
       return obrnutoooo;
    }
}
