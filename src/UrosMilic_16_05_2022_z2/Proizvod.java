package UrosMilic_16_05_2022_z2;

public class Proizvod {

    public String naziv;
    public double cena;
    public String rokTrajanja;

    public Proizvod(String naziv, double cena, String rokTrajanja) {
        this.naziv = naziv;
        this.cena = cena;
        this.rokTrajanja = rokTrajanja;
    }

    public void stampa() {
        System.out.println(this.naziv + " sa cenom od " + this.cena + " dinara, ima rok trajanja do " + this.rokTrajanja);
    }
}
