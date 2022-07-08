package com.itbootcamp.qabg13.nedelja4.trouglovi;

public class Jednakokraki extends Trougao {

    public Jednakokraki(double osnovica, double kraci) {
        super(osnovica, kraci, kraci);
    }

    public double povrsina() {
        return 0.5 * super.getA() * Math.sqrt((super.getB() + 0.5 * super.getA()) + (super.getB() - 0.5 * super.getA()));
    }
}
