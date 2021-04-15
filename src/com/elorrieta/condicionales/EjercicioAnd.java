package com.elorrieta.condicionales;

public class EjercicioAnd {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;
		int num3 = 333;

		if (num1 > num2 && num1 > num3) {
			System.out.println("numero mas alto es " + num1);

		} else {

			if (num2 > num3) {
				System.out.println("numero mas alto es " + num2);
			} else {
				System.out.println("numero mas alto es " + num3);
			}
		}

		System.out.println("Otro ejericio--------------------------");

		int mes = 3;
		if (mes == 1 || mes == 2 || mes == 3) {
			System.out.println("Estamos en el 1º trimestre");
		} else {
			System.out.println("NO Estamos en el 1º trimestre");
		}

	}

}
