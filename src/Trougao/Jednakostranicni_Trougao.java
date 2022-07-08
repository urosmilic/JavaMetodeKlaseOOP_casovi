package Trougao;

//Napraviti klasu: JednakostranicniTrougao
//- polja: double a
//- konstruktor koji prima a
//- metodu obim koja racuna obim trougla
//- metodu povrsina koja racuna povrsinu jednakostranicnog trougla

public class Jednakostranicni_Trougao {
    private double a;

    public Jednakostranicni_Trougao(double a) {
        this.a = a;
    }


    public double obimTrougla () {
        return  (3 * this.a);
    }

    public double povrsinaTrougla () {
        return (this.a * this.a * Math.sqrt(3) / 4);
    }


    public void stampa () {
        System.out.println("Povrsina jednakostranicnog trougla je " + this.povrsinaTrougla());
        System.out.println("Obim jednakostranicnog trougla je " + this.obimTrougla());
    }










}
