package Trougao_Marko;

public class Pravougli extends Trougao {

    public Pravougli(double a, double b, double c) {
        super(a,b,c);

    }

    public double povrsina() {
        return super.getA() * super.getB() / 2;
    }
}
