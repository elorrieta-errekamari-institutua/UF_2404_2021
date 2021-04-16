package com.elorrieta.metodos;

public class Utilidades {

	// main es un metodo donde vamos a ejecutar el programa
	public static void main(String[] args) {

		// el metodo saludar esta 'sobrecragado' se llama igual, pero tiene diferentes
		// parametros
		saludar();
		saludar("Don Pimpom");
		saludar("Josebita");

		saludar("Paco", "castellano");
		saludar("Patxi", "eus");

		float precio = calcularIva(100f, 21f);
		System.out.println("El precio con iva es " + precio);

	}

	/* vamos a declarar nuevos metodos */

	/**
	 * metodo publico que no retorna nada 'void'. saluda por consola
	 */
	public static void saludar() {
		System.out.println("Aupa hay, que tal?");
	}

	/**
	 * Metodo para saludar por consola
	 * 
	 * @param nombre String con la persona a saludar
	 */
	public static void saludar(String nombre) {
		System.out.println("Kaixo " + nombre);
	}

	/**
	 * Metodo que saluda por consola
	 * 
	 * @param nombre String con el nombre de la persona a saludar
	 * @param idioma String, si pones "castellano" saluda en castellano, cualquier
	 *               otro valor en Euskera
	 */
	public static void saludar(String nombre, String idioma) {

		if ("castellano".equals(idioma)) {
			System.out.println("Hola " + nombre);
		} else {
			System.out.println("Kaixo " + nombre);
		}
	}

	/**
	 * Calcula el IVA repercutido
	 * 
	 * @param precioSinIva float
	 * @param iva          float
	 * @return el precio mas el iva repercutido
	 */
	public static float calcularIva(float precioSinIva, float iva) {

		float precioConIva = precioSinIva + (precioSinIva * iva / 100);
		return precioConIva;
	}

	public static int suma(int num1, int num2) {
		return 0;
	}

	public static int numeroMayor(int num1, int num2, int num3) {
		return 0;
	}

	public static boolean isKapikua(int numero) {
		// TODO cambiar el retorno y hacer algoritmo
		return false;
	}

}
