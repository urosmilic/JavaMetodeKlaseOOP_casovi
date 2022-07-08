package Facebook_DB;
import java.util.ArrayList;
public class FacebookPost {
    private String imeIPrezime;
    private String textObjave;
    private ArrayList<Reakcija> listaReakcija;       //bukvalno prva polovina koda za listu
    public FacebookPost(String imeIPrezime, String textObjave) {
        this.imeIPrezime = imeIPrezime;
        this.textObjave = textObjave;
        this.listaReakcija = new ArrayList<>();      //buvkvalno druga polovina koda za listu
    }
    public void dodajReakciju(Reakcija r) {
        listaReakcija.add(r);
    }
    private int prebrojavanje(String tipReakcije) {
        int brojac = 0;
        for (int i = 0; i < listaReakcija.size(); i++) {
            if (listaReakcija.get(i).getTipReakcije().equals(tipReakcije)) {
                brojac++;
            }
        }
        return brojac;
    }
    public void stampanje() {
        System.out.println(this.imeIPrezime);
        System.out.println(this.textObjave);
        System.out.println("Smajli: " + prebrojavanje("Smajli") + " | " + "Like: " + prebrojavanje("Like") + " | "
                + "Srce: " + prebrojavanje("Srce"));
    }
}