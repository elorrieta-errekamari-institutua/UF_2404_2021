package com.elorrieta.cadenas.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EliminarPersona {

	public static void main(String[] args) {

		String sql = "DELETE FROM person WHERE id = ? ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// pedir datos por consola
			System.out.println("Dime el ID para eliminar una persona:");
			int id = Integer.parseInt(sc.nextLine());

			// sustituimos las '?' de la SQL por las variables
			pst.setInt(1, id);

			int filas = pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
			if (filas == 1) {
				System.out.println("Hemos eliminado " + filas + " filas");
			} else {
				System.out.println("Persona no encontrada");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
