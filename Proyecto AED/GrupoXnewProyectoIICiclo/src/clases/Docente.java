package clases;

public class Docente {
	
	//  Atributos privados
	private int codigoDocente;
	private String nombre, apellido, categoria, telefono, dni;
	//  Constructor
	public Docente(int codigoDocente, String nombre, String apellido, String categoria, String telefono, String dni) {
		this.codigoDocente = codigoDocente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.categoria = categoria;
		this.telefono = telefono;
		this.dni = dni;
	}
	//  M�todos de acceso p�blico: set/get
	public int getCodigoDocente() {
		return codigoDocente;
	}
	public void setCodigoDocente(int codigoDocente) {
		this.codigoDocente = codigoDocente;
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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
