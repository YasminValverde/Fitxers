package listas;

public class Doctor extends Persona {
	private String especialidad;

	public String getEspecialitat() {
		return especialidad;
	}

	public void setEspecialitat(String especialitat) {
		this.especialidad = especialitat;
	}

	public Doctor(String nom, String dNI, String especialitat) {
		super(nom, dNI);
		this.especialidad = especialitat;
	}

	@Override
	public String toString() {
		return "[Especialidad=" + especialidad + "]";
	}

}
