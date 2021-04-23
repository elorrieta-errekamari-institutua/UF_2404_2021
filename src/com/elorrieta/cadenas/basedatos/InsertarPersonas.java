package com.elorrieta.cadenas.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarPersonas {

	public static void main(String[] args) {

		String sql = "INSERT INTO person (id, name) VALUES ( ?, ?) ;";

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// TODO pedir datos por consola
			String nombre = "Marian Antonela";
			int id = 35;

			// sustituimos las '?' de la SQL por las variables
			pst.setInt(1, id);
			pst.setString(2, nombre);

			pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado

			System.out.println("Persona insertada");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
