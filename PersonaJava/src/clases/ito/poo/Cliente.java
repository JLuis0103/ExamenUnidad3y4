package clases.ito.poo;


public class Cliente extends Persona {

	private int noCliente = 0;
	private float creditoDisponible = 0F;
	
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nombre, String apellido, String email, long celular, int noCliente, float creditoDisponible) {
		super(nombre, apellido, email, celular);
		this.noCliente = noCliente;
		this.creditoDisponible = creditoDisponible;
	}

	//==================================
	public int getNoCliente() {
		return this.noCliente;
	}

	//==================================
	public void setNoCliente(int newNoCliente) {
		this.noCliente = newNoCliente;
	}

	//==================================
	public float getCreditoDisponible() {
		return this.creditoDisponible;
	}

	//==================================
	public void setCreditoDisponible(float newCreditoDisponible) {
		this.creditoDisponible = newCreditoDisponible;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCliente [noCliente=" + noCliente + ", creditoDisponible=" + creditoDisponible + "]";
	}

}
