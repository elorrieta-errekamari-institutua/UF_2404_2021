package UF2404;

public class Asignatura {

	private String nombre;
	private float nota;

	public Asignatura() {
		super();
		this.nombre = "";
		this.nota = 0;
	}

	public Asignatura(String nombre, float nota) {
		this();
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nota=" + nota + "]";
	}

}
