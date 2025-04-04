package listas;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();
		Persona p1 = new Persona("Marta", "47672612I");
		Persona p2 = new Persona("Alex", "47671438G");
		Persona p3 = new Persona("Irene", "47671447Y");
		Persona p4 = new Persona("Marcos", "47678427P");
		Persona p5 = new Persona("Nora", "47678490Ñ");

		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);

		// Mostra les dades de la persona que està en la posició 1 (get)//
		System.out.println("");
		Persona persona = personas.get(1);
		System.out.println(persona);

		// Mostra quantes persones hi ha a la llista (size)//
		System.out.println("");
		System.out.println("Cantidad de personas: " + personas.size());

		// Canvia les dades de la persona que està en la posició 1 (set)//
		System.out.println("");
		Persona modificarPers = personas.get(1);
		modificarPers.setNom("Paula");
		modificarPers.setDNI("45382715J");
		System.out.println(personas);

		// Esborra la persona que està en la posició 2 (remove)//
		System.out.println("");
		Persona eliminada = personas.remove(2);
		System.out.println("Array actualizada: " + personas);
		System.out.println("Persona eliminada: " + eliminada);

		// Mostra la llista sencera amb un forEach//
		System.out.println("");
		for (Persona p : personas) {
			System.out.println(p);

		}
		// Crea un arrayList de persones amb 2 pacients i 2 doctors.//
		ArrayList<Persona> persones2 = new ArrayList<>();
		System.out.println("");

		Paciente pa1 = new Paciente("Marta", "47672612I", " ULTIMA VISITA:20 Enero 2025");
		Paciente pa2 = new Paciente("Yasmin", "47671439Y", "ULTIMA VISITA:3 Febrero 2025");
		Doctor doc1 = new Doctor("John", "47662231P", "Pediatria");
		Doctor doc2 = new Doctor("Teressa", "47671092T", "Cardiologia");

		persones2.add(pa1);
		persones2.add(doc1);
		personas.add(pa2);
		personas.add(doc2);

		// Mostra la informació de la llista i utilitza instanceof.//
		System.out.println("");
		for (Persona pers2 : persones2) {
			if (pers2 instanceof Doctor) {
				System.out.println("Doctor:" + pers2);

			} else if (pers2 instanceof Paciente) {
				System.out.println("Pacient:" + pers2);

			}

		}

	}

}
