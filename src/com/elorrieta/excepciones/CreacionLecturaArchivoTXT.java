package com.elorrieta.excepciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreacionLecturaArchivoTXT {

	public static void main(String[] args) {

		try {
			// crear un fichero de tecto llamado 'datos.txt'
			FileWriter fw = new FileWriter(new File("datos.txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Línea 1, Pokemon 1");
			bw.newLine();
			bw.write("Línea 2, pokemenos 2");
			bw.close();
			fw.close();
		} catch (IOException ex) {
			System.out.println("Problemas en la creación del archivo");
			System.out.println(ex.getMessage());
		}
		try {
			FileReader fr = new FileReader(new File("datos.txt"));
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			br.close();
			fr.close();
		} catch (IOException ex) {
			System.out.println("Problemas con la lectura del archivo");
			System.out.println(ex.getMessage());
		}

	}// main

}
