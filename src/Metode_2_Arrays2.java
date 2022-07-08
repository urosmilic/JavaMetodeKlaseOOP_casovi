import java.util.Arrays;
public class Metode_2_Arrays2 {
    public static void main(String[] args) {
        String recenica = "ItBootcamp je super stvarno bla bla bla!";
        int duzinaRecenice = racunajBrojReci(recenica);
        System.out.println("Duzina recenice je: " + duzinaRecenice);

        Metode_2_Arrays2 mm = new Metode_2_Arrays2();
        System.out.println(mm.racunajBrojReci2(recenica));

        Test t = new Test();
        System.out.println(t.racunajBrojReci3(recenica));
        System.out.println(t.racunajBrojReci2(recenica));



    }


    public static int racunajBrojReci(String recenica) {
        return recenica.split(" ").length;
    }
    public int racunajBrojReci2(String recenica) {
        return recenica.split(" ").length;
    }




}

    class Test extends  Metode_2_Arrays2 {

    public int racunajBrojReci3(String recenica) {
        return recenica.split(" ").length;
    }



}
