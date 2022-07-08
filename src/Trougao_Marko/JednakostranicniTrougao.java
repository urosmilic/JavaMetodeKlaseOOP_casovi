package Trougao_Marko;

public class JednakostranicniTrougao extends Trougao {

    public JednakostranicniTrougao(double a) {
        //System.out.println("ovo nece da radi");
        super(a, a, a);// super mora biti prva 'komanda' u child klasi
        //this.a = a;
    }

    public double povrsina() {
        return Math.pow(super.getA() * Math.sqrt(3) / 2, 2) * Math.sqrt(3) / 2;
    }

}