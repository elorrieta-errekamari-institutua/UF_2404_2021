package com.elorrieta.cadenas.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListadoPersonas {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT id, name FROM person ORDER BY name ASC; ");

		) {

			while (rs.next()) {

				String nombre = rs.getString("name");
				int id = rs.getInt("id");

				System.out.println(id + " - " + nombre);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
