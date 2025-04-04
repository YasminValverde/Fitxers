package Fitxers;

import java.util.regex.Pattern;

public abstract class Vehicles implements Comparable<Vehicles> {
	protected String matricula;
	protected int km;

	public String getMatricula() {
		return matricula;
	}

	protected Vehicles(String matricula, int km) throws MatriculaInvalidaException {
		if (matricula == null || matricula.isEmpty() || !validarMatricula(matricula)) {
			throw new MatriculaInvalidaException("La matrícula no és vàlida!");
		}
		if (km < 0) {
			throw new IllegalArgumentException("Els km no poden ser negatius!");
		}
		this.matricula = matricula;
		this.km = km;
	}

	public Vehicles() {
	} // Constructor vacío necesario para la serialización XML

	public void setMatricula(String matricula) throws MatriculaInvalidaException {
		if (matricula == null || matricula.isEmpty() || !validarMatricula(matricula)) {
			throw new MatriculaInvalidaException("La matrícula no és vàlida!");
		}
		this.matricula = matricula;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		if (km < 0) {
			throw new IllegalArgumentException("Els km no poden ser negatius!");
		}
		this.km = km;
	}

	public abstract double calcularDescompte(double preuInicial);

	public static boolean validarMatricula(String matricula) {
		String regex = "^[0-9]{4}-?[BCDFGHJKLMNPRSTVWXYZ]{3}$";
		return Pattern.matches(regex, matricula);
	}

	@Override
	public String toString() {
		return "Vehicles [matricula=" + matricula + ", km=" + km + "]";
	}
}
