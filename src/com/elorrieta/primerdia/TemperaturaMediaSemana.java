package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * Pedir por teclado la temperatura de los 7 dias de la semana y culcular media
 * 
 * @author Admin
 *
 */
public class TemperaturaMediaSemana {

	public static void main(String[] args) {

		// variables
		float lunes = 0;
		float martes = 0;
		float miercoles = 0;
		float jueves = 0;
		float viernes = 0;
		float sabado = 0;
		float domingo = 0;
		float media = 0;
		final int DIAS_SEMANA = 7; // final es para indicar que es una constante, siempre en Mayusculas

		Scanner teclado = new Scanner(System.in);

		// pedir y leer datos
		System.out.println("Dime la Temp Lunes:");
		lunes = teclado.nextFloat();

		System.out.println("Dime la Temp martes:");
		martes = teclado.nextFloat();

		System.out.println("Dime la Temp miercoles:");
		miercoles = teclado.nextFloat();

		System.out.println("Dime la Temp jueves:");
		jueves = teclado.nextFloat();

		System.out.println("Dime la Temp viernes:");
		viernes = teclado.nextFloat();

		System.out.println("Dime la Temp sabado:");
		sabado = teclado.nextFloat();

		System.out.println("Dime la Temp domingo:");
		domingo = teclado.nextFloat();

		// calcular media
		media = (lunes + martes + miercoles + jueves + viernes + sabado + domingo) / DIAS_SEMANA;

		if (media < 20) {
			System.out.println("Hace frio de cojxxx");
		} else {
			System.out.println("Que valorcito");
		}

		// mosrtrar media
		System.out.println("La media es " + media);

	}

}
