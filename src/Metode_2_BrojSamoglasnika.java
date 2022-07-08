public class Metode_2_BrojSamoglasnika {

    public static void main(String[] args) {
        System.out.println(metode_2_BrojSamoglasnika("JovanaIUros"));
    }


    public static int metode_2_BrojSamoglasnika(String rec) {
        String[] nizKaraktera = rec.split("");
        int brojSamoglasnika = 0;
        for (int i = 0; i < nizKaraktera.length; i++) {
            if (nizKaraktera[i].equalsIgnoreCase("a") ||
                    nizKaraktera[i].equalsIgnoreCase("e") ||
                    nizKaraktera[i].equalsIgnoreCase("i") ||
                    nizKaraktera[i].equalsIgnoreCase("o") ||
                    nizKaraktera[i].equalsIgnoreCase("u"))
                brojSamoglasnika++;
        }
        return brojSamoglasnika;
    }
}
