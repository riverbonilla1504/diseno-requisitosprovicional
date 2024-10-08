package com.example;

public class CilindroHueco extends Cilindro {
    private double radioInterno;

    public CilindroHueco(double radio, double altura, double radioInterno) {
        super(radio, altura);
        this.radioInterno = radioInterno;
    }

    public double getRadioInterno() {
        return radioInterno;
    }

    public double longitud() {
        return 2 * Math.PI * getRadio();
    }

    @Override
    public double area() {
        return 2 * Math.PI * getRadio() * (getRadio() + getAltura()) - 2 * Math.PI * radioInterno * (radioInterno + getAltura());
    }

    @Override
    public double volumen() {
        return super.area() * getAltura();
    }

    @Override
    public String toString() {
        return "CilindroHueco{" +
            "radio=" + getRadio() +
            ", altura=" + getAltura() +
            ", radioInterno=" + radioInterno +
            ", longitud=" + longitud() +
            ", area=" + area() +
            ", volumen=" + volumen() +
            '}';
    }

}
