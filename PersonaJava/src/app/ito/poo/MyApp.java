package app.ito.poo;
import clases.ito.poo.Chofer;

public class MyApp {
	
	static void run() {
		Chofer c= new Chofer("Jose Luis", "Ramirez", "joseluisramirez@gmail.com", 271600585, "92-91-90-8443-1",
				3, 5500.50F, "Operador", 6);
		System.out.println(c);
		c.agregarRuta("Cordoba - Orizaba");
		c.agregarRuta("Cordoba - Fortin");
		System.out.println(c.eliminarRuta("Cordoba - Xalapa"));
		System.out.println(c.eliminarRuta("Cordoba - Fortin"));
		System.out.println(c);
	}

	public static void main(String[] args) {
		run();
	}

}
