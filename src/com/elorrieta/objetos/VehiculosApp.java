package com.elorrieta.objetos;

public class VehiculosApp {

	public static void main(String[] args) {

		System.out.println("------------- v1 -----------------");
		Vehiculo v1 = new Vehiculo();
		v1.arrancar();
		v1.parar();
		v1.setMatricula("2222 GPL");

		System.out.println("------------- v2 -----------------");
		Vehiculo v2 = new Vehiculo("1111 CMS");
		v2.setColor("rojo");

		System.out.println("------------- v3 -----------------");
		Vehiculo v3 = new Vehiculo("5555 CMS", "negra");

		System.out.println(v3);

		Coche c1 = new Coche();
		c1.isItv(); // su propio metodo
		c1.getMatricula(); // metodo heredado del padre
		c1.toString(); // metodo sobreescrito al padre

		CocheGasolina cg1 = new CocheGasolina();
		cg1.setCilindrada(2500);
		cg1.setItv(true);
		cg1.setColor("rojo");
		cg1.setAsientos(2);
		cg1.setCombustible(CocheGasolina.COMBUSTIBLE_BIO);

		cg1.arrancar();
		cg1.parar();

		System.out.println(cg1.toString());

	}

}
