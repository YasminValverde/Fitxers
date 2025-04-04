package listas2;

import java.util.LinkedList;
import java.util.Queue;

public class Exercici2 {

	public static void main(String[] args) {
		Queue<String> cola = new LinkedList<>();
//La cola ordena la lista por orden de llegada , y elimina por orden de llegada//
		// Afegir a la cua per aquest ordre “1”, “2”, “3”, “4”, “5”, “6”//
		cola.offer("1");
		cola.offer("2");
		cola.offer("3");
		cola.offer("4");
		cola.offer("5");
		cola.offer("6");

		System.out.println(cola);

		// Treure de la cua 3 elements//
		cola.poll();
		cola.poll();
		cola.poll();
		System.out.println(cola); // Para ver como ha quedado la cola

		// Afegir a la cua per aquest ordre “A”, “B”, “C”//
		cola.offer("A");
		cola.offer("B");
		cola.offer("C");

		// Treure de la cua 2 elements//
		cola.poll();
		cola.poll();

		// El resultat és : , “6” -> “A” -> “B” -> “C”//
		System.out.println("El resultat es: " + cola);

	}

}
