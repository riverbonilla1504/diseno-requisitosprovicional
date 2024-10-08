package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("1. caso de estudio de publicaciones y libros");
            System.out.println("2. caso de estudio de nombre y direccion ");
            System.out.println("3. caso de estudio circulo, cilindro y cilindro hueco");
            System.out.println("0. Exit");
            System.out.print("ingresa numero correspondiente al ejemplo que deseas ver: ");
            int option = scanner.nextInt(); 

            switch (option) {
            case 1:
            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.next();
            System.out.print("Ingrese el precio del libro: ");
            float precio = scanner.nextFloat();
            System.out.print("Ingrese el número de páginas del libro: ");
            String numPag = scanner.next();
            System.out.print("Ingrese el año de publicación del libro: ");
            String anoPublicacion = scanner.next();

            Libro libro = new Libro(titulo, precio, precio , numPag, anoPublicacion);
            System.out.println(libro.toString());
                break;
            case 2:
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.next();
            System.out.print("Ingrese el primer apellido: ");
            String primerApellido = scanner.next();
            System.out.print("Ingrese el segundo apellido: ");
            String segundoApellido = scanner.next();
            System.out.print("Ingrese la calle: ");
            String calle = scanner.next();
            System.out.print("Ingrese la ciudad: ");
            String ciudad = scanner.next();
            System.out.print("Ingrese el departamento: ");
            String departamento = scanner.next();
            System.out.print("Ingrese el código postal: ");
            int codigoPostal = scanner.nextInt();
                
            Direccion direccion = new Direccion(nombre, primerApellido, segundoApellido, calle, ciudad, departamento, codigoPostal);
            System.out.println(direccion.toString());

            System.out.println("desea cambiar la direccion? yes/no");
            if(scanner.next().equals("yes")){
                System.out.print("Ingrese la calle: ");
                calle = scanner.next();
                System.out.print("Ingrese la ciudad: ");
                ciudad = scanner.next();
                System.out.print("Ingrese el departamento: ");
                departamento = scanner.next();
                System.out.print("Ingrese el código postal: ");
                codigoPostal = scanner.nextInt();
                direccion.setCalle(calle);
                direccion.setCiudad(ciudad);
                direccion.setDepartamento(departamento);
                direccion.setCodigoPostal(codigoPostal);
                System.out.println(direccion.toString());
            }
                
                break;
            case 3:

            System.out.print("Ingrese el radio del circulo: ");
            float radio = scanner.nextFloat();
            Circulo circulo = new Circulo(radio);
            System.out.println(circulo.toString());

            System.out.print("Ingrese la altura del cilindro: ");
            float altura = scanner.nextFloat();
            Cilindro cilindro = new Cilindro(radio, altura);
            System.out.println(cilindro.toString());

            System.out.print("Ingrese el radio interno del cilindro hueco: ");
            float radioInterno = scanner.nextFloat();
            CilindroHueco cilindroHueco = new CilindroHueco(radio, altura, radioInterno);
            System.out.println(cilindroHueco.toString());
                
                break;
            default:
                System.out.println("numero invalido");
                break;
            }
            // Add a condition to break the loop to avoid infinite loop in this example
            if (option == 0) {
            break;
            }
        }

        scanner.close();
    }
}