package com.elorrieta.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuConcesionario {

	// variables global para todos los metodos de esta clase
	private static Scanner sc = new Scanner(System.in);
	private static String opcion = "";
	private static ArrayList<Vehiculo> stock = new ArrayList<Vehiculo>();

	public static void main(String[] args) {
		System.out.println("Bienvenido");

		try {

			cargarVehiculos();

			do {

				menu();
				leerOpcion();

				switch (opcion) {
				case "1": {
					listar();
					break;
				}
				case "2": {
					darDeAlta();
					break;
				}
				case "3": {
					darDeBaja();
					break;
				}
				case "4": {
					modificar();
					break;
				}
				case "s": {
					System.out.println("Adios");
					break;
				}

				default:
					System.out.println(opcion + " opcion no disponible");
				}

			} while (!"s".equalsIgnoreCase(opcion));

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Termina programa");
	}// main

	private static void darDeBaja() {
		System.out.println("Dar de Baja");
		System.out.println("-----------------------------");

		// Pedir todos los datos de un Vehiculo
		System.out.println("Dime la Matricula:");
		String matricula = sc.nextLine();

		// TODO crear funcion para reutilzarlo
		boolean encontrado = false;
		for (Vehiculo v : stock) {

			if (matricula.equalsIgnoreCase(v.getMatricula())) {
				encontrado = true;
				stock.remove(v);
				System.out.println("Vehiculo enviado al desguace");
				break;
			}

		} // for

		if (!encontrado) {
			System.out.println("Vehiculo no encontrado");
		}

	}// darDeBaja

	private static void modificar() {

		Vehiculo vm = new Vehiculo(); // VehiculoModificar
		boolean encontrado = false;

		System.out.println("Modificar");
		System.out.println("-----------------------------");
		System.out.println("Dime la Matricula:");
		String matricula = sc.nextLine();

		// TODO crear funcion para reutilzarlo
		// buscar por matricula
		for (Vehiculo v : stock) {
			if (matricula.equalsIgnoreCase(v.getMatricula())) {
				encontrado = true;
				vm = v;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Vehiculo no encontrado");

		} else {
			// Pedir datos nuevos
			System.out.println("Matricula(" + vm.getMatricula() + "):");
			vm.setMatricula(sc.nextLine());

			System.out.println("Color(" + vm.getColor() + "):");
			vm.setColor(sc.nextLine());

			System.out.println("Asientos(" + vm.getAsientos() + "):");
			boolean error = true;
			do {
				try {
					vm.setAsientos(Integer.parseInt(sc.nextLine()));
					error = false;
				} catch (Exception e) {
					System.out.println("es incorrecto, prueba de nuevo:");
				}
			} while (error);

			// TODO Ruedas

		}

	}// modificar

	private static void cargarVehiculos() {

		stock.add(new Vehiculo("134 CMS", "rojo"));

		Vehiculo v = new Vehiculo();
		v.setColor("negro");
		v.setMatricula("2365 JKL");
		stock.add(v);

	}

	private static void darDeAlta() {

		System.out.println("Datos para el nuevo vehiculo");
		System.out.println("-----------------------------");

		// Pedir todos los datos de un Vehiculo
		System.out.println("Matricula:");
		String matricula = sc.nextLine();

		System.out.println("Color:");
		String color = sc.nextLine();

		System.out.println("Asientos:");
		boolean error = true;
		int asientos = 0;
		do {
			try {
				asientos = Integer.parseInt(sc.nextLine());
				error = false;
			} catch (Exception e) {
				System.out.println("es incorrecto, prueba de nuevo:");
			}
		} while (error);

		// TODO repetir jugada de arriba, ahora voy a procrastinar
		System.out.println("Ruedas:");
		int ruedas = Integer.parseInt(sc.nextLine());

		// crear obejto con esos datos
		Vehiculo v = new Vehiculo(matricula, color, asientos, ruedas);

		// añadirlo en la coleccion 'stock'
		stock.add(v);

	}

	private static void listar() {
		System.out.println("--------------------------------------");
		System.out.println(" Listado Vehiculos");
		System.out.println("--------------------------------------");
		for (Vehiculo vehiculo : stock) {
			System.out.println(vehiculo);
		}
		System.out.println("");
		System.out.println("");

	}

	private static void leerOpcion() {
		System.out.println("Elije una opcion del menu:");
		opcion = sc.nextLine();

	}

	private static void menu() {
		System.out.println("1. Listar");
		System.out.println("2. Dar de Alta");
		System.out.println("3. Dar de baja");
		System.out.println("4. modificar");
		System.out.println("------------------");
		System.out.println("S- salir");
	}

}
