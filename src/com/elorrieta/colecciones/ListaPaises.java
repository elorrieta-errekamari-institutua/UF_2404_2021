package com.elorrieta.colecciones;

import java.util.ArrayList;

public class ListaPaises {

	public static void main(String[] args) {

		ArrayList<String> paises = new ArrayList<String>();
		paises.add("Egpa");
		paises.add("Euskal Herria2");
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
		String paisBuscar = "Euskal Herria";
		int cont = 0;
		for (int indice = 0; indice < paises.size(); indice++) {
			String paisIteracion = paises.get(indice);
			if (paisBuscar.equalsIgnoreCase(paisIteracion)) {
				cont++;
			}
		}
		System.out.println("El pais " + paisBuscar + " esta " + cont + " veces");

		// contar paises con mas de 5 caracteres
		System.out.println("Paises con mas de 5 caracteres");
		cont = 0;
		for (int i = 0; i < paises.size(); i++) {
			String paisIteracion = paises.get(i);
			if (paisIteracion.length() > 5) {
				System.out.println(paisIteracion);
				cont++;
			}
		}
		System.out.println("Total " + cont);

		System.out.println("Terminamos");

	}

}
