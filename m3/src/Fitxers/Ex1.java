package Fitxers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String nomFitxer = LeerFitxero(scanner);
		System.out.println("La suma total es: " + suma(nomFitxer));
	}

	/**
	 * @param scanner
	 * @return
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static String LeerFitxero(Scanner scanner) throws IOException, FileNotFoundException {
		System.out.print("Introdueix el nom del fitxer: ");
		String nomFitxer = scanner.nextLine();
		File fitxer = new File(nomFitxer);
		FileReader fReader = null; // Lector del fitxer
		BufferedReader bReader = null; // Buffer
		String linea;

		if (fitxer.exists()) {
			System.out.println("El fitxer existeix");
			System.out.println("Ruta absoluta: " + fitxer.getAbsolutePath()); // {path_to_file}/fitxer
		} else {
			System.out.println("El fitxer NO existeix, el creem");
			fitxer.createNewFile();
		}
		fReader = new FileReader(fitxer); // Inicialitza lector amb el fitxer
		bReader = new BufferedReader(fReader); // Inicialitza buffer
		System.out.println("");
		System.out.println("Contenido del fitxero:");
		while ((linea = bReader.readLine()) != null) {
			System.out.println(linea);
		}
		return nomFitxer;
	}

	public static int suma(String scanner) {
		int suma = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(scanner))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				int numero = Integer.parseInt(linea); // Pasar de String a int
				suma = suma + numero;
			}
		} catch (IOException e) {
			System.out.println("Error en llegir el fitxer: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("El fitxer conté dades no vàlides.");
		}
		return suma;
	}
}