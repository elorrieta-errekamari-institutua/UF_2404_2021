package com.elorrieta.objetos;

public class Pokemon implements Cantarin {

	// atributos
	private int id;
	private String nombre;
	private float precio;
	private String numero;
	private boolean isBrillante;

	// constructor
	public Pokemon() {
		super();
		this.id = 0;
		this.nombre = "sin nombre";
		this.precio = 0;
		this.numero = "";
		this.isBrillante = false;
	}

	public Pokemon(String nombre, float precio) {
		this(); // CUIDADO, cambiar super por this
		this.nombre = nombre;
		this.precio = precio;
	}

	public Pokemon(String nombre) {
		this(); // llamamos al constructor vacio
		this.nombre = nombre;
	}

	public Pokemon(String nombre, float precio, boolean isBrillante) {
		this(); // super cambiar por this
		this.nombre = nombre;
		this.precio = precio;
		this.isBrillante = isBrillante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return (isBrillante) ? (precio + 20) : precio;
	}

	/**
	 * Setea el precio
	 * 
	 * @param precio float en euros
	 * @throws Exception si el precio < 0
	 */
	public void setPrecio(float precio) throws Exception {
		if (precio < 0) {
			throw new Exception("El precio debe ser 0 o superior");
		}
		this.precio = precio;
	}

	public boolean isBrillante() {
		return isBrillante;
	}

	public void setBrillante(boolean isBrillante) {
		this.isBrillante = isBrillante;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", numero=" + numero
				+ ", isBrillante=" + isBrillante + "]";
	}

	@Override
	public void cantar() {
		System.out.println("soy un poquemos y estoy cantando");
	}

}
