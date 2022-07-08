package com.itbootcamp.qabg13.nedelja4.trouglovi;

public class RaznostraniTrougao extends Trougao {

    public RaznostraniTrougao(double a, double b, double c) {
        super(a, b, c);
    }

    public double povrsina() {
        double s = super.obim() / 2;
        return Math.sqrt(s * (s - super.getA()) * (s - super.getB()) * (s - super.getC()));
    }


}
