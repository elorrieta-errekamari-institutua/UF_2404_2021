package com.elorrieta.cadenas.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ModificarPersona {

	public static void main(String[] args) {

		String sql = "UPDATE person SET name = ? WHERE id = ? ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// pedir datos por consola
			System.out.println("Dime el ID para modificar una persona:");
			int id = Integer.parseInt(sc.nextLine());

			System.out.println("Dime el nombre nuevo:");
			String nombre = sc.nextLine();

			// sustituimos las '?' de la SQL por las variables
			pst.setString(1, nombre);
			pst.setInt(2, id);

			int filas = pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
			if (filas == 1) {
				System.out.println("Persona modificada");
			} else {
				System.out.println("Persona NO modificada");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
