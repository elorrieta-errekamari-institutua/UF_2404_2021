package UF2404;

import java.util.ArrayList;

public class Alumno {

	// constantes
	public static final int EDAD_MINIMA = 16;
	public static final int EDAD_MAX = 99;

	// Atributos
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean isEnfermo;
	private ArrayList<Asignatura> asignaturas;

	// Constructor
	public Alumno() {
		super();
		this.nombre = "";
		this.apellidos = "";
		this.edad = 3;
		this.isEnfermo = false;
		this.asignaturas = new ArrayList<Asignatura>();

	}

	public Alumno(String nombre, String apellidos, int edad, boolean isEnfermo) {
		this();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.isEnfermo = isEnfermo;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if (edad < EDAD_MINIMA || edad > EDAD_MAX) {
			throw new Exception(String.format("La edad debe ser entre %s y %s", EDAD_MINIMA, EDAD_MAX));
		}
		this.edad = edad;
	}

	public boolean isEnfermo() {
		return isEnfermo;
	}

	public void setEnfermo(boolean isEnfermo) {
		this.isEnfermo = isEnfermo;
	}

	public float getNotaMedia() {
		float total = 0;
		for (Asignatura asignatura : asignaturas) {
			total += asignatura.getNota();
		}
		return total / asignaturas.size();
	}

	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * añadimos de golpe todas las Asignaturas al ArrayList
	 * 
	 * @param asignaturas
	 */
	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Añadimos una sola Asigntura al ArrayList
	 * 
	 * @param asignatura
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignaturas.add(asignatura);
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", isEnfermo=" + isEnfermo
				+ ", asignaturas=" + asignaturas + "]";
	}

}
