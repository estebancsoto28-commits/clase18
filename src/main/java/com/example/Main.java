package com.example;

public class Main {

    public static void main(String[] args) {

        // Objeto 1 con constructor vacío
        Product p1 = new Product();

        p1.setId("P001");
        p1.setName("Laptop");
        p1.setPrice(2500);
        p1.setStock(10);

         System.out.println("Producto 1:");
        System.out.println("Nombre: " + p1.getName());
        System.out.println("Precio: " + p1.getPrice());
        System.out.println(p1);

        System.out.println("----------------------");

        // Objeto 2 con constructor lleno
        Product p2 = new Product("P002", "Mouse", 50, 100);

        p2.setPrice(45);

        System.out.println("Producto 2:");
        System.out.println("Stock: " + p2.getStock());
        System.out.println("Precio: " + p2.getPrice());
        System.out.println(p2);
    }
}