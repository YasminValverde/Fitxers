package Fitxers;

public class Cotxes extends Vehicles {
	private boolean esClassic;
	/*
	 * private static int contador = 0; private int numero; // numero único para
	 * cada coche
	 */

	public Cotxes(String matricula, int km, boolean esClassic) throws MatriculaInvalidaException {
		super(matricula, km);
		this.esClassic = esClassic;
		/* this.numero = ++contador; */
	}

	public Cotxes() {
		super(); // Constructor vacío necesario para la serialización XML
	}

	public boolean isEsClassic() {
		return esClassic;
	}

	public void setEsClassic(boolean esClassic) {
		this.esClassic = esClassic;
	}

	// -----Calcular el descompte d'un vehicle en funció del quilometratge---/
	public double calcularDescompte(double preuInicial) {
		double descomptePerKm = (int) (this.getKm() / 10000) * 0.01;

		if (!esClassic) {
			if (descomptePerKm >= 0.10) {
				descomptePerKm = 0.10;
			}
		} else {
			System.out.println("EL TEU COTXE ES CLASSIC , NO TENS DESCOMPTE!");
			return 0;
		}
		return preuInicial * (1 - descomptePerKm);
	}

	@Override
	public int compareTo(Vehicles o) {

		return 0;
	}

	@Override
	public String toString() {
		return "Cotxes [MATRICULA =" + matricula + ", KM=" + km + ", ES_CLASSIC=" + esClassic + "]";
	}

}
