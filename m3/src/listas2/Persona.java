package listas2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona {
	private String nom;
	private LocalDate data_naixement;
	private String tlf;

	public Persona(String nom, LocalDate data_naixement, String tlf) {
		this.nom = nom;
		this.data_naixement = data_naixement;
		this.tlf = tlf;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LocalDate getData_naixement() {
		return data_naixement;
	}

	public void setData_naixement(LocalDate data_naixement) {
		this.data_naixement = data_naixement;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public int calcularEdad() {

		return Period.between(data_naixement, LocalDate.now()).getYears();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(data_naixement, other.data_naixement) && Objects.equals(nom, other.nom)
				&& Objects.equals(tlf, other.tlf);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data_naixement, nom, tlf);
	}

	@Override
	public String toString() {
		return String.format("%-20s, %12s, %10s", nom, calcularEdad(), tlf);
	}
}
