package com.elorrieta.calificadores;

public class Clase1Hija extends Clase1 {

	public static void main(String[] args) {

		// es publico, puedo todo el munbdo
		String b = Clase1.a1;

		// como es de mi paquete puedo
		String c = Clase1.aPackaged;

		// como soy hijo puedo
		String a = Clase1.aprotected;

		// es privado
		// String d = Clase1.aprivado;

	}

}
