package com.example;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double circunferencia() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
            "radio=" + radio +
            ", area=" + area() +
            ", circunferencia=" + circunferencia() +
            '}';
    }

}
