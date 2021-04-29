package com.elorrieta.calificadores;

public class Clase2 {

	static String a2;

	public static void main(String[] args) {

		String aa = Clase1.a1; // es publico puedo acceder
		String bb = Clase1.aPackaged;

		// como es de mi paquete puedo
		String c = Clase1.aprotected;

	}
}
