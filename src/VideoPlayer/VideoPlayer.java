package VideoPlayer;
//Kreirati klasu VideoPlayer koja ima
//private atribute duzina videa, jacina zvuka, trenutno vreme videa i kvalitet videa
//kreirati pun konstruktor, getere, setere i metodu koja ce da stampa u formatu
//Trenutno vreme videa:
//Trenutna jacina zvuka:
//Trenutni kvalitet videa:
public class VideoPlayer {

    private double duzinVidea;
    private int jacinaZvuka;
    private double trenutnoVremeVidea;
    private int kvalitetVidea;

    public VideoPlayer(double duzinVidea, int jacinaZvuka, double trenutnoVremeVidea, int kvalitetVidea) {
        this.duzinVidea = duzinVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.kvalitetVidea = kvalitetVidea;
    }
    public double getDuzinVidea() {
        return duzinVidea;
    }
    public void setDuzinVidea(double duzinVidea) {
        this.duzinVidea = duzinVidea;
    }
    public int getJacinaZvuka() {
        return jacinaZvuka;
    }
    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }
    public double getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }
    public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }
    public int getKvalitetVidea() {
        return kvalitetVidea;
    }
    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    @Override
    public String toString() {
        return "\nTrenutna jacina zvuka: " + jacinaZvuka +
                "\nTrenutno vreme videa: " + trenutnoVremeVidea +
                "\nTrenutni kvalitet videa: " + kvalitetVidea;
    }

    /*public void stampa () {
        System.out.println("Trenutno vreme videa: " + this.trenutnoVremeVidea);
        System.out.println("Trenutna jacina zvuka: " + this.jacinaZvuka);
        System.out.println("Trenutni kvalitet videa: " + this.kvalitetVidea);
        System.out.println("----------------------------------");
    }*/








}
