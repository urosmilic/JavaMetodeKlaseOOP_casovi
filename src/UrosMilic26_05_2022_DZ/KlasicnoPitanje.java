package UrosMilic26_05_2022_DZ;

public class KlasicnoPitanje extends Pitanje {
    private String odgovorNaPitanje;
    private String tacanOdgovor;
    public KlasicnoPitanje(String textPitanja,String tacanOdgovorK) {
        super(textPitanja);
        this.odgovorNaPitanje = odgovorNaPitanje;
        this.tacanOdgovor = tacanOdgovorK;
    }
    public String getOdgovorNaPitanje() {
        return odgovorNaPitanje;
    }
    public void setOdgovorNaPitanje(String odgovorNaPitanje) {
        this.odgovorNaPitanje = odgovorNaPitanje;
    }
    public String getTacanOdgovor() {
        return tacanOdgovor;
    }
    public void setTacanOdgovor(String tacanOdgovor) {
        this.tacanOdgovor = tacanOdgovor;
    }
}
