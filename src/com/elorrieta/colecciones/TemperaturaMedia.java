package com.elorrieta.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Pedir por pantalla temperaturas hasta que se aburra el usuario. Ir
 * guardandolas una a una en unn array. Al terminar recorrer array y mostrar
 * media.
 * 
 * @author Admin
 *
 */
public class TemperaturaMedia {

	public static void main(String[] args) {

		ArrayList<Integer> temperaturas = new ArrayList<Integer>();
		int suma = 0;
		int temp = 0;
		final int SALIR = 888;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Dime la temperatura: ( escribe 888 para salir)");
			temp = Integer.parseInt(sc.nextLine());

			if (temp != SALIR) {
				temperaturas.add(temp);
				suma = suma + temp; // suma += temp;
			}

		} while (temp != SALIR);
		System.out.println("La media es " + (suma / temperaturas.size()));

		System.out.println("Detalle de las temperaturas:");
		for (Integer tempActual : temperaturas) {
			System.out.println(tempActual);
		}

		sc.close();

	}

}
