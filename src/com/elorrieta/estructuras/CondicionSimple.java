package com.elorrieta.estructuras;

import java.util.Scanner;

public class CondicionSimple {

	public static void main(String[] args) {

		int sueldo = 0;
		final int SUELDO_PAGAR_IMPUESTOS = 3000;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime tu sueldo:");
		sueldo = teclado.nextInt();

		if (sueldo > SUELDO_PAGAR_IMPUESTOS) {
			System.out.println("Te toca pagar impuestos");
		} else {
			System.out.println("Libras");
		}

		teclado.close();

	}

}
