package Ptica;

public class Orao extends Ptica implements Hrani, Leti, Pevaj {

    private String vrsta;



    @Override
    public void hrani() {
        System.out.println("Orao se hrani misevima.");
    }

    @Override
    public void leti() {
        System.out.println("Orao leti kao metak.");
    }

    @Override
    public void pevaj() {
        System.out.println("Orao ne peva, ali zato pisti.");

    }

    @Override
    public void sepurenje() {
        System.out.println("Orao se ne sepuri vec napada u tisini.");
    }
}
