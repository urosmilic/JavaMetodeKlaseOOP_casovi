package TestiranjeUcenika;

public class KlasicnoPitanje extends Pitanje {
    /*Klasa KlasicnoPitanje nasledjuje abstraktnu klasu Pitanje i sadrzi attribute:
            - String odgovorNaPitanje
    Geteri i seteri za ovaj atribut*/

    private String odgovorNaPitanje;
    public KlasicnoPitanje(String tekstPitanja, int brojMaxPoena, int osvojenBrojPoena,
                           boolean pitanjePregledano, String odgovorNaPitanje) {
        super(tekstPitanja, brojMaxPoena, osvojenBrojPoena, pitanjePregledano);
        this.odgovorNaPitanje = odgovorNaPitanje;
    }
    public String getOdgovorNaPitanje() {
        return odgovorNaPitanje;
    }
    public void setOdgovorNaPitanje(String odgovorNaPitanje) {
        this.odgovorNaPitanje = odgovorNaPitanje;
    }
}
