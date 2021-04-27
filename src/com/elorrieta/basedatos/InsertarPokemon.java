package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarPokemon {

	public static void main(String[] args) {

		String sql = "INSERT INTO pokemon (nombre, numero, precio, brillante) VALUES (?,?,?,?) ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			String salir = "";
			while (!"s".equalsIgnoreCase(salir)) {

				System.out.println("Dime el nombre");
				String nombre = sc.nextLine();

				System.out.println("Dime el numero");
				String numero = sc.nextLine();

				System.out.println("Dime el precio en euros");
				float precio = Float.parseFloat(sc.nextLine());

				System.out.println("¿Es brillante ? Si o No");
				String respuesta = sc.nextLine();
				boolean brillante = ("si".equalsIgnoreCase(respuesta) || "s".equalsIgnoreCase(respuesta)) ? true
						: false;

				pst.setString(1, nombre);
				pst.setString(2, numero);
				pst.setFloat(3, precio);
				pst.setBoolean(4, brillante);

				// String h = "INSERT INTO person (name) VALUES
				// ('ander'),('espinete'),('pepe');"

				boolean repetir = true;
				do {
					try {
						int numeroFilasInsertadas = pst.executeUpdate();
						// System.out.println(pst);
						// System.out.println(numeroFilasInsertadas);
						repetir = false;
						System.out.println("Pokemon guardado");

					} catch (Exception e) {
						System.out.println("Lo siento pero ese numero ya existe, escribe otro:");
						numero = sc.nextLine();
						pst.setString(2, numero);
					}

				} while (repetir);

				System.out.println("¿ quieres salir ? S-Si     N-No");
				salir = sc.nextLine();

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
