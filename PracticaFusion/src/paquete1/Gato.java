package paquete1;

public class Gato extends Mascota{
	private String raza;

	public Gato(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}

	public void mandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y maullo");
	}
}
