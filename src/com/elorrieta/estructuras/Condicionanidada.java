package com.elorrieta.estructuras;

import java.util.Scanner;

public class Condicionanidada {

	public static void main(String[] args) {

		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		int media = 0;
		final int ASIGNATURAS = 3;
		final int MEDIA_PROMOCIONADO = 7;
		final int MEDIA_REGULAR = 4;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime 1º nota:");
		nota1 = teclado.nextInt();

		System.out.println("Dime 2º nota:");
		nota2 = teclado.nextInt();

		System.out.println("Dime 3º nota:");
		nota3 = teclado.nextInt();

		media = (nota1 + nota2 + nota3) / ASIGNATURAS;

		if (media >= MEDIA_PROMOCIONADO) {
			System.out.println("Estas promocionado");
		} else {

			if (media >= MEDIA_REGULAR) {
				System.out.println("Eres Regular");
			} else {
				System.out.println("Estas Reaprobado");
			}

		} // 1º condicion

		teclado.close();

	}// main

}
