package examen;

import java.time.LocalDate;

public class Jugador {
	private String nomUsuari;
	private LocalDate dataNaixement;
	private String idiomPreferit;
	private String pasword;

	public String getNomUsuari() {
		return nomUsuari;
	}

	public void setNomUsuari(String nomUsuari) {
		this.nomUsuari = nomUsuari;
	}

	public LocalDate getDataNaixement() {
		return dataNaixement;
	}

	public void setDataNaixement(LocalDate dataNaixement) {
		this.dataNaixement = dataNaixement;
	}

	public String getIdiomPreferit() {
		return idiomPreferit;
	}

	public void setIdiomPreferit(String idiomPreferit) {
		this.idiomPreferit = idiomPreferit;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public Jugador(String nomUsuari, LocalDate dataNaixement, String idiomPreferit, String pasword) {
		this.nomUsuari = nomUsuari;
		this.dataNaixement = dataNaixement;
		this.idiomPreferit = idiomPreferit;
		this.pasword = pasword;
	}

}
