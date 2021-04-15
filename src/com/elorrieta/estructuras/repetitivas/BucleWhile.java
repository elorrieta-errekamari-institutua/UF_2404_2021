package com.elorrieta.estructuras.repetitivas;

public class BucleWhile {

	public static void main(String[] args) {

		System.out.println("Inicia programa");

		int x = 1;

		while (x <= 5) {
			System.out.println("iteracion con while " + x);
			x++;
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println("iteracion con for " + i);
		}

		System.out.println("Termina programa");
	}

}
