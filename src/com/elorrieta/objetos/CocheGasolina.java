package com.elorrieta.objetos;

public class CocheGasolina extends Coche {

	public static final String COMBUSTIBLE_GASOFA = "gasolina";
	public static final String COMBUSTIBLE_DIESEL = "diesel";
	public static final String COMBUSTIBLE_BIO = "bio-diesel";

	private String combustible;
	private int cilindrada;

	public CocheGasolina() {
		super();
		this.combustible = COMBUSTIBLE_GASOFA;
		this.cilindrada = 1200;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "CocheGasolina [combustible=" + getCombustible() + ", cilindrada=" + getCilindrada() + ", isItv()="
				+ isItv() + ", getMatricula()=" + getMatricula() + ", getColor()=" + getColor() + ", getAsientos()="
				+ getAsientos() + ", ruedas=" + getRuedas() + "]";
	}

}
