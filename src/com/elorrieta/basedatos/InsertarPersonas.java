package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarPersonas {

	public static void main(String[] args) {

		String sql = "INSERT INTO person (name) VALUES (?) ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			String salir = "";
			while (!"s".equalsIgnoreCase(salir)) {

				System.out.println("Dime le nombre");
				String nombre = sc.nextLine();

				pst.setString(1, nombre);
				pst.executeUpdate();

				System.out.println("¿ quieres salir ? S-Si     N-No");
				salir = sc.nextLine();

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// main

}
