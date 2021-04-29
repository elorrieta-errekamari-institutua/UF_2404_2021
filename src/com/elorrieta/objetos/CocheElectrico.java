package com.elorrieta.objetos;

public class CocheElectrico extends Coche {

	private int kw;

	public CocheElectrico() {
		super();
		this.kw = 50;
	}

	public int getKw() {
		return kw;
	}

	public void setKw(int kw) {
		this.kw = kw;
	}

	@Override
	public String toString() {
		return "CocheElectrico [getKw()=" + getKw() + ", isItv()=" + isItv() + ", getMatricula()=" + getMatricula()
				+ ", getColor()=" + getColor() + ", getAsientos()=" + getAsientos() + ", getRuedas()=" + getRuedas()
				+ "]";
	}

}
