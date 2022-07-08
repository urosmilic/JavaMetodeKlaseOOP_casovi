package ZivotinjePrimer;

public abstract class Zivotinja {
    private String ime;
    private String omiljenoJelo;
    private double prosecnaStarost;

    public Zivotinja(String ime, String omiljenoJelo, double prosecnaStarost) {
        this.ime = ime;
        this.omiljenoJelo = omiljenoJelo;
        this.prosecnaStarost = prosecnaStarost;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getOmiljenoJelo() {
        return omiljenoJelo;
    }
    public void setOmiljenoJelo(String omiljenoJelo) {
        this.omiljenoJelo = omiljenoJelo;
    }
    public double getProsecnaStarost() {
        return prosecnaStarost;
    }
    public void setProsecnaStarost(double prosecnaStarost) {
        this.prosecnaStarost = prosecnaStarost;
    }

    public abstract void spavaj();
    public abstract void jedi();
    public abstract void svraljaj();
    public abstract void proizvediZvuk();
}
