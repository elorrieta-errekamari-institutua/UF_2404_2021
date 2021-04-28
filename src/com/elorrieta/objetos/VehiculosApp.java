package com.elorrieta.objetos;

public class VehiculosApp {

	public static void main(String[] args) {

		System.out.println("------------- v1 -----------------");
		Vehiculo v1 = new Vehiculo();
		v1.setMatricula("2222 GPL");

		System.out.println("------------- v2 -----------------");
		Vehiculo v2 = new Vehiculo("1111 CMS");
		v2.setColor("rojo");

		System.out.println("------------- v3 -----------------");
		Vehiculo v3 = new Vehiculo("5555 CMS", "negra");

		System.out.println(v3);

	}

}
