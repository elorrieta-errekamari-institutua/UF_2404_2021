package com.elorrieta.metodos;

import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {

		// si el sueldo es mayor que 1000 se aplica un IVA del 5%
		// si el sueldo es si es menor 1000 se aplica un IVA del 0%
		// si el sueldo es mayor que 2000 se aplica un IVA del 10%
		// si el sueldo es mayor que 5000 se aplica un IVA del 25%

		float sueldo = 0;
		float iva = 0;
		float precioConIva = 0;

		// Solicitar por pantalla el sueldo
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu sueldo");
		sueldo = sc.nextFloat();
		sc.close();

		// calcular iva
		if (sueldo > 1000 && sueldo <= 2000) {
			iva = 5;
		} else {
			if (sueldo > 2000 && sueldo <= 5000) {
				iva = 10;
			} else if (sueldo > 5000) {
				iva = 25;
			}
		}

		// calculamos el iva y lo guardamos en una variable
		precioConIva = Utilidades.calcularIva(sueldo, iva);

		System.out.println("Con el sueldo: " + sueldo);
		System.out.println("Aplicamos IVA: " + iva);
		System.out.println("total: " + precioConIva);

	}

}
