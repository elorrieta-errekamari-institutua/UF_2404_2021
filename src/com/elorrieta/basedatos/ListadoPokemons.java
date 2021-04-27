package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.elorrieta.objetos.Pokemon;

public class ListadoPokemons {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT id,nombre, numero,precio,brillante FROM pokemon; ");

		) {

			while (rs.next()) {

				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String numero = rs.getString("numero");
				float precio = rs.getFloat("precio");
				boolean brillante = rs.getBoolean("brillante");

				Pokemon pokemon = new Pokemon(nombre, precio, brillante);
				pokemon.setId(id);
				pokemon.setNumero(numero);

				System.out.println(pokemon);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
