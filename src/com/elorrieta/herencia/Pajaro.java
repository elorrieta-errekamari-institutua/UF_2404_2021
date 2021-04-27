package com.elorrieta.herencia;

/**
 * Al se una clase FINAL no puede tener mas hijos
 * 
 * @author Admin
 *
 */
public final class Pajaro extends Animal {

	private boolean volador;

	public Pajaro() {
		super();
		this.volador = true;
	}

	public Pajaro(String nombre) {
		super(nombre);
		this.volador = true;
	}

	public boolean isVolador() {
		return volador;
	}

	public void setVolador(boolean volador) {
		this.volador = volador;
	}

	@Override
	public void cantar() {
		// estoy sobreescribiendo al padre, paso de el
		System.out.println("pio pio pio");

	}

	@Override
	public String toString() {
		return super.toString() + " Pajaro [volador=" + volador + "]";
	}

}
