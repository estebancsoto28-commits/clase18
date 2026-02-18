package com.example;

public class Main {

    public static void main(String[] args) {

        // Objeto 1 usando constructor vacío
        Vehiculo carro1 = new Vehiculo();

        // Usando setters
        carro1.setMarca("Mazda");
        carro1.setModelo("CX-5");
        carro1.setAnio(2022);
        carro1.setPrecio(85000);

        // Mostrando con toString
        System.out.println("Carro 1:");
        System.out.println(carro1);

        System.out.println("----------------------");

        // Objeto 2 usando constructor con parámetros
        Vehiculo carro2 = new Vehiculo("Toyota", "Corolla", 2020, 45000);

        // Modificando con setter
        carro2.setPrecio(43000);

        // Mostrando información
        System.out.println("Carro 2:");
        System.out.println(carro2);
    }
}

