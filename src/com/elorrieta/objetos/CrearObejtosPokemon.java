package com.elorrieta.objetos;

public class CrearObejtosPokemon {

	public static void main(String[] args) {

		// TODO crear toString en Pokemon
		// TODO crear la segunda cancion y mostrar por pantalla uno a uno los campos
		// TODO crear un pokemon, pero pedir los datos por pantalla con Scanner

		// vamos a crear objetos o instancias

		Cancion c1 = new Cancion();
		System.out.println(c1.toString());
		c1.setNombre("Enter SandMan");
		c1.setGrupo("Metallica");
		c1.setDuracion(46);
		System.out.println(c1.toString());

		// pikatxu
		Pokemon p1 = new Pokemon();
		p1.setNombre("Pikatxu");
		p1.setPrecio(20000);
		p1.setBrillante(true);
		p1.setNumero(0);

		System.out.println("nombre: " + p1.getNombre());
		System.out.println("precio: " + p1.getPrecio());
		System.out.println("brillante: " + p1.isBrillante());
		System.out.println("numero: " + p1.getNumero());

		// charmander
		Pokemon p2 = new Pokemon("charmander");
		p2.setBrillante(false);
		p2.setNumero(2);
		p2.setPrecio(600);

		System.out.println("----------------------------------------");
		System.out.println("nombre: " + p2.getNombre() + " " + p2.getNumero());

		// bulbasur

		Pokemon objeto3 = new Pokemon();

	}

}
