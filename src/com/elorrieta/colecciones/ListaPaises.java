package com.elorrieta.colecciones;

import java.util.ArrayList;

public class ListaPaises {

	public static void main(String[] args) {

		ArrayList<String> paises = new ArrayList<String>();
		paises.add("Egpaña");
		paises.add("Euskal Herria");
		paises.add("Euskal Herria");
		paises.add("Burkina Faso");
		paises.add("Andorra");
		paises.add("Euskal Herria");

		System.out.println("Andorra esta en la posicion " + paises.indexOf("Andorra"));

		paises.add(1, "Sri lanka");

		paises.remove(0); // eliminamos egapaña
		paises.remove("Andorra"); // eliminamos Andorra

		System.out.println("Andorra esta en la posicion " + paises.indexOf("Andorra"));

		// recorrer con for de toda la vida
		for (int i = 0; i < paises.size(); i++) {
			String pais = paises.get(i);
			System.out.println("posicion " + i + " - " + pais);
		}

		// bucle foreach es mas rapido, pero no tenemos la 'i'
		for (String pais : paises) {
			System.out.println(pais);
		}

		// contar cuantas veces esta el pais "X"

		System.out.println("Terminamos");

	}

}
