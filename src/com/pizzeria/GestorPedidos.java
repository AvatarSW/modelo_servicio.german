package com.pizzeria;

import java.util.ArrayList;

public class GestorPedidos {

	private ArrayList pedidos = new ArrayList();

	public void agregarPedido(Pedido p) {
		pedidos.add(p);
	}

	public Pedido buscarPedido(int id) {

		for (int i = 0; i < pedidos.size(); i++) {
			Pedido p = (Pedido) pedidos.get(i);

			if (p.id == id) {
				return p;
			}
		}

		return null;
	}

	public int totalPedidos() {
		return pedidos.size();
	}

	public void imprimirResumen() {

		System.out.println("==== RESUMEN ====");

		for (int i = 0; i < pedidos.size(); i++) {
			Pedido p = (Pedido) pedidos.get(i);
			System.out.println("Pedido ID: " + p.id);
			System.out.println("Total: " + p.calcularTotal());
		}
	}
}