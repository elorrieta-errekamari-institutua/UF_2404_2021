package com.elorrieta.colecciones;

public class TemperaturaMediaArray {

	public static void main(String[] args) {

		int suma = 0;
		int tempMax = Integer.MIN_VALUE;
		int tempMin = Integer.MAX_VALUE;

		int[] temperaturas = new int[7];
		temperaturas[0] = 12;
		temperaturas[1] = 20;
		temperaturas[2] = 18;
		temperaturas[3] = 5;
		temperaturas[4] = 22;
		temperaturas[5] = 15;
		temperaturas[6] = 18;

		for (int i = 0; i < temperaturas.length; i++) {
			int t = temperaturas[i];
			suma += t;
			if (tempMax < t) {
				tempMax = t;
			}
			if (tempMin > t) {
				tempMin = t;
			}
		} // for

		System.out.println("La media: " + (suma / temperaturas.length));
		System.out.println("La Maxima: " + tempMax);
		System.out.println("La Minimo: " + tempMin);

	}

}
