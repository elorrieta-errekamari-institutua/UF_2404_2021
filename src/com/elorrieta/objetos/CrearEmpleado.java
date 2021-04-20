package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearEmpleado {

	public static void main(String[] args) {

		System.out.println("Alta Nuevo Empleado");
		System.out.println("---------------------");

		// pedir datos y validarlos
		String nombre = "";
		float sueldo = 0;
		boolean becario = false;
		Scanner sc = new Scanner(System.in);

		// nombre
		do {
			System.out.println("Nombre (minimo 5 letras)");
			nombre = sc.nextLine();
		} while (nombre.length() < 5);

		// es becario?
		System.out.println("¿ Es becario ? escribe S o N ");
		String respuesta = sc.nextLine();
		if ("s".equalsIgnoreCase(respuesta) || "si".equalsIgnoreCase(respuesta)) {
			becario = true;
		}

		if (!becario) { // becario != true
			do {
				System.out.println("Dime el sueldo en euros ( minimo " + Empleado.SUELDO_MINIMO + ")");
				try {
					sueldo = Float.parseFloat(sc.nextLine());
				} catch (Exception e) {
					System.out.println("Formato no correcto, por favor intentalo de nuevo");
					// e.printStackTrace(); // pinta la traza de la Exception en pantalla
				}
			} while (sueldo < Empleado.SUELDO_MINIMO);
		}

		sc.close();

		// crear objeto empleado
		Empleado emp = new Empleado();
		emp.setNombre(nombre);
		emp.setSueldo(sueldo);
		emp.setBecario(becario);

		// mostrar por pantalla
		System.out.println(emp);

	}// main

}
