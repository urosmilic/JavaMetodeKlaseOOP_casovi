package ZivotinjePrimer;

public class Macka extends Zivotinja{


    public Macka(String ime, String omiljenoJelo, double prosecnaStarost) {
        super(ime, omiljenoJelo, prosecnaStarost);
    }

    public void spavaj(){
        System.out.println("Macka spava i prede");
    }

    public void jedi(){
        System.out.println("Macka jede Wiskas");
    }

    public void svraljaj(){
        System.out.println("Macka se igra sa misem");
    }

    public void proizvediZvuk(){
        System.out.println("Mjau mjau");
    }

    public void predi(){
        System.out.println(super.getIme() + " prede");
    }
}
