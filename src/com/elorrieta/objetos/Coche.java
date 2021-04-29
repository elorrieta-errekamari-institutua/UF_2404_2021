package com.elorrieta.objetos;

public class Coche extends Vehiculo {

	private boolean itv;

	public Coche() {
		super();
		this.itv = false;
		setRuedas(4);
		// ruedas = 4;
	}

	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {
		this.itv = itv;
	}

	@Override
	public void arrancar() {
		System.out.println("Brum brum brmu");

	}

	@Override
	public String toString() {
		return "Coche [isItv()=" + isItv() + ", getMatricula()=" + getMatricula() + ", getColor()=" + getColor()
				+ ", getAsientos()=" + getAsientos() + ", getRuedas()=" + getRuedas() + "]";
	}

}
