package matrius;

import java.util.Scanner;

public class Matriz {

	public static final int FILES = 3;
	public static final int COLUMNES = 4;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] mat = new int[FILES][COLUMNES]; // crear una matriz 3x4

		// introduir-los en una matriu de N files i M columnes por teclado
		System.out.println("Introduce los numeros para la matriz:");
		for (int i = 0; i < FILES; i++) {
			for (int j = 0; j < COLUMNES; j++) {

				mat[i][j] = scanner.nextInt();

			}

		}
		// mostrar valores de la matriz
		for (int i = 0; i < FILES; i++) {
			for (int j = 0; j < COLUMNES; j++) {

				System.out.print(mat[i][j] + " ");

			}
			System.out.print("\n");
		}

		// contar cuantos parells hi ha
		int pares = 0;
		for (int i = 0; i < FILES; i++) {
			for (int j = 0; j < COLUMNES; j++) {
				if (mat[i][j] % 2 == 0) {
					pares++;

				}

			}
		}
		System.out.println("Hay un total de " + pares + " numeros pares en la matriz");

	}

}
