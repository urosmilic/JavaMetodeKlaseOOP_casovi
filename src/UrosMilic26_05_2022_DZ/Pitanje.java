package UrosMilic26_05_2022_DZ;

public abstract class Pitanje {
    private String textPitanja;
    public static final int brojMaxPoena = 5;
    private int osvojeniBrojPoena;
    private boolean pitanjePregledano;
    public Pitanje(String textPitanja) {
        this.textPitanja = textPitanja;
        this.osvojeniBrojPoena = osvojeniBrojPoena;
        this.pitanjePregledano = pitanjePregledano;
    }
    public String getTextPitanja() {
        return textPitanja;
    }
    public void setTextPitanja(String textPitanja) {
        this.textPitanja = textPitanja;
    }
    public int getBrojMaxPoena() {
        return brojMaxPoena;
    }
    public int getOsvojeniBrojPoena() {
        return osvojeniBrojPoena;
    }
    public void setOsvojeniBrojPoena(int osvojeniBrojPoena) {
        this.osvojeniBrojPoena = osvojeniBrojPoena;
    }
    public boolean isPitanjePregledano() {
        return pitanjePregledano;
    }
    public void setPitanjePregledano(boolean pitanjePregledano) {
        this.pitanjePregledano = pitanjePregledano;
    }
}
