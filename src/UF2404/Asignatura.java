package UF2404;

public class Asignatura {

	public static final float NOTA_MIN = 0;
	public static final float NOTA_MAX = 10f;

	private String nombre;
	private float nota;

	public Asignatura() {
		super();
		this.nombre = "";
		this.nota = 0;
	}

	public Asignatura(String nombre, float nota) throws AsignaturaException {
		this();
		this.nombre = nombre;
		// this.nota = nota;
		setNota(nota);
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

	public void setNota(float nota) throws AsignaturaException {
		if (nota < NOTA_MIN || nota > NOTA_MAX) {
			throw new AsignaturaException(String.format("La nota debe ser entre %s y %s", NOTA_MIN, NOTA_MAX));
		}
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nota=" + nota + "]";
	}

}
