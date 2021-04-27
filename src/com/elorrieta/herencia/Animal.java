package com.elorrieta.herencia;

import com.elorrieta.objetos.Cantarin;

public class Animal implements Cantarin {

	private String nombre;

	public Animal() {
		super();
		this.nombre = "";
	}

	public Animal(String nombre) {
		this(); // cambiar super() por this()
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + "]";
	}

	// si este metodo fueral FINAL, no lo pueden sobreescribir los hijos
	@Override
	public void cantar() {
		System.out.println("Soy el Animal " + this.nombre + " y estoy cantando");

	}

}
