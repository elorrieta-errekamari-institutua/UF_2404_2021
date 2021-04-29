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
					System.out.println("****TODO*****dar de Baja, servicio no disponible");
					break;
				}
				case "4": {
					System.out.println("****TODO*****Modificar, servicio no disponible");
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

	private static void cargarVehiculos() {

		stock.add(new Vehiculo("134 CMS", "rojo"));

		Vehiculo v = new Vehiculo();
		v.setColor("negro");
		v.setMatricula("2365 JKL");
		stock.add(v);

	}

	private static void darDeAlta() {
		System.out.println("****TODO*****dar de alta, servicio no disponible");

		// Pedir todos los datos de un Vehiculo

		// crear obejto con esos datos

		// añadirlo en la coleccion 'stock'

		// CUIDADO con las excepciones al parsear

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
