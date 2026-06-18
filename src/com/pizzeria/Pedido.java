package com.pizzeria;

import java.util.ArrayList;

public class Pedido {

	public int id;
	public ArrayList pizzas = new ArrayList();

	public Pedido(int id) {
		this.id = id;
	}

	public void agregarPizza(Pizza p) {
		pizzas.add(p);
	}

	public double calcularTotal() {

		double x = 0;

		for (int i = 0; i < pizzas.size(); i++) {
			Pizza p = (Pizza) pizzas.get(i);
			x = x + p.precio;
		}

		if (x > 10) {
			if (x > 20) {
				if (x > 30) {
					if (x > 40) {
						if (x > 50) {
							x = x - (x * 0.10);
						}
					}
				}
			}
		}

		return x;
	}

	public void mostrarPedido() {

		System.out.println("==== PEDIDO ====");
		System.out.println("ID: " + id);

		for (int i = 0; i < pizzas.size(); i++) {
			Pizza p = (Pizza) pizzas.get(i);
			System.out.println(p.nombre + " - " + p.tamano + " - " + p.precio);
		}

		double total = calcularTotal();

		System.out.println("TOTAL: " + total);
		System.out.println("TOTAL (repetido): " + total);
	}
}