package examen;

public class Personatge {
	protected String nomPersonatge;
	protected Jugador jugador;
	protected int vida;
	protected int puntuacio = 0;
	protected int nivell = 1;
	protected static int numPersonatges;

	public String getNomPersonatge() {
		return nomPersonatge;
	}

	public void setNomPersonatge(String nomPersonatge) {
		this.nomPersonatge = nomPersonatge;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	public int getNivell() {
		return nivell;
	}

	public void setNivell(int nivell) {
		this.nivell = nivell;
	}

	public int getNumPersonatges() {
		return numPersonatges;
	}

	public void setNumPersonatges(int numPersonatges) {
		this.numPersonatges = numPersonatges;
	}

//constructor con todo
	public Personatge(String nomPersonatge, Jugador jugador, int vida, int puntuacio, int nivell, int numPersonatges) {
		super();
		this.nomPersonatge = nomPersonatge;
		this.jugador = jugador;
		this.vida = vida;
		this.puntuacio = puntuacio;
		this.nivell = nivell;
		this.numPersonatges = numPersonatges++;
	}

	// constructor solo nombre y vida a 100;
	public Personatge(String nomPersonatge, int vida) {
		this.nomPersonatge = nomPersonatge;
		this.vida = 100;

	}

	// metodes

	public Personatge ataca(boolean ataca, Personatge personatgeAtacat, int dany) {
		if (ataca == true) {
			puntuacio = puntuacio + 50;
			return personatgeAtacat;
		}
		return personatgeAtacat;
	}

	public int repDany(boolean repDany, int dany, int vida) {
		if (repDany == true) {
			vida -= dany;
		}
		return dany;

	}

	public int guanyaPunts(boolean gana, int puntuacio, Personatge personatjeAtacat) {
		if (gana == true) {
			puntuacio = puntuacio + 50;
		}
		return puntuacio;

	}

	public boolean esViu(int vida) {
		if (vida > 0) {
			return true;

		} else {
			return false;
		}
	}

}
