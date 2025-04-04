package listas2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;

public class Exercici4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		HashSet<Persona> persones = new HashSet<>();

		System.out.println("Introduce los datos de las personas (nombre, fecha (dd/MM/yyyy), teléfono):");

		while (true) {
			String datos = scanner.nextLine();
			if (datos.isEmpty()) {
				System.out.println("\nLista de personas:");
				System.out.println("Nombre                " + "Edad           " + "Telefono        ");
				System.out.println("-------------------------------------------------------------------");
				for (Persona p : persones) {
					System.out.println(p);
				}

			}

			String nombre_apellido;
			String fecha;
			String tlf;
			try {
				String[] partes = datos.split(",");

				if (partes.length > 1 & partes.length < 3) {
					System.out.println("hola");

				}

				nombre_apellido = partes[0].trim();
				fecha = partes[1].trim();
				tlf = partes[2].trim();

				try {
					LocalDate fechaNac = LocalDate.parse(fecha, formato);
					Persona persona = new Persona(nombre_apellido, fechaNac, tlf);

					if (persones.contains(persona)) {
						System.out.println("¡Esa persona ya está añadida!");
					} else {
						persones.add(persona);
						System.out.println("Persona añadida correctamente.");
					}
				} catch (Exception e) {
					System.out.println("Formato de fecha incorrecto. Usa dd/MM/yyyy.");

				}
			} catch (Exception e) {
				System.out.println("¡Error! Debes introducir: Nombre, Fecha de nacimiento (dd/MM/yyyy), Teléfono.");

			}

		}
	}

}
