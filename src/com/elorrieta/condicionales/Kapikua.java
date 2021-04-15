package com.elorrieta.condicionales;

import java.util.Scanner;

public class Kapikua {

	public static void main(String[] args) {

		int numero = 0;
		int numeroSinModificaR = 0;
		int inverso = 0;
		int resto = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un numero entero");
		numero = teclado.nextInt();
		numeroSinModificaR = numero;

		while (numero > 0) {

			resto = numero % 10;
			inverso = inverso * 10 + resto;
			numero = numero / 10;
		}

		// TODO depurar y solucionar bug
		if (numeroSinModificaR == inverso) {
			System.out.println("Es kapikua");
		} else {
			System.out.println("NO Es kapikua");
		}

		teclado.close();

	}

}
