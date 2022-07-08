package Zivotinje;

public class Macka extends Zivotinje {
    private int brojNogu;

    public Macka(String ime, String omiljenoJelo, double prosecnaStarost, int brojNogu) {
        super(ime, omiljenoJelo, prosecnaStarost);
        this.brojNogu = brojNogu;
    }

    public void jedi () {
        System.out.println("Macka voli da pije mleko!");
    }

    public void proizvodiZvuk () {
        System.out.println("Macka mjauce!");
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }
}
