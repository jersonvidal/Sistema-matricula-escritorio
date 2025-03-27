package clases;

public class Curso {
	
	//  Atributos privados
	private int codigoCurso, hora;
	private String asignatura;
	//  Constructor
	public Curso(int codigoCurso, String asignatura, int hora) {
		this.codigoCurso = codigoCurso;
		this.hora = hora;
		this.asignatura = asignatura;
	}
	public int getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	
}