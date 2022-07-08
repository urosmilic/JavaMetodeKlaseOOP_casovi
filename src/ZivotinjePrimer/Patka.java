package ZivotinjePrimer;

public class Patka extends Zivotinja{
    public Patka(String ime, String omiljenoJelo, double prosecnaStarost) {
        super(ime, omiljenoJelo, prosecnaStarost);
    }

    public void spavaj(){
        System.out.println("Patka spava");
    }

    public void jedi(){
        System.out.println("Patka jede");
    }

    public void svraljaj(){
        System.out.println("Patka vija coveka");
    }

    public void proizvediZvuk(){
        System.out.println("Kva kva");
    }
}
