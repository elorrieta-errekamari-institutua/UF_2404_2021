package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearCancion {

	public static void main(String[] args) {

		// variables
		String nombre = "";
		String grupo = "";
		int duracion = 0;
		Cancion c = new Cancion();
		Scanner sc = new Scanner(System.in);

		System.out.println("Alta Nuevo Cancion");
		System.out.println("---------------------");

		// nombre
		System.out.println("Nombre de la cancion:");
		nombre = sc.nextLine();
		c.setNombre(nombre);

		// grupo
		System.out.println("Nombre del Grupo:");
		grupo = sc.nextLine();
		c.setGrupo(grupo);

		// duracion
		System.out.println("Duracion en minutos de la cancion ( no puede exceder " + Cancion.DURACION_MAXIMA + " min)");
		boolean repetir = true;
		do {
			try {
				duracion = Integer.parseInt(sc.nextLine());
				c.setDuracion(duracion);
				repetir = false;
			} catch (NumberFormatException e) {
				System.out.println("duraciojn incorecta, debe ser un numero entero");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (repetir);

		System.out.println(c);
		sc.close();

	}

}
