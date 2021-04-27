package com.elorrieta.herencia;

public class ProbarHerencia {

	public static void main(String[] args) {

		Animal aCerdo = new Animal("cerdo");
		aCerdo.cantar();
		System.out.println(aCerdo.toString());

		Pajaro pColibri = new Pajaro("Colibri");
		pColibri.cantar();
		System.out.println("Puede volar " + pColibri.isVolador());
		System.out.println(pColibri.toString());

		Pajaro pPinguino = new Pajaro();
		pPinguino.setNombre("pinguino");
		pPinguino.setVolador(false);
		pPinguino.cantar();
		System.out.println("Puede volar " + pPinguino.isVolador());

		Perro p1 = new Perro();
		p1.setNombre("Snoppy");
		p1.cantar();

		PerroPresa pp = new PerroPresa();
		pp.setNombre("Bubbba");
		pp.cantar();

	}

}
