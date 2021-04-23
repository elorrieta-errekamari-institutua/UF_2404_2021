package com.elorrieta.objetos;

public class Cancion {

	public static final int DURACION_MAXIMA = 400;
	public static final int DURACION_MIN = 0;

	// atributos
	private String nombre;
	private String grupo;
	private int duracion; // segundos

	public Cancion() {
		super();
		this.nombre = "";
		this.grupo = "anonima";
		this.duracion = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	/**
	 * Formatea la duracion de segundos al siguiente formato Minutos:Segundos
	 * 
	 * @return ejemplo (int)250 segundos lo formatea a String "4:10"
	 */
	public String getDuracionFormateada() {
		int minutos = this.duracion / 60;
		int segundos = this.duracion % 60;
		return minutos + ":" + segundos;
	}

	public void setDuracion(int minutos, int segundos) throws Exception {

		int total = (minutos * 60) + segundos;
		setDuracion(total);

	}

	/**
	 * setea la duracion de la cancion
	 * 
	 * @param segundos int minutos
	 * @throws Exception si la duracion > DURACION_MAXIMA
	 */
	public void setDuracion(int segundos) throws Exception {
		if (duracion >= DURACION_MAXIMA || duracion < DURACION_MIN) {
			throw new Exception("La duracion de ser entre " + DURACION_MIN + " y " + DURACION_MAXIMA);
		}
		this.duracion = segundos;
	}

	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", grupo=" + grupo + ", duracion=" + duracion + " segundos]";
	}

}
