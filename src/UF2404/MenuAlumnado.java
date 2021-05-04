package UF2404;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuAlumnado {

	private static Scanner sc = new Scanner(System.in);
	private static String opcion = "";
	private static ArrayList<Alumno> clase = new ArrayList<Alumno>();

	public static void main(String[] args) {

		System.out.println("Bienvenido");

		try {

			cargarAlumnado();

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

	}// main

	private static void darDeAlta() {

		int edad = 16;
		boolean isEnfermo = false;
		boolean error = true;
		String repetir = "";
		Alumno a = new Alumno();

		System.out.println("Por favor introduzca los datos:");

		// Nombre
		System.out.println("Digame el nombre");
		String nombre = sc.nextLine();
		a.setNombre(nombre);

		// Apellidos
		System.out.println("Digame los apellidos");
		String apellidos = sc.nextLine();
		a.setApellidos(apellidos);

		// Edad
		do {
			System.out.printf("Digame la edad (Debe ser mayor de %s y menor que %s) \n", Alumno.EDAD_MINIMA,
					Alumno.EDAD_MAX);

			try {
				edad = Integer.parseInt(sc.nextLine());
				a.setEdad(edad);
			} catch (Exception e) {
				System.out.println("Formato incorrecto, por favor pruebe de nuevo.");
			}
		} while (edad <= 3);

		// Enfermo
		System.out.println("Digame si esta enfermo (escriba si o no)");
		String respuesta = sc.nextLine();
		if ("s".equalsIgnoreCase(respuesta) || "si".equalsIgnoreCase(respuesta)) {
			isEnfermo = true;

		}
		a.setEnfermo(isEnfermo);

		// Preguntar por Asignaturas
		System.out.println("Asignaturas en las que esta matriculado");
		System.out.println("---------------------------------------");

		do {
			Asignatura asigNueva = new Asignatura();

			// Nombre Asigntura
			System.out.println("Dime el nombre:");
			String nomAsig = sc.nextLine();
			asigNueva.setNombre(nomAsig);

			// Nota Asigantura
			error = true;
			do {
				try {
					System.out.println("Dime la nota [0-10]:");
					float nota = Float.parseFloat(sc.nextLine());
					asigNueva.setNota(nota);
					error = false;
				} catch (AsignaturaException e) {
					System.out.println(e.getMessage());

				} catch (Exception e) {
					System.out.println("Nota incorrecta, por favor usa numeros");
				}
			} while (error);

			// Guardar Asigntura en el Alumno
			a.setAsignatura(asigNueva);

			System.out.println("¿ Quieres añadir una nueva Asignatura ? Si o No");
			repetir = sc.nextLine();

		} while ("si".equalsIgnoreCase(repetir) || "s".equalsIgnoreCase(repetir));

		// añadirlo en la coleccion 'stock'
		clase.add(a);

	}// darDeAlta

	private static void listar() {
		System.out.println("--------------------------------------");
		System.out.println(" Listado de alumnos");
		System.out.println("--------------------------------------");
		for (Alumno alumno : clase) {
			// System.out.println(alumno);
			System.out.println("Nombre: " + alumno.getNombre() + ", " + alumno.getApellidos());
			System.out.println("Edad: " + alumno.getEdad() + " Años");
			System.out.println("Enfermo: " + (alumno.isEnfermo() ? "Si" : "No"));

			System.out.println("Asignaturas:");
			ArrayList<Asignatura> asignaturasMatriculado = alumno.getAsignaturas();
			for (Asignatura ai : asignaturasMatriculado) {
				System.out.printf("  [%s] %s \n", ai.getNota(), ai.getNombre());
			}

			System.out.println("Nota Media: " + alumno.getNotaMedia());
			System.out.println("------------------------------------");
		}

		System.out.println("");
	}// listar

	private static void leerOpcion() {
		System.out.println("Elije una opcion del menu:");
		opcion = sc.nextLine();
	}

	private static void menu() {
		System.out.println("1. Listar");
		System.out.println("2. Dar de Alta");
		System.out.println("------------------");
		System.out.println("S- salir");
	}

	private static void cargarAlumnado() throws Exception {

		// Asignaturas
		Asignatura a1 = new Asignatura("Matematicas", 6);
		Asignatura a2 = new Asignatura("Lengua Castellana", 7.5f);
		Asignatura a3 = new Asignatura("Educacion Física", 1);

		Alumno a = new Alumno();
		a.setNombre("Martin");
		a.setApellidos("Sanchez Gutierrez");
		a.setEdad(25);
		a.setEnfermo(false);
		// asignaturas
		a.setAsignatura(a1);
		a.setAsignatura(a2);
		a.setAsignatura(a3);
		clase.add(a);

		Asignatura a12 = new Asignatura("Matematicas", 9);
		Asignatura a22 = new Asignatura("Lengua Castellana", 4.5f);
		Alumno b = new Alumno();
		b.setNombre("Monica");
		b.setApellidos("Perez Gutierrez");
		b.setEdad(22);
		b.setEnfermo(true);
		b.setAsignatura(a12);
		b.setAsignatura(a22);
		clase.add(b);

		Alumno c = new Alumno();
		c.setNombre("Pepe");
		c.setApellidos("Sanchez Fuente");
		c.setEdad(45);
		c.setEnfermo(false);

		clase.add(c);

	}// cargarAlumnado

}
