package com.example;

public class Cilindro extends Circulo{

    private double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double area() {
        return 2 * Math.PI * getRadio() * (getRadio() + altura);
    }

    public double volumen() {
        return super.area() * altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
            "radio=" + getRadio() +
            ", altura=" + altura +
            ", area=" + area() +
            ", volumen=" + volumen() +
            '}';
    }

}
