package app.ito.poo;
import interfaces.ito.poo.Clase;

public class MyApp {
	
	static void run() {
		Clase d5 = new Clase();
		 for (int i=0;i<5;i++)
	            System.out.println("Siguiente valor es: "+d5.siguiente());
	        System.out.println("\nReiniciando");
	        d5.reiniciar();
	        for (int i=0;i<5;i++)
	            System.out.println("Siguiente valor es: "+d5.siguiente());
	        System.out.println("\nIniciando en 100");
	        d5.iniciar(100);
	        for (int i=0;i<5;i++)
	            System.out.println("Siguiente valor es: "+d5.siguiente());
	}

	public static void main(String[] args) {
		run();
	}

}
