package com.elorrieta.objetos;

public class Pokemon implements Cantarin, Jugable {

	// atributos
	private int id;
	private String nombre;
	private float precio;
	private String numero;
	private boolean isBrillante;
	private int vida;

	// constructor
	public Pokemon() {
		super();
		this.id = 0;
		this.nombre = "sin nombre";
		this.precio = 0;
		this.numero = "";
		this.isBrillante = false;
		this.vida = 0;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
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
				+ ", isBrillante=" + isBrillante + ", vida=" + vida + "]";
	}

	@Override
	public void cantar() {
		System.out.println("soy un poquemos y estoy cantando");
	}

	/**
	 * genera un numero aletorio entre 1 y 5
	 */
	@Override
	public int atacar() {
		int min = 1;
		int max = 5;
		int numero = (int) Math.floor(Math.random() * (max - min + 1) + min);
		return numero;
	}

	@Override
	public int vida(int ataque) {
		this.vida -= ataque;
		return vida;
	}

	@Override
	public String nombreYvida() {
		return "[" + vida + "]" + getNombre();
	}

}
