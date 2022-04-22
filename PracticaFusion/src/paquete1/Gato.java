package paquete1;

public class Gato extends Mascota{
	private String raza;

	public Gato(String nombre, int edad, String raza) {
		super(nombre,edad);
		this.raza = raza;
	}

	public void mandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y maullo");
	}
}
