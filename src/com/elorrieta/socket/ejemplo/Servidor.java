package com.elorrieta.socket.ejemplo;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String args[]) {
		ServerSocket mi_servicio = null;
		String linea_recibida;
		DataInputStream entrada;
		PrintStream salida;
		Socket socket_conectado = null;
		try {
			mi_servicio = new ServerSocket(2019);
			System.out.println("SERVIDOR arrancado");
			System.out.println(mi_servicio);
		} catch (IOException excepcion) {
			System.out.println(excepcion);
		}
		try {

			socket_conectado = mi_servicio.accept();
			System.out.println("cliente conectado " + socket_conectado.getInetAddress());
			entrada = new DataInputStream(socket_conectado.getInputStream());
			salida = new PrintStream(socket_conectado.getOutputStream());
			linea_recibida = entrada.readLine();
			salida.println("Te reenvio lo que he recibido:" + linea_recibida);
			salida.close();
			entrada.close();
			socket_conectado.close();
		} catch (IOException excepcion) {
			System.out.println(excepcion);
		}
	}
}
