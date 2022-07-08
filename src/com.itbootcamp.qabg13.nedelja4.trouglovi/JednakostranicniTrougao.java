package com.itbootcamp.qabg13.nedelja4.trouglovi;

public class JednakostranicniTrougao extends Trougao {

    public JednakostranicniTrougao(double stranica) {
        //System.out.println("ovo nece da radi");
        super(stranica, stranica, stranica);// super mora biti prva 'komanda' u child klasi
        //this.a = a;
    }

    public double povrsina() {
        return Math.pow(super.getA() * Math.sqrt(3) / 2, 2) * Math.sqrt(3) / 2;
    }

}
