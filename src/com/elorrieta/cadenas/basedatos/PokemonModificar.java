package com.elorrieta.cadenas.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PokemonModificar {

	public static void main(String[] args) {

		String sqlBuscar = "SELECT id,nombre,numero,precio,brillante FROM pokemon WHERE id=?;";
		String sqlUpdate = "UPDATE pokemon SET nombre=?, numero=?, precio=? , brillante=? WHERE id=? ;";

		int id = 0;
		String nombre = "";
		String numero = "";
		float precio = 0;
		boolean brillante = false;

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sqlBuscar);
				PreparedStatement pst2 = con.prepareStatement(sqlUpdate);) {

			// TODO mejora pedir pokemon si no encuentra
			// pedir datos por consola y buscar pokemon por ID
			System.out.println("Dime la ID del pokemon a modificar:");
			id = Integer.parseInt(sc.nextLine());
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				nombre = rs.getString("nombre");
				numero = rs.getString("numero");
				precio = rs.getFloat("precio");
				brillante = rs.getBoolean("brillante");
			}

			// pedir datos para cambiar
			String linea = "";
			System.out.println("**Si no quieres cambiar pulsar enter***");
			System.out.println("nombre(" + nombre + "):");
			linea = sc.nextLine();
			if (!"".equals(linea)) {
				nombre = linea;
			}

			System.out.println("numero(" + numero + "):");
			linea = sc.nextLine();
			if (!"".equals(linea)) {
				numero = linea;
			}

			System.out.println("precio(" + precio + "):");
			linea = sc.nextLine();
			if (!"".equals(linea)) {
				precio = Float.parseFloat(linea);
			}

			System.out.println("brillante(" + brillante + "):");
			linea = sc.nextLine();
			if (!"".equals(linea)) {
				brillante = Boolean.parseBoolean(linea);
			}

			// preparamos la SQL
			pst2.setString(1, nombre);
			pst2.setString(2, numero);
			pst2.setFloat(3, precio);
			pst2.setBoolean(4, brillante);
			pst2.setInt(5, id);

			// ejecutamos la SQL contra la bbdd
			boolean flag = true;
			do {
				try {
					pst2.executeUpdate();
					flag = false;
					System.out.println("datos cambiados");
				} catch (Exception e) {
					System.out.println("Lo sentimos pero el numero [" + numero + "] ya existe, escribe otro");
					numero = sc.nextLine();
					pst2.setString(2, numero);
				}
			} while (flag);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
