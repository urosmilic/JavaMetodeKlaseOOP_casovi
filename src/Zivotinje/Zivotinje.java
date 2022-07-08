package Zivotinje;

public abstract class Zivotinje {
    private String ime;
    private String omiljenoJelo;
    private double prosecnaStarost;

    public Zivotinje(String ime, String omiljenoJelo, double prosecnaStarost) {
        this.ime = ime;
        this.omiljenoJelo = omiljenoJelo;
        this.prosecnaStarost = prosecnaStarost;
    }

    public void spavaj () {
        System.out.println("Spava!");
    }

    public abstract void jedi ();
    public abstract  void proizvodiZvuk();








}
