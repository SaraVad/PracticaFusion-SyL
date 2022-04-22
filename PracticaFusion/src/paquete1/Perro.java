package paquete1;

public class Perro extends Mascota {

	// Atributos

	private String colorPiel;

	// Constructor

	public Perro(String nombre,int edad, String colorPiel) {
		super(nombre, edad);
		this.colorPiel = colorPiel;
	}

	// Gets and Sets

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	// Metodo
	
	public void mandarMensaje() {
		
		System.out.println("Mia mia, digo Gou gou soy un Perro");
		
	}

}
