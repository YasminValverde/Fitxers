package listas;

public class Paciente extends Persona {
	private String historialMedico;

	public Paciente(String nom, String dNI, String historialMedic) {
		super(nom, dNI);
		this.historialMedico = historialMedic;

	}

	public String getHistorialMedic() {
		return historialMedico;
	}

	public void setHistorialMedic(String historialMedic) {
		this.historialMedico = historialMedic;
	}

	@Override
	public String toString() {
		return "[Historial_Medico=" + historialMedico + "]";
	}
}
