package interfaces.ito.poo;

public class Clase implements Serial {
	
	int iniciar;
	int valor;
	
	public void DeCinco(){
		iniciar = 0;
		valor = 0;
	}
	

	@Override
	public long siguiente() {
		valor += 5;
		return valor;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
	}

	@Override
	public void iniciar(int x) {
		iniciar = x;
		valor = x;
	}

}
