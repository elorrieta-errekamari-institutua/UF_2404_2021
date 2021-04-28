package com.elorrieta.herencia.videojuego;

public class Mago extends Personaje {

	public static final int ENERGIA_INICIAL = 100;

	private String poder;

	public Mago(String nombre, String poder) {
		super(nombre, ENERGIA_INICIAL);
		this.poder = poder;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	/**
	 * disminuye en 2 unidades el nivel propio de energía y que retorna el poder del
	 * mago.
	 * 
	 * @return
	 */
	public String encantar() {
		setEnergia(getEnergia() - 2);
		return poder + " " + getEnergia();
	}

	@Override
	public String toString() {
		return "Mago [poder=" + poder + ", nombre=" + getNombre() + ", energia=" + getEnergia() + "]";
	}

}
