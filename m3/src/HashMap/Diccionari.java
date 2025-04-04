package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionari {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> definiciones = new HashMap<>();
		int numero = -1;
		while (numero != 0) {
			try {
				System.out.println("");
				System.out.println("1-Agregar palabra y definicion");
				System.out.println("2-Eliminar palabra");
				System.out.println("3-Consultar definicion");
				System.out.println("4-Ver todas las palabras y definiciones");
				System.out.println("0-Salir del menu");
				System.out.print("Elige una opcion: ");
				System.out.print("");
				String opcion = scanner.nextLine();
				int op = Integer.parseInt(opcion);

				switch (op) {
				case 1:
					System.out.println("");
					System.out.print("Palabra que quieras añadir: ");
					String palabra = scanner.nextLine();
					if (definiciones.containsKey(palabra)) {
						System.out.println("!ESA PALABRA YA EXISTE EN EL DICCIONARIO¡");
						System.out.println("1-Si quieres cambiar la definicion de esa palabra");
						System.out.println("2-No quieres cambiar nada");
						System.out.print("Elige: ");
						String opcion2 = scanner.nextLine();
						int op2 = Integer.parseInt(opcion2);
						switch (op2) {
						case 1:
							System.out.print("Escribe su defnicion: ");
							String definicion = scanner.nextLine();
							definiciones.put(palabra, definicion);

							break;
						case 2:
							System.out.println("Has vuelto al MENU");

							break;
						default:
							break;
						}

					} else if (definiciones.containsKey(palabra) == false) {
						System.out.print("Escribe su defnicion: ");
						String definicion = scanner.nextLine();
						definiciones.put(palabra, definicion);

					}

					break;
				case 2:
					System.out.println("");
					System.out.print("Palabra que quieras eliminar del diccionario: ");
					String eliminar = scanner.nextLine();
					definiciones.remove(eliminar);
					System.out.println("La palabra se ha eliminado correctamente");
					System.out.println("La palabra eliminada es: " + eliminar);

					break;
				case 3:
					System.out.println("");
					System.out.print("Palabra que quieras saber su definicion: ");
					String consultar = scanner.nextLine();
					if (definiciones.get(consultar) != null) {
						System.out.println(consultar + ": " + definiciones.get(consultar));
						System.out.println("");
					} else {

						System.out.println("¡Esa palabra no esta en el diccionario!");
						System.out.println("");
					}
					break;
				case 4:
					if (definiciones.isEmpty() == true) {
						System.out.println("");
						System.out.println("¡EL DICCIONARIO ESTA VACIO!");

					} else {
						System.out.println("Lista de todas las palabras y definiciones del dicionario: ");
						System.out.println("");
						for (String def : definiciones.keySet()) {
							System.out.println(def + ": " + definiciones.get(def));
							System.out.println("");
						}
						System.out.println(" ");
					}

					break;
				case 0:
					System.out.println("¡Has salido del menu!");
					numero = 0;

					break;

				default:
					break;
				}

			} catch (Exception e) {

			}

		}

		/*
		 * PALABRAS DE PRUEBA Pelota Bola hecha de una materia que le permita botar,
		 * usada en diversos juegos y deportes.
		 * 
		 * Ordenador Jefe de una ordenación de pagos u oficina de cuenta y razón.
		 * 
		 * Pantalla Superficie que sirve de protección, separación, barrera o abrigo.
		 * 
		 */
	}

}
