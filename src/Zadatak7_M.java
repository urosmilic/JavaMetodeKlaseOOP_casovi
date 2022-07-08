public class Zadatak7_M {
    public static String obrniString(String s) {
        String obrnutaRec = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            obrnutaRec = obrnutaRec + s.charAt(i);
        }

        return obrnutaRec;
    }

    public static String obrniString2(String s) {
        String obrnutaRec = "";
        String[] nizOdReci = s.split("");

        for (int i = nizOdReci.length - 1; i >= 0; i--) {
            obrnutaRec = obrnutaRec + nizOdReci[i];
        }

        return obrnutaRec;
    }





}
