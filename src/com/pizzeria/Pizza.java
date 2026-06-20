package com.pizzeria;

/**
 * Representa una pizza dentro del sistema de la pizzería.
 * Almacena la información básica sobre el nombre, tamaño y precio del producto.
 * * @author [Tu Nombre]
 * @version 1.0
 */
public class Pizza {

    /** Nombre o tipo de la pizza (ej. Margherita, Pepperoni). */
    private String nombre;
    
    /** Tamaño de la pizza (ej. Familiar, Mediana, Individual). */
    private String tamano;
    
    /** Precio de venta de la pizza en euros. */
    private double precio;

    /**
     * Constructor completo para instanciar una nueva Pizza.
     * * @param nombre Nombre identificativo de la pizza.
     * @param tamano Tamaño asignado a la pizza.
     * @param precio Precio base de comercialización.
     */
    public Pizza(String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre de la pizza.
     * * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el tamaño de la pizza.
     * * @return El tamaño actual de la pizza.
     */
    public String getTamano() {
        return tamano;
    }

    /**
     * Obtiene el precio de la pizza.
     * * @return El precio de la pizza en formato double.
     */
    public double getPrecio() {
        return precio;
    }
}
