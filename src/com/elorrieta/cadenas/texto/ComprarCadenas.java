package com.elorrieta.cadenas.texto;

public class ComprarCadenas {

	public static void main(String[] args) {

		String nombre1 = "Ander";
		String nombre2 = "ander";

		// NO usar nunca . nombre1 == nombre2
		if (nombre1.equals(nombre2)) {
			System.out.println("Los dos nombres son iguales,comparando mayusculas y minusculas");
		} else {
			System.out.println("Los dos nombres son diferentes,comparando mayusculas y minusculas");
		}

		if (nombre1.equalsIgnoreCase(nombre2)) {
			System.out.println("Los dos nombres son iguales,SIN comparando mayusculas y minusculas");
		} else {
			System.out.println("Los dos nombres son diferentes,SIN comparando mayusculas y minusculas");
		}

	}
}
