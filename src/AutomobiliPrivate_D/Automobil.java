package AutomobiliPrivate_D;

public class Automobil {
    private String marka;
    private String model;
    private String gorivo;
    private int brojVrata;
    private int godiste;

    public Automobil() {

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGorivo() {
        return gorivo;
    }

    public void setGorivo(String gorivo) {
        this.gorivo = gorivo;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public void stampanje() {
        System.out.println("Automobil marke " + this.marka + " i modela " + this.model + " koji ide na "
                + this.gorivo + " gorivo je " + this.godiste + ". godiste i ima " + this.brojVrata + " vrata.");
    }
}
