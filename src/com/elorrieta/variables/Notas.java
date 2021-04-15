package com.elorrieta.variables;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		// constantes
		final float VALOR_30 = 0.3f;
		final float VALOR_70 = (float) 0.7;

		// variables
		float nota1 = 0;
		float nota2 = 0;
		float nota3 = 0;
		float nota4 = 0;
		float nota5 = 0;
		float media = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("1º nota");
		nota1 = Float.parseFloat(teclado.nextLine());

		System.out.println("2º nota");
		nota2 = Float.parseFloat(teclado.nextLine());

		System.out.println("3º nota");
		nota3 = Float.parseFloat(teclado.nextLine());

		System.out.println("4º nota");
		nota4 = Float.parseFloat(teclado.nextLine());

		System.out.println("5º nota");
		nota5 = Float.parseFloat(teclado.nextLine());

		/*
		 * Las 4 primeras notas corresponde a las UF y tiene un valor del 30% La ultima
		 * nota corresponde al MF y tiene un valor del 70%
		 * 
		 */

		media = ((nota1 + nota2 + nota3 + nota4) / 4 * VALOR_30) + (nota5 * VALOR_70);
		System.out.println("La media es " + media);
		teclado.close();
	}

}
