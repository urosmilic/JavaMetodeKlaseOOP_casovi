public class Zadatak4 {
    //implementirati metodu brojSamoglasnika:
    //ulazni parametri : String rec
    //izlazni tip: int

    public static void main(String[] args) {

        System.out.println("Broj samoglasnika iznosi: " + samoglasnici ("Konvergencija"));
    }

    public static int samoglasnici (String rec){

        String [] nizOdRecenice = rec.split("");

        int samoglasnici = 0;

        for (int i = 0; i < nizOdRecenice.length; i++) {
            if (nizOdRecenice[i].equalsIgnoreCase("a") || nizOdRecenice[i].equalsIgnoreCase("e") ||
                    nizOdRecenice[i].equalsIgnoreCase("i") || nizOdRecenice[i].equalsIgnoreCase("o") ||
                    nizOdRecenice[i].equalsIgnoreCase("u")) {
                samoglasnici++;
            }
        }
        return samoglasnici;
    }


}
