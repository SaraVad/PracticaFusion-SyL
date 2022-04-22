package paquete1;


public class Principal {

	public static void main(String[] args) {

		Gato miGato=new Gato("Mika",1,"Main Coon");
		
		miGato.mandarMensaje();
		
		Perro perro = new Perro("Capitan",2, "Negro");
		
		perro.mandarMensaje();
		
	}

}
