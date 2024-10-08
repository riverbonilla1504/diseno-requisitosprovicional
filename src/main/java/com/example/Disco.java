package com.example;

public class Disco extends Publicacion {
    private int minDuracion;
    private float precioDisco;

    public Disco(String titulo, float precio, float precioDisco, int minDuracion){
        super(titulo, precio);
        this.precioDisco = precioDisco;
        this.minDuracion = minDuracion;
    }

    public int getMinDuracion() {
        return minDuracion;
    }
    public void setMinDuracion(int minDuracion) {
        this.minDuracion = minDuracion;
    }

    public float getPrecioDisco() {
        return precioDisco;
    }
    public void setPrecioDisco(float precioDisco) {
        this.precioDisco = precioDisco;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "minDuracion=" + minDuracion +
                ", precioDisco=" + precioDisco +
                '}';
    }




}
