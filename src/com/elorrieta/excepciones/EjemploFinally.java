package com.elorrieta.excepciones;

import java.util.Scanner;

public class EjemploFinally {

	public static void main(String[] args) {

		System.out.println("Inicio del programa");

		try (Scanner teclado = new Scanner(System.in)) {

			System.out.println("Dime un numero");
			int numero = Integer.parseInt(teclado.nextLine());
			System.out.println("Tu numero es " + numero);
		} catch (Exception e) {
			System.out.println("Hemos tenido un Excepcion!!!!");
		} finally {
			System.out.println("Esto se ejecuta siempre, haya Excepction o no");
			// teclado.close(); se cierra automaticamente, porque esta declarado en el TRY
		}

		System.out.println("Fin del programa");

	}

}
