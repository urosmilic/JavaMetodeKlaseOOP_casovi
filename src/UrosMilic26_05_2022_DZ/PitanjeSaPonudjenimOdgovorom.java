package UrosMilic26_05_2022_DZ;

public class PitanjeSaPonudjenimOdgovorom extends Pitanje {
    private String odgovorA;
    private String odgovorB;
    private String odgovorC;
    private String odgovorD;
    private String odgovorNaPitanje;
    private String tacanOdgovor;
    public PitanjeSaPonudjenimOdgovorom(String textPitanja, String odgovorA, String odgovorB, String odgovorC, String odgovorD, String tacanOdgovor) {
        super(textPitanja);
        this.odgovorA = odgovorA;
        this.odgovorB = odgovorB;
        this.odgovorC = odgovorC;
        this.odgovorD = odgovorD;
        this.odgovorNaPitanje = odgovorNaPitanje;
        this.tacanOdgovor = tacanOdgovor;
    }
    public String getOdgovorA() {
        return odgovorA;
    }
    public void setOdgovorA(String odgovorA) {
        this.odgovorA = odgovorA;
    }
    public String getOdgovorB() {
        return odgovorB;
    }
    public void setOdgovorB(String odgovorB) {
        this.odgovorB = odgovorB;
    }
    public String getOdgovorC() {
        return odgovorC;
    }
    public void setOdgovorC(String odgovorC) {
        this.odgovorC = odgovorC;
    }
    public String getOdgovorD() {
        return odgovorD;
    }
    public void setOdgovorD(String odgovorD) {
        this.odgovorD = odgovorD;
    }
    public String getTacanOdgovor() {
        return tacanOdgovor;
    }
    public void setTacanOdgovor(String tacanOdgovor) {
        this.tacanOdgovor = tacanOdgovor;
    }
    public String getOdgovorNaPitanje() {
        return odgovorNaPitanje;
    }
    public void setOdgovorNaPitanje(String odgovorNaPitanje) {
        this.odgovorNaPitanje = odgovorNaPitanje;
    }
}
