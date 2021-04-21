package com.elorrieta.objetos;

public class Cancion {

	public static final int DURACION_MAXIMA = 400;

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
	 * setea la duracion de la cancion
	 * 
	 * @param duracion int minutos
	 * @throws Exception si la duracion > DURACION_MAXIMA
	 */
	public void setDuracion(int duracion) throws Exception {
		if (duracion >= DURACION_MAXIMA) {
			throw new Exception("La duracion no puede ser mayor que " + DURACION_MAXIMA);
		}
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", grupo=" + grupo + ", duracion=" + duracion + " segundos]";
	}

}
