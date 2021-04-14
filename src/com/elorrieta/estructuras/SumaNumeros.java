package com.elorrieta.estructuras;

import java.util.Scanner;

public class SumaNumeros {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int resultado = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime 1º número:");
		num1 = teclado.nextInt();

		System.out.println("Dime 2º número:");
		num2 = teclado.nextInt();

		resultado = num1 + num2;

		System.out.println(num1 + " + " + num2 + " = " + resultado);
		// si quereis saber mas https://www.baeldung.com/java-printstream-printf
		System.out.printf("La suma de %s + %s = %s", num1, num2, resultado);

		teclado.close();
	}

}
