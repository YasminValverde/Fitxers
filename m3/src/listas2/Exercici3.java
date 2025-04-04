package listas2;

import java.util.Deque;
import java.util.LinkedList;

public class Exercici3 {

	public static void main(String[] args) {
		// La pila pone primero los ultimos que llegan,y elimina los ultimos que
		// llegan//
		Deque<String> pila = new LinkedList<>();

		// Afegir a la pila per aquest ordre “1”, “2”, “3”, “4”, “5”, “6”//
		pila.push("1");
		pila.push("2");
		pila.push("3");
		pila.push("4");
		pila.push("5");
		pila.push("6");

		System.out.println(pila);

		// Treure de la pila 3 elements//
		pila.poll();
		pila.poll();
		pila.poll();
		System.out.println(pila);

		// Afegir a la pila per aquest ordre “A”, “B”, “C”//
		pila.push("A");
		pila.push("B");
		pila.push("C");
		System.out.println(pila);

		// Treure de la pila 2 elements//
		pila.poll();
		pila.poll();

		// El resultat és : “A” -> “3” -> “2” -> “1”//
		System.out.println("El resultado es: " + pila);

	}

}
