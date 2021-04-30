package com.elorrieta.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuConcesionarioFuncion {

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

		Vehiculo vBuscado = buscarPorMatricula(matricula);
		if (vBuscado == null) {
			System.out.println("Lo sentimos pero no existe");
		} else {
			stock.remove(vBuscado);
			System.out.println("Vehiculo enviado al desguace");
		}

	}// darDeBaja

	private static void modificar() {

		System.out.println("Modificar");
		System.out.println("-----------------------------");
		System.out.println("Dime la Matricula:");
		String matricula = sc.nextLine();

		Vehiculo vm = buscarPorMatricula(matricula);

		if (vm == null) {
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

	/**
	 * Busca un Vehiculo por su matricula en el array 'stock'
	 * 
	 * @param matricula String matricula a buscar
	 * @return Vehiculo con datos si encuentra, null si no lo encuentra
	 */
	private static Vehiculo buscarPorMatricula(String matricula) {
		Vehiculo v = null;
		for (Vehiculo vi : stock) {
			if (matricula.equalsIgnoreCase(vi.getMatricula())) {
				v = vi;
				break;
			}
		}
		return v;
	}

}
