package listas;

public class Persona {
	protected String nombre;
	protected String DNI;

	public String getNom() {
		return nombre;
	}

	public void setNom(String nom) {
		this.nombre = nom;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public Persona(String nom, String dNI) {
		super();
		this.nombre = nom;
		DNI = dNI;
	}

	@Override
	public String toString() {
		return "Persona [Nombre=" + nombre + ", DNI=" + DNI + "]";
	}

}
