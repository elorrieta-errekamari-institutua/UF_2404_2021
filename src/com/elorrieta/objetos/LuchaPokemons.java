package com.elorrieta.objetos;

import java.util.Scanner;

public class LuchaPokemons {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pokemon p1 = new Pokemon("pikatxu");
		p1.setVida(10);

		Pokemon p2 = new Pokemon("bulbasur");
		p2.setVida(10);

		String ganador = "";
		int turno = 1;
		boolean fin = false;

		System.out.println("Empieza la batalla " + p1.nombreYvida() + " VS " + p2.nombreYvida());

		while (!fin) {

			System.out.println("turno:" + turno + " pulsa enter para avanzar");
			sc.nextLine();

			int ataque1 = p1.atacar();
			int ataque2 = p2.atacar();

			System.out.println(p1.nombreYvida() + " ataca con " + ataque1);
			System.out.println(p2.nombreYvida() + " ataca con " + ataque2);

			int vida2 = p2.vida(ataque1);
			int vida1 = p1.vida(ataque2);

			if (vida1 <= 0) {
				ganador = p2.nombreYvida();
				fin = true;
			}

			if (vida2 <= 0) {
				ganador = p1.nombreYvida();
				fin = true;
			}

			turno++;

		} // while
		System.out.println("********************");
		System.out.println("  Ganador: " + ganador);
		System.out.println("********************");

	}

}
