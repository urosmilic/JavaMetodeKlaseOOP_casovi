public class Metode_2_Metode {

    public static void main(String[] args) {
        System.out.println("Pocetak programa");
        kaziZdravo("Darko");
        System.out.println("Kraj programa");
        String vrednostIzZdravo2 = kaziZdravo2("Zarko"); //uhvatimo povratnu vrendost metode
        System.out.println(vrednostIzZdravo2);
        String vrednost2 = kaziZdravo2("Aleksandar"); //uhvatimo povratnu vrendost metode
        System.out.println(vrednost2);

    }





    public static void /*tip izlazne vrednosti*/ kaziZdravo /*ime metode*/(String ime/*parametri metode*/) {
        String pozdrav = "Zdravo " + ime;
        System.out.println(pozdrav);
//        System.out.println("Ovde pocinje metoda kaziZdravo");
//        System.out.println("Zdravo " + ime);
    }

    public static String kaziZdravo2(String ime) {
        return "Dobar dan " + ime;
    }




}