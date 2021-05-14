package clases.ito.poo;
import java.util.HashSet;


public class Chofer extends Empleado {

	private HashSet<String> rutas = new HashSet<String>();
	private int noAutobus = 0;
	
	public Chofer() {
		super();
	}
	
	public Chofer(String nombre, String apellido, String email, long celular, String nss, int noEmpleado, float sueldo,
			String puesto, int noAutobus) {
		super(nombre, apellido, email, celular, nss, noEmpleado, sueldo, puesto);
		this.noAutobus = noAutobus;
	}

	//==========================================
	public void agregarRuta(String ruta) {
		this.rutas.add(ruta);
	}

	//==========================================
	public boolean eliminarRuta(String ruta) {
		boolean eliminarRuta = false;
		for(String s : this.rutas)
			if(s == ruta)
				eliminarRuta=true;
		return eliminarRuta;
	}

	//==========================================
	public HashSet<String> getRutas() {
		return this.rutas;
	}

	//==========================================
	public int getNoAutobus() {
		return this.noAutobus;
	}

	//==========================================
	public void setNoAutobus(int newNoAutobus) {
		this.noAutobus = newNoAutobus;
	}

	@Override
	public String toString() {
		return super.toString() + "\nChofer [rutas=" + rutas + ", noAutobus=" + noAutobus + "]";
	}
	

}
