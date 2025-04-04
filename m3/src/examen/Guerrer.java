package examen;

public class Guerrer extends Personatge {
	private int força = 30;
	private boolean escut;

	public int getForça() {
		return força;
	}

	public void setForça(int força) {
		this.força = força;
	}

	public boolean isEscut() {
		return escut;
	}

	public void setEscut(boolean escut) {
		this.escut = escut;
	}

//constructor
	public Guerrer(String nomPersonatge, Jugador jugador, int vida, int puntuacio, int nivell, int numPersonatges,
			int força, boolean escut) {
		super(nomPersonatge, jugador, vida, puntuacio, nivell, numPersonatges);
		this.força = força;
		this.escut = escut;
	}

	// metodes

	public Personatge ataca(boolean ataca, Personatge personatgeAtacat) {
		if (ataca == true) {
			puntuacio = puntuacio + 50;
			return personatgeAtacat;
		}
		return personatgeAtacat;
	}
	/*
	 * public int activatEscut(boolean escut) { if (escut == true) { return 2; }
	 * return;
	 * 
	 * }
	 */

	public int repDany(boolean repDany, int dany, int vida, int puntuacio) {
		if (repDany == true) {
			vida -= dany;
		}
		return vida;
	}
}
