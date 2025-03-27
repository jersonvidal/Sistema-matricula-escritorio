package clases;

public class Alumno {
	
	//  Atributos privados
	private int codigoAlumno;
	private String nombre, apellido, telefono, dni;
	//  Constructor
	public Alumno(int codigoAlumno, String nombre, String apellido, String telefono, String dni) {
		this.codigoAlumno = codigoAlumno;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.dni = dni;
	}
	//  M�todos de acceso p�blico: set/get
	public int getCodigoAlumno() {
		return codigoAlumno;
	}
	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
}