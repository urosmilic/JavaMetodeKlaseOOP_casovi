import java.util.ArrayList;

public class Metode_4_Liste4 {
    public static void main(String[] args) {

        ArrayList<String> voce = new ArrayList<>();
        voce.add("Narandza");
        voce.add("Jabuka");
        voce.add("Jagoda");
        stampanje(voce);

        String rezervacija = voce.get(0);
        voce.set(0, voce.get(1));
        voce.set(1, rezervacija);

        stampanje(voce);

    }

    public static void stampanje(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("---------");
    }
}

