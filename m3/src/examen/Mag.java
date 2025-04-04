package examen;

public class Mag extends Personatge {
	private int energiaMagica;

	public int getEnergiaMagica() {
		return energiaMagica;
	}

	public void setEnergiaMagica(int energiaMagica) {
		this.energiaMagica = energiaMagica;
	}

	public Mag(String nomPersonatge, Jugador jugador, int vida, int puntuacio, int nivell, int numPersonatges,
			int energiaMagica) {
		super(nomPersonatge, jugador, vida, puntuacio, nivell, numPersonatges);
		this.energiaMagica = energiaMagica;
	}

	public Personatge ataca(boolean ataca, Personatge personatgeAtacat, int dany) {
		if (ataca == true) {
			puntuacio = puntuacio + 50;
			return personatgeAtacat;
		}
		return personatgeAtacat;
	}

}
