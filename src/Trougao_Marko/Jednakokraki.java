package Trougao_Marko;

public class Jednakokraki extends Trougao{

    public Jednakokraki(double a, double b) {
        super(a,b,b);
    }


    public double povrsina() {
        return 0.5 * super.getA() * Math.sqrt(( super.getB() + 0.5 * super.getA()) + (super.getB() - 0.5 * super.getA()));
    }
}
