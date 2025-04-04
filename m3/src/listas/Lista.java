package listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Lista {

	public static void main(String[] args) {

		// ---------------LISTA STRING[]----------------------------//
		String[] listString = new String[10];
		int cantidad = 0;
		listString[0] = "barcelona";
		cantidad++;
		listString[1] = "madrid";
		cantidad++;
		listString[2] = "valencia";
		cantidad++;
		listString[3] = "sevilla";
		cantidad++;

		for (int i = 0; i < cantidad; i++) {
			System.out.println(listString[i]);

		}

		// --------------- LISTA ARRAYLIST--------------------------//
		ArrayList<String> ciudades = new ArrayList<>();
		ciudades.add("malaga");
		ciudades.add("bilbao");
		ciudades.add("zaragoza");
		ciudades.add("Palma");

		System.out.println("Lista ARRAYLIST de ciudades: " + ciudades);

		String ciudad = ciudades.get(2);
		System.out.println(ciudad);

		String eliminar = ciudades.remove(0);
		System.out.println("Lista actualizada ARRAYLIST: " + ciudades);
		System.out.println("Ciudad eliminada: " + eliminar);

		ciudades.set(1, "granada");
		System.out.println("Lista actualizada ARRAYLIST: " + ciudades);
		System.out.println("Tamaño de la array: " + ciudades.size());

		// --------------- LISTA LINKEDLIST--------------------------//
		LinkedList<String> nombres = new LinkedList<>();
		nombres.add("marta");
		nombres.add("carla");
		nombres.add("emma");
		nombres.add("nora");
		nombres.add("gemma");

		System.out.println("Lista ARRAYLIST de nombres: " + nombres);

		String nombre = nombres.get(3);
		System.out.println(nombre);

		String eliminarNombre = nombres.remove(4);
		System.out.println("Lista actualizada ARRAYLIST de nombres: " + nombres);
		System.out.println("Nombre eliminada: " + eliminarNombre);

		nombres.set(2, "laia");
		System.out.println("Lista actualizada ARRAYLIST de nombres: " + nombres);

		System.out.println("Tamaño de la array de nombres: " + nombres.size());

		// --------------- LISTA VECTOR--------------------------//
		Vector<String> marcas = new Vector<>();
		marcas.add("ferrari");
		marcas.add("buggati");
		marcas.add("fordMustang");
		marcas.add("maclaren");
		marcas.add("BMW");

		System.out.println("Lista VECTOR de marcas: " + marcas);

		String marca = marcas.get(1);
		System.out.println(marca);

		String eliminarMarca = marcas.remove(1);
		System.out.println("Lista actualizada ARRAYLIST de nombres: " + marcas);
		System.out.println("Nombre eliminada: " + eliminarMarca);

		nombres.set(3, "mercedes");
		System.out.println("Lista actualizada ARRAYLIST de nombres: " + marcas);
		System.out.println("Tamaño de la array de nombres: " + marcas.size());
	}

}
