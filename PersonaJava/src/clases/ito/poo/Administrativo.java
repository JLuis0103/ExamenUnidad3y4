package clases.ito.poo;


public class Administrativo extends Empleado {

	private String depto = "";
	
	public Administrativo() {
		super();
	}

	public Administrativo(String nombre, String apellido, String email, long celular, String nss, int noEmpleado,
			float sueldo, String puesto, String depto) {
		super(nombre, apellido, email, celular, nss, noEmpleado, sueldo, puesto);
		this.depto = depto;
	}

	//======================================
	public void cambiaDepto(String newDepto) {
		this.depto = newDepto;
	}

	//======================================
	public String getDepto() {
		return this.depto;
	}

	//======================================
	public void setDepto(String newDepto) {
		this.depto = newDepto;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAdministrativo [depto=" + depto + "]";
	}

}
