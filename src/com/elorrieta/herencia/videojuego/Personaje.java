package com.elorrieta.herencia.videojuego;

public class Personaje {

	private String nombre;
	private int energia;

	public Personaje() {
		super();
		this.nombre = "";
		this.energia = 0;
	}

	public Personaje(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Personaje(String nombre, int energia) {
		this(nombre);
		// this.nombre = nombre;
		this.energia = energia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public void alimentarse(int incremento) {
		this.energia += incremento;
	}

	public void consumir(int incremento) {
		this.energia -= incremento;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", energia=" + energia + "]";
	}

}
