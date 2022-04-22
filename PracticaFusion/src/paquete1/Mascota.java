package paquete1;

public class Mascota {

	private String nombre;
	private String duenyo;

	public Mascota(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDuenyo() {
		return duenyo;
	}

	public void setDuenyo(String duenyo) {
		this.duenyo = duenyo;
	}

	public void mandarMensaje() {
		System.out.println("Soy " + this.nombre + " y te voy a contar algo o no, mi duenyo es " + getDuenyo());
	}
}
