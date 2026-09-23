package II;

public class Alumno {

	private String nombre;
	private double nota,notaMedia;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nota=" + nota+"]";
	}
	public Alumno(String nombre, double nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}
	//prueba subida
	
}
