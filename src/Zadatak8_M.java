public class Zadatak8_M {

    public static boolean palindrom(String s) {
        boolean isPalindrom = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                isPalindrom = false;
                break;
            }
        }

        return isPalindrom;
    }




}
