package com.pizzeria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaTest {

    @Test
    public void testConstructorYGetters() {
        Pizza p = new Pizza("Margarita", "Mediana", 8.50);
        assertEquals("Margarita", p.getNombre());
        assertEquals("Mediana", p.getTamano());
        assertEquals(8.50, p.getPrecio(), 0.001);
    }

    @Test
    public void testNombreVacio() {
        Pizza p = new Pizza("", "Individual", 6.0);
        assertEquals("", p.getNombre());
    }

    @Test
    public void testPrecioLimite() {
        Pizza p = new Pizza("Pepperoni", "Familiar", 0.0);
        assertEquals(0.0, p.getPrecio(), 0.001);
    }
}
