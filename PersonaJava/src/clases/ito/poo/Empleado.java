package clases.ito.poo;


public class Empleado extends Persona {

	private String nss = "";
	private int noEmpleado = 0;
	private float sueldo = 0F;
	private String puesto = "";


	public Empleado() {
		super();
	}
	
	public Empleado(String nombre, String apellido, String email, long celular, String nss, int noEmpleado, float sueldo, String puesto) {
		super(nombre, apellido, email, celular);
		this.nss = nss;
		this.noEmpleado = noEmpleado;
		this.sueldo = sueldo;
		this.puesto = puesto;
	}


	//========================================
	public void cambioPuesto(String puesto, float sueldo) {
		
	}

	//========================================
	public String getNss() {
		return this.nss;
	}

	//========================================
	public void setNss(String newNss) {
		this.nss = newNss;
	}

	//========================================
	public int getNoEmpleado() {
		return this.noEmpleado;
	}

	//========================================
	public void setNoEmpleado(int newNoEmpleado) {
		this.noEmpleado = newNoEmpleado;
	}

	//========================================
	public float getSueldo() {
		return this.sueldo;
	}

	//========================================
	public void setSueldo(float newSueldo) {
		this.sueldo = newSueldo;
	}

	//========================================
	public String getPuesto() {
		return this.puesto;
	}

	//========================================
	public void setPuesto(String newPuesto) {
		this.puesto = newPuesto;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEmpleado [nss=" + nss + ", noEmpleado=" + noEmpleado + ", sueldo=" + sueldo + ", puesto=" + puesto
			 +"]";
	}

}
