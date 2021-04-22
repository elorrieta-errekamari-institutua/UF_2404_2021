package com.elorrieta.colecciones;

import java.util.ArrayList;

import com.elorrieta.objetos.Cancion;

public class CancionesPiperrak {

	public static void main(String[] args) throws Exception {

		int totalSegundos = 0;
		int mediaSegundos = 0;
		Cancion cMasLarga = new Cancion();
		Cancion cMasCorta = new Cancion();

		ArrayList<Cancion> canciones = new ArrayList<Cancion>();

		Cancion c = new Cancion();
		c.setNombre("Kualkier dia");
		c.setDuracion(4, 13);
		canciones.add(c);

		c = new Cancion();
		c.setNombre("Mi Primer Amor");
		c.setDuracion(2, 54);
		canciones.add(c);

		c = new Cancion();
		c.setNombre("Ke le voy hacer");
		c.setDuracion(2, 47);
		canciones.add(c);

		System.out.println(canciones);

		for (Cancion cancion : canciones) {

			int duracionMasLarga = cMasLarga.getDuracion();
			int duracionMasCorta = cMasCorta.getDuracion();
			int duracionActual = cancion.getDuracion();

			totalSegundos += duracionActual;

			if (duracionMasLarga < duracionActual) {
				cMasLarga = cancion;
			}

			// BUG cuidado duracion 0 nunca se va a actualizar
			if (duracionMasCorta > duracionActual) {
				cMasCorta = cancion;
			}

		}

		System.out.println("Total segundos: " + totalSegundos);
		System.out.println("Media segundos: " + totalSegundos / canciones.size());
		System.out.println("Cancion mas Larga: " + cMasLarga.getNombre() + " " + cMasLarga.getDuracion() + " seg");
		System.out.println("Cancion mas Corta: " + cMasCorta.getNombre() + " " + cMasCorta.getDuracion() + " seg");

	}

}
