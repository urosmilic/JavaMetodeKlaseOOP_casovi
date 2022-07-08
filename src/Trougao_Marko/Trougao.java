package Trougao_Marko;

public class Trougao {
    private double a;
    private double b;
    private double c;

    public Trougao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double obim() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    //public double getC() {       //ne treba nam jer se ne koristi u formulama povrsine a obim je definisan preko abc
     //   return c;
   // }



}