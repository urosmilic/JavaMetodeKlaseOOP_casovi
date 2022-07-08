package com.itbootcamp.qabg13.nedelja4.trouglovi;

public class Pravougli extends Trougao {

    public Pravougli(double kateta1, double kateta2, double hipotenuza) {
        super(kateta1, kateta2, hipotenuza);
    }

    public double povrsina() {
        return super.getA() * super.getB() / 2;
    }


}
