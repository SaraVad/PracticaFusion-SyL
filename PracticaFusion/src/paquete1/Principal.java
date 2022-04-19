package paquete1;


public class Principal {

	public static void main(String[] args) {

		Gato miGato=new Gato("Mika","Main Coon");
		
		miGato.mandarMensaje();
		
		Perro perro = new Perro("Capitan", "Negro");
		
		perro.mandarMensaje();
		
	}

}
