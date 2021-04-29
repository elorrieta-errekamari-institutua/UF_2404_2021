package com.elorrieta.objetos;

public class Vehiculo implements IArracable {

	private String matricula;
	private String color;
	private int asientos;
	private int ruedas;

	public Vehiculo() {
		super();
		// System.out.println("constructor por defecto");
		this.matricula = "";
		this.color = "blanco";
		this.asientos = 1;
		this.ruedas = 2;
	}

	public Vehiculo(String _matricula) {
		this();
		// System.out.println("constructor con matricula");
		/*
		 * this() hace todas esta lineas super(); this.matricula = ""; this.color =
		 * "blanco"; this.asientos = 1; this.ruedas = 2;
		 */
		this.matricula = _matricula;
	}

	public Vehiculo(String _matricula, String _color) {
		// this();
		// this.matricula = _matricula;
		this(_matricula);
		// System.out.println("constructor con matricula y color");
		this.color = _color;

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", asientos=" + asientos + ", ruedas=" + ruedas
				+ "]";
	}

	@Override
	public void arrancar() {
		System.out.println("Vehiculo arrancado");

	}

	@Override
	public void parar() {
		System.out.println("Vehiculo parado");

	}

}
