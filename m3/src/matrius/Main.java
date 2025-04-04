package matrius;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cuenta[] cuentas = new Cuenta[10];
		// vector de cuentas
		/*
		 * cuentas[0] = new Cuenta("ES6112343456420456323532", "47671439J",
		 * "Mario Jimenez", 2.0, -40); System.out.println(cuentas[0]);
		 */
		/*
		 * cuentas[1] = new Cuenta("ES6112343456420456323532", "47671439Y",
		 * "Marcos Lopez", 20.0, -20); System.out.println(cuentas[1]);
		 */
		cuentas[2] = new Cuenta("ES6101823456420456323532", "47671439G", "Max Helmans", 20.00);

		cuentas[3] = new Cuenta("ES61004943456420456323982", "47671459K", "Emma Hellesmark", 400.00);

		try {
			// Saber banco con matriz
			System.out.println("La cuenta de banco del cliente " + cuentas[2].getNombre_cliente() + " pertenece a "
					+ cuentas[2].getBanco());
			System.out.println("La cuenta de banco del cliente " + cuentas[3].getNombre_cliente() + " pertenece a "
					+ cuentas[3].getBanco());

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("La logitud del IBAN no es correcta!");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
