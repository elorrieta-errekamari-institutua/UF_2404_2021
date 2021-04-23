package com.elorrieta.colecciones;

import java.util.ArrayList;

import com.elorrieta.objetos.Pokemon;

public class ListaPokemons {

	public static void main(String[] args) {

		ArrayList<Pokemon> coleccion = new ArrayList<Pokemon>();
		coleccion.add(new Pokemon("pikatxu", 1000, true));
		coleccion.add(new Pokemon("TXARMANDER", 500, false));
		coleccion.add(new Pokemon("Bulbasur", 5, true));
		coleccion.add(new Pokemon("Doraemon", 100, true));

		Pokemon pCaro = coleccion.get(0);
		Pokemon pBarato = coleccion.get(0);
		float totalDinero = 0;
		int brillantes = 0;
		int sinBrillo = 0;

		for (Pokemon pIteracion : coleccion) {

			totalDinero += pIteracion.getPrecio();

			if (pIteracion.getPrecio() > pCaro.getPrecio()) {
				pCaro = pIteracion;
			}

			if (pIteracion.getPrecio() < pBarato.getPrecio()) {
				pBarato = pIteracion;
			}

			if (pIteracion.isBrillante()) {
				brillantes++;
			}

			if (!pIteracion.isBrillante()) {
				sinBrillo++;
			}

		} // for

		System.out.println("Total Dinero: " + totalDinero);
		System.out.println("Media Dinero: " + (totalDinero / coleccion.size()));
		System.out.println("Pokemon mas caro: " + pCaro.getNombre());
		System.out.println("Pokemon mas barato: " + pBarato.getNombre());
		System.out.println("Pokemons brillantes " + brillantes + " sin brillo " + sinBrillo);

	}

}
