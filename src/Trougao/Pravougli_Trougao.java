package Trougao;

public class Pravougli_Trougao {
    //Napraviti klasu: PravougliTrougao
    //- polja: double a, b,c
    //- konstruktor koji prima a,b,c
    //- metodu obim koja racuna obim trougla
    //- metodu povrsina koja racuna povrsinu pravouglog trougla

    private double a;
    private double b;
    private double c;

    public Pravougli_Trougao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double obimPravouglogTrougla () {
        return this.a + this.b + this.c;
    }

    public double povrsinaPravouglogTrougla () {
        return this.a * this.b / 2;
    }

}
