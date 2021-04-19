package com.elorrieta.objetos;

public class Empleado {

	// como es publica podemos usarla desde otras clases
	public static final int SUELDO_MINIMO = 600;

	// atributos
	private String nombre;
	private float sueldo;
	private boolean becario;

	public Empleado() {
		super();
		this.nombre = "";
		this.sueldo = SUELDO_MINIMO;
		this.becario = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isBecario() {
		return becario;
	}

	public void setBecario(boolean becario) {
		this.becario = becario;
		if (becario) {
			this.sueldo = 0;
		}
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", becario=" + becario + "]";
	}

}
