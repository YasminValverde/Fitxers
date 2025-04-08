package Fitxers;

public class Motos extends Vehicles {
	private int cilindrada;
	/*
	 * private static int contador = 0; private int numero; // numero único para
	 * cada moto
	 */

	public Motos(String matricula, int km, int cilindrada) throws MatriculaInvalidaException {
		super(matricula, km);
		this.cilindrada = cilindrada;
		/* this.numero = ++contador; */
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Motos() {
		super(); // Constructor vacío necesario para la serialización XML
	}

	// -----Calcular el descompte d'un vehicle en funció del quilometratge---/
	public double calcularDescompte(double preuInicial) {
		double descomptePerCC = (getCilindrada() / 5000) * 0.02;

		if (cilindrada <= 125) {
			if (descomptePerCC >= 0.20) {
				descomptePerCC = 0.20;
			}
		} else {
			double descomptePerKm = (int) (this.getKm() / 10000) * 0.01;
			if (descomptePerKm >= 0.10) {
				descomptePerKm = 0.10;
			}
			return preuInicial * (1 - descomptePerKm);
		}

		return preuInicial * (1 - descomptePerCC);
	}

	@Override
	public int compareTo(Vehicles o) {

		return 0;
	}

	@Override
	public String toString() {
		return "Moto [MATRICULA=" + matricula + ", KM=" + km + ", CILINDRADA=" + cilindrada + "]";
	}

}
