package Trougao;
//Napraviti klasu: Jednakokraki
//- polja: double a, double b
//- konstruktor koji prima a, b
//- metodu obim koja racuna obim trougla
//- metodu povrsina koja racuna povrsinu jednakokrakog trougla
public class Jednakokraki_Trougao {
    private double a;
    private double b;

    public Jednakokraki_Trougao(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double obimJednakokrakiTrougao () {
        return 2 * this.b / this.a;
    }

    public double povrsinaJednakokrakiTrougao () {
        double aPola = this.a / 2;
        double bPola = this.b / 2;

        return aPola * Math.sqrt((this.b + aPola)*(this.b - aPola));
    }

}
