package com.example;

public class Direccion extends Nombre{
    private String calle;
    private String ciudad;
    private String departamento;
    private int codigoPostal;

    public Direccion(String nombre, String primerApellido, String segundoApellido, String calle, String ciudad, String departamento, int codigoPostal) {
        super(nombre, primerApellido, segundoApellido);
        this.calle = calle;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Direccion{" +
            "nombre='" + getNombre() + '\'' +
            ", primerApellido='" + getPrimerApellido() + '\'' +
            ", segundoApellido='" + getSegundoApellido() + '\'' +
            ", calle='" + calle + '\'' +
            ", ciudad='" + ciudad + '\'' +
            ", departamento='" + departamento + '\'' +
            ", codigoPostal=" + codigoPostal +
            '}';
    }


}
