package Facebook_DB;

public class Reakcija {
    private String tipReakcije;
    private String imeIPrezime;

    public Reakcija(String tipReakcije, String imeIPrezime) {
        this.tipReakcije = tipReakcije;
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipReakcije() {
        return tipReakcije;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
}