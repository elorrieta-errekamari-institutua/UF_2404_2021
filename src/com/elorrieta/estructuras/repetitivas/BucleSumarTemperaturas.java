package com.elorrieta.estructuras.repetitivas;

import java.util.Scanner;

/**
 * Pedir por teclado las temperaturas del dia, seguir pidiendo la siguiente
 * temperatura miestra no se escriba "888". Al finalizar mostrar la media de las
 * temperaturas
 * 
 * @author Admin
 *
 */
public class BucleSumarTemperaturas {

	public static void main(String[] args) {

		float temperatura = 0;
		float total = 0; // suma de todas las temperaturas
		int numeroTemperaturas = 0;
		final int SALIR = 888;
		Scanner teclado = new Scanner(System.in);

		// BUCLE para pedir temperaturas y sumarlas
		do {
			System.out.println("Dime la temperatura (o 888 para salir):");
			temperatura = teclado.nextFloat();

			// realizar operaciones si no queremos SALIR
			if (temperatura != SALIR) {
				total += temperatura; // total = total + temperatura;
				numeroTemperaturas++;
			}
		} while (temperatura != SALIR);

		// mostrar media
		System.out.println("Media :" + (total / numeroTemperaturas));
		teclado.close();

	}

}
