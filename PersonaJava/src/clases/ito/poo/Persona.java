package clases.ito.poo;


public class Persona {

	private String nombre = "";
	private String apellido = "";
	private String email = "";
	private long celular = 0L;

	public Persona() {
		super();
	}
	
	public Persona(String nombre, String apellido, String email, long celular) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.celular = celular;
	}

	//===========================================
	public String getNombre() {
		return this.nombre;
	}

	//===========================================
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	//===========================================
	public String getApellido() {
		return this.apellido;
	}

	//===========================================
	public void setApellido(String newApellido) {
		this.apellido = newApellido;
	}

	//===========================================
	public String getEmail() {
		return this.email;
	}

	//===========================================
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	//===========================================
	public long getCelular() {
		return this.celular;
	}

	//===========================================
	public void setCelular(long newCelular) {
		this.celular = newCelular;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", celular=" + celular
				+ "]";
	}

}
