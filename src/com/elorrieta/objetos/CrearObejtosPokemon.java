package com.elorrieta.objetos;

import java.util.Scanner;

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

		Pokemon p3 = new Pokemon("Bulbasur", 10);
		p3.setNumero(3);
		p3.setBrillante(false);
		System.out.println("----------------------------------------");
		System.out.println(p3); // no es necesario llamar al metodo .toString()

		System.out.println("----------------------------------------");
		System.out.println("---- Crea tu Pokemon a tu gusto --------");
		System.out.println("----------------------------------------");

		Scanner sc = new Scanner(System.in);

		// Pedir datos por consola
		System.out.println("Dime el nombre:");
		String nombre = sc.nextLine();

		System.out.println("Dime el precio en euros:");
		float precio = Float.parseFloat(sc.nextLine());

		System.out.println("Numero del pokemon:");
		int numero = Integer.parseInt(sc.nextLine());

		System.out.println("� Es Brillante la carta?  escribe S o N");
		String respuesta = sc.nextLine();
		// boolean isBrillante = ("s".equalsIgnoreCase(sc.nextLine())) ? true : false;
		boolean isBrillante = false;
		if ("s".equalsIgnoreCase(respuesta)) {
			isBrillante = true;
		}

		// crear el pokemon
		Pokemon pCustom = new Pokemon();
		pCustom.setNombre(nombre);
		pCustom.setPrecio(precio);
		pCustom.setNumero(numero);
		pCustom.setBrillante(isBrillante);

		// mostrar por pantalla
		System.out.println("Ya tienes tu nuevo Pokemon customizado");
		System.out.println(pCustom);
		if (pCustom.isBrillante()) {
			System.out.println("Como es brillante el precio es " + pCustom.getPrecio());
		}

		sc.close();

	}

}
