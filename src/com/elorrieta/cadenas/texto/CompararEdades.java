package com.elorrieta.cadenas.texto;

import java.util.Scanner;

public class CompararEdades {

	public static void main(String[] args) {

		int edad1 = 0;
		int edad2 = 0;
		float altura1 = 0;
		float altura2 = 0;
		String nombre1 = "";
		String nombre2 = "";

		Scanner teclado = new Scanner(System.in);

		System.out.println("Nombre 1º persona");
		nombre1 = teclado.nextLine();

		System.out.println("Edad 1º persona");
		edad1 = Integer.parseInt(teclado.nextLine()); // convertido el String a int

		System.out.println("Dime tu altura en metros, por ejemplo 1,70");
		altura1 = Float.parseFloat(teclado.nextLine());

		System.out.println("Nombre 2º persona");
		nombre2 = teclado.nextLine();

		System.out.println("Edad 2º persona");
		edad2 = Integer.parseInt(teclado.nextLine());

		System.out.println("Dime tu altura en metros, por ejemplo 1,70");
		altura2 = Float.parseFloat(teclado.nextLine());

		if (edad1 > edad2) {
			System.out.println(nombre1 + " es mas viejuno");
		} else {
			System.out.println(nombre2 + " es mas viejuno");
		}

		if (altura1 > altura2) {
			System.out.println(nombre1 + " es mas alto");
		} else {
			System.out.println(nombre2 + " es mas alto");
		}

		teclado.close();
	}

}
