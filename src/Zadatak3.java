public class Zadatak3 {
    //napravi metodu koja prima kao parametar String a vraca kao rezultat broj reci u datom string-u.
    public static void main(String[] args) {
        String recenica = "ItBootcamp-je-super!";
        System.out.println(reci(recenica));

    }
    public static int reci (String recenica){
        String[] nizOdRecenice = recenica.split("-");
        int brojReci = nizOdRecenice.length;
        return brojReci;
    }

}
