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

		PezColor pc1 = new PezColor();
		pc1.setNombre("pez de goma");
		pc1.setColor("azul");
		pc1.setAcuatico(false);

		PezColor pc2 = new PezColor();
		pc2.setNombre("pez de goma");
		pc2.setColor("azul");
		pc2.setAcuatico(false);

		if (pc1.equals(pc2)) {
			System.out.println("son iguales");
		} else {
			System.out.println("no son iguales");
		}

	}

}
