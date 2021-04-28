package com.elorrieta.herencia.videojuego;

public class JuegoGuerrerosYMagos {

	public static void main(String[] args) {

		Guerrero g = new Guerrero("Conan el Barbaro", 350, "espada de doble mano");
		System.out.println("Creado Guerrero");
		System.out.println(g.toString());
		System.out.println("combate con energia de 100 y arma " + g.getArma());
		g.combatir(100);
		System.out.println(g.toString());

		Mago m = new Mago("Merlin", "Bola de fuego");
		System.out.println("Mago creado");
		System.out.println(m);
		System.out.println("Lanza un encantamiento " + m.getPoder());
		m.encantar();
		System.out.println(m);

	}

}
