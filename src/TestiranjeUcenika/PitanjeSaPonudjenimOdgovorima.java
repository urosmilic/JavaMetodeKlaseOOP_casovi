package TestiranjeUcenika;

public class PitanjeSaPonudjenimOdgovorima extends Pitanje {

    /*Klasa PitanjeSaPonudjenimOdgovorima nasledjuje abstraktnu klasu Pitanje i sadrzi atribute
    - String odgovorA
    - String odgovorB
    - String odgovorC
    - String odgovorD
    - String tacanOdgovor // identican sa jednim od prijasnih odgovora*/
    private String odgovorA;
    private String odgovorB;
    private String odgovorC;
    private String odgovorD;
    private String tacanOdgovor;

    public PitanjeSaPonudjenimOdgovorima(String tekstPitanja, int brojMaxPoena, int osvojenBrojPoena, boolean pitanjePregledano, String odgovorA, String odgovorB, String odgovorC, String odgovorD, String tacanOdgovor) {
        super(tekstPitanja, brojMaxPoena, osvojenBrojPoena, pitanjePregledano);
        this.odgovorA = odgovorA;
        this.odgovorB = odgovorB;
        this.odgovorC = odgovorC;
        this.odgovorD = odgovorD;
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
}
