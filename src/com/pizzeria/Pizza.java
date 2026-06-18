package com.pizzeria;

public class Pizza {

    private String nombre;
    private String tamano;
    private double precio;

    public Pizza(String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public double getPrecio() {
        return precio;
    }
}
