package Fitxers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner scanner = new Scanner(System.in);
		Concessionaris con1 = new Concessionaris();

		/*
		 * // ------------EXERCICI-1----------- Ex1.LeerFitxero(scanner);
		 * Ex1.suma(scanner);
		 */

		boolean salir = false;
		int options;
		int v[] = new int[5];

		while (salir != true) {
			System.out.println(" ");
			System.out.println("1 - Carregar vehicles des d'un fitxer CSV");
			System.out.println("2 - Carregar vehicles des d'un fitxer XML");
			System.out.println("3 - Mostrar la llista de vehicles");
			System.out.println("4 - Afegir un vehicle");
			System.out.println("5 - Treure un vehicle (Per matrícula)");
			System.out.println("6 - Quin és el cotxe amb més quilòmetres");
			System.out.println("7 - Desar els vehicles a un fitxer CSV");
			System.out.println("8 - Desar els vehicles a un fitxer XML");
			System.out.println("9 - Eliminar la lista y cargar de nuevo");
			System.out.println("0 - Salir");
			System.out.print("\nEscribe tu opción: ");
			options = scanner.nextInt();
			scanner.nextLine();

			switch (options) {
			case 1:
				System.out.print("Introdueix el nom del fitxer: ");
				String nomFitxer = scanner.nextLine();
				try {
					con1.cargarCSV(nomFitxer);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (MatriculaInvalidaException e) {
					e.printStackTrace();
				}
				break;
			case 2:

				break;
			case 3:
				System.out.println("");
				System.out.println("------LA LLISTA DE VEHICLES----");
				con1.mostrarVehicles();
				break;
			case 4:
				System.out.println(" ");
				System.out.print("Introduce los datos[matricula, km, es classic? / cilindrada]: ");
				String datos = scanner.nextLine();
				try {
					con1.añadirVehiculoPorTeclado(datos);
				} catch (MatriculaInvalidaException e) {
					e.printStackTrace();
				}
				break;
			case 5:
				System.out.print("Introduce la matricula del vehiculo que quieres eliminar: ");
				String matricula = scanner.nextLine();
				if (!con1.quitarVehiculo(matricula)) {
					System.out.println("NO SE PUEDE ELIMINAR ESE VEHICULO!NO EXISTE!!");

				} else {
					System.out.println("Vehiculo con matricula " + matricula + " fue eliminado correctamente!");
				}

				break;
			case 6:
				System.out.println("El cotxe con mas km es: " + con1.cotxeMesKM());
				break;

			case 7:
				System.out.print("Introduce el nombre del archivo .txt: ");
				String nomFitxer_txt = scanner.nextLine();
				con1.guardarCSV(nomFitxer_txt);
				break;
			case 8:
				System.out.print("Introduce el nombre del archivo XML: ");
				String nomFitxer_xml = scanner.nextLine();
				con1.guardarXML(nomFitxer_xml);
				break;
			case 0:
				salir = true;
				break;

			default:
				System.out.println("Opción incorrecta. Elige entre 1 - 8.");
				break;

			}

		}
	}
}
