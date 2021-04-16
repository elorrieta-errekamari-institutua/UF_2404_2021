package com.elorrieta.objetos;

public class Pokemon {

	// atributos
	private String nombre;
	private float precio;
	private int numero;
	private boolean isBrillante;

	// constructor
	public Pokemon() {
		super();
		this.nombre = "sin nombre";
		this.precio = 0;
		this.numero = 0;
		this.isBrillante = false;
	}

	public Pokemon(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isBrillante() {
		return isBrillante;
	}

	public void setBrillante(boolean isBrillante) {
		this.isBrillante = isBrillante;
	}

}
