package com.elorrieta.excepciones;

import java.util.Scanner;

public class CuadradoNumero {

	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		boolean repetir = true;
		System.out.print("Ingrese un valor entero:");
		do {
			try {
				String respuesta = teclado.nextLine();
				// si lanza excepcion la sentencia de abajo no se ejecuta, va directo al catch
				num = Integer.parseInt(respuesta);
				repetir = false;
			} catch (Exception e) {
				System.out.println("Tienes que escribir un numero, prueba de nuevo:");
			}
		} while (repetir);

		int cuadrado = num * num;
		System.out.print("El cuadrado de " + num + " es " + cuadrado);
	}

}
