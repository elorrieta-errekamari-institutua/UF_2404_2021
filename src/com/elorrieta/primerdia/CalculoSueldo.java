package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * 
 * @author Ander Uraga
 * @see https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=4&codigo=77&inicio=0
 *      <br>
 *      <p>
 *      Ejercicio basico para los primeros dias. Calculamos el sueldo
 *      </p>
 *
 */
public class CalculoSueldo {

	public static void main(String[] args) {

		// declarar variables => TIPO NOMBRE = VALOR;
		int horasTrabajadas = 0;
		float costoHora = 0;
		float sueldo = 0;

		// varibale para leer datos por teclado
		Scanner teclado = new Scanner(System.in);

		// pedir datos por pantalla
		System.out.print("Ingrese la cantidad de horas trabajadas por el empleado:");
		// guardar en la variable el valor entero 'int' leido por pantalla
		horasTrabajadas = teclado.nextInt();

		System.out.print("Ingrese el valor de la hora:");
		costoHora = teclado.nextFloat();

		sueldo = horasTrabajadas * costoHora;
		System.out.print("El empleado debe cobrar:");
		System.out.print(sueldo);

		// cerramos el teclado
		teclado.close();

	}

}
