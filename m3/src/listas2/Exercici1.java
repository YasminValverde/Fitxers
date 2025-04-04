package listas2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Exercici1 {

	public static void main(String[] args) {
		// ------------EXERCICI 1------------------//
		String[] dades = { "rojo", "verde", "azul claro", "azul marino" };
		String[] mesdades = { "amarillo", "naranja", "rosa fucsia" };
		ArrayList<String> lista = new ArrayList<>(Arrays.asList(dades));

		// Afegeix les següents dades totes de cop (Veure classe Arrays)//
		lista.addAll(Arrays.asList(mesdades));
		System.out.println(lista);

		// Afegeix el text “gris marengo” a la posició 2//
		lista.add(2, "gris marengo");

		// Mostrar//
		System.out.println("La mida del vector es: " + lista.size());

		// Si conté l'element “naranja”//
		if (lista.contains("naranja")) {
			System.out.println("La lista si contiene naranja");

		} else {
			System.out.println("¡LA LISTA NO CONTIENE NARANJA!");

		}
		// Si conté l'element “Morado”//
		if (lista.contains("morado")) {
			System.out.println("La lista si contiene morado");

		} else {
			System.out.println("¡LA LISTA NO CONTIENE MORADO!");

		}

		// L'element de la posició 5//
		System.out.println("El elemento de la posicion 5 es: " + lista.get(5));

		// Esborra l'element de la posició 0//
		String borrado = lista.remove(0);
		if (borrado != null) {
			System.out.println("El color borrado ha sido: " + borrado);
		} else {
			System.out.println("En esa posicion no existe");

		}

		// Esborra “verde”//
		if (lista.remove("verde")) {
			System.out.println("El color ha sido borrado correctamente!");

		} else {
			System.out.println("El color no existe en la array");

		}

		// Converteix els elements de la posició 3 fins al final en una llista enllaçada
		// (LinkedList)//
		LinkedList<String> lista2 = new LinkedList<>(lista.subList(3, lista.size()));
		// Mostra el contingut de la llista enllaçada//
		System.out.println(lista2);

	}

}
