package com.elorrieta.cadenas.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EliminarPersona {

	public static void main(String[] args) {

		String sql = "DELETE FROM person WHERE id = ? ;";

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// TODO pedir datos por consola

			int id = 1;

			// sustituimos las '?' de la SQL por las variables
			pst.setInt(1, id);

			int filas = pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
			System.out.println("Hemos eliminado " + filas + " filas");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
