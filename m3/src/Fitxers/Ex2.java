package Fitxers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		boolean append = false;
		boolean fi = false;
		int contarPalabras = 0;

		System.out.print("Introdueix el nom del fitxer: ");
		String nomFitxer = scanner.nextLine();
		File fitxer = new File(nomFitxer);// Le asigna al fitxero el nombre que el usuario ha puesto
		FileReader fReader = null; // Lector del fitxer
		BufferedReader bReader = null; // Buffer
		if (fitxer.exists()) {
			System.out.println("El fitxer existeix");
			System.out.println("Ruta absoluta: " + fitxer.getAbsolutePath());
		} else {
			System.out.println("El fitxer NO existeix, el creem");
			fitxer.createNewFile();
		}

		try (PrintWriter pWriter = new PrintWriter(new FileWriter(nomFitxer, append))) {
			while (!fi) {
				System.out.print("Introdueix un text (o 'fi' per acabar): ");
				String text = scanner.nextLine();
				pWriter.println(text); // Escribe lo que el usuario le dice por teclado

				if (text.isEmpty()) { // Verificamos si text esta vacio
					contarPalabras = 0;
				} else {
					String[] palabras = text.split("\\s+");// Esto separa las palabras por espacios.
					contarPalabras = palabras.length; // cuenta las palabras que hay hasta su final.
				}

				if (text.equalsIgnoreCase("fi")) { // SI el usuario escribe FI,la variable "fi" se pone true y se sale
													// del bucle//
					System.out.println("Has acabado!");
					fi = true;
				} else {
					System.out.println(text + "(" + "Té " + contarPalabras + " paraules" + ")");
				}

			}
			System.out.println("Text guardado en:  " + nomFitxer);
			System.out.println("Ruta absoluta: " + fitxer.getAbsolutePath()); // Enseña donde esta el fitxero

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
	}

}