package com.elorrieta.estructuras.repetitivas;

/**
 * Programna que muestra por pantalla los valores desde el 0 al 10 y luego
 * empieza a mostrar desde el 10 al cero.
 * 
 * 
 * 0 1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1
 * 
 * 
 * @author Admin
 *
 */
public class BucleForContarHaciaAlante {

	public static void main(String[] args) {

		System.out.println("-----------  FOR ---------------");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " \n "); // es lo mismo que printLN
		}

		for (int i = 9; i >= 0; i--) {
			System.out.println(i);
		}

		System.out.println("-----------  WHILE ---------------");
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++; // i = i + 1
		}

		i = 9; // inicializamos a 9 para el nuevo bucle
		while (i >= 0) {
			System.out.println(i);
			i--; // i = i - 1
		}

	}

}
