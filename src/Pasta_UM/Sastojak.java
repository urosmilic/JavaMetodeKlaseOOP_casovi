package Pasta_UM;

public class Sastojak {
    private String naziv;
    private Double cena;

    public Sastojak(String naziv, Double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public Double getCena() {
        return cena;
    }
    public void setCena(Double cena) {
        this.cena = cena;
    }
}
