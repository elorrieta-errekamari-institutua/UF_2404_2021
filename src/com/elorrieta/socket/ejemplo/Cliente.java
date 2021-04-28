package com.elorrieta.socket.ejemplo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String args[]) {
		Socket cliente = null;
		DataInputStream entrada = null;
		DataOutputStream salida = null;

		String ipServidor = "127.0.0.1";
		// nos conectamos al localhost a traves de esta dirección IP

		// if (cliente != null && salida != null && entrada!= null) {
		try {

			cliente = new Socket(ipServidor, 2019);
			// asignamos este numero de puerto
			entrada = new DataInputStream(cliente.getInputStream());
			// será lo que enviaremos al servidor
			salida = new DataOutputStream(cliente.getOutputStream());
			// será lo que nos devuelva el servidor
			System.out.println("Cliente conectado");

		} catch (UnknownHostException excepcion) {
			System.err.println("El servidor no está levantado");
		} catch (Exception e) {
			System.err.println("Error: " + e);
		}

		try {
			String linea_recibida;
			salida.writeBytes("Frase que envio al servidor\n");
			linea_recibida = entrada.readLine();
			System.out.println("SERVIDOR DICE: " + linea_recibida);
			salida.close();
			entrada.close();
			cliente.close();
		} catch (UnknownHostException excepcion) {
			System.err.println("No encuentro el servidor en la dirección" + ipServidor);
		} catch (IOException excepcion) {
			System.err.println("Error de entrada/salida");
		} catch (Exception e) {
			System.err.println("Error: " + e);

		}
	}
}
