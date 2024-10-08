package com.example;

public class Libro extends Publicacion{
    private String numPag;
    private String anoPublicacion;
    private float precioLibro;

    public Libro(String titulo, float precio, float precioLibro, String numPag, String anoPublicacion){
        super(titulo, precio);
        this.precioLibro = precioLibro;
        this.numPag = numPag;
        this.anoPublicacion = anoPublicacion;
    }


    public String getNumPag() {
        return numPag;
    }

    public void setNumPag(String numPag) {
        this.numPag = numPag;
    }

    public String getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(String anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public float getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(float precioLibro) {
        this.precioLibro = precioLibro;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "numero de paginas ='" + numPag + '\'' +
                ", ano de Publicacion='" + anoPublicacion + '\'' +
                ", precio del Libro=" + precioLibro +
                '}';
    }


}
