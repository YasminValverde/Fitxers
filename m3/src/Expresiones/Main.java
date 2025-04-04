package Expresiones;

public class Main {

	public static void main(String[] args) {
		Regulares r1 = new Regulares();
		// ---------VALIDAR CORREO ------------//
		if (r1.validarCorreo("john.doe123@mail.net")) {
			System.out.println("EL CORREO es valido!");

		} else {
			System.out.println("¡EL CORREO NO ES VALIDO!");

		}

		// ---------------VALIDAR CADENA ---------------//

		if (r1.validarCadena("HOLAmundo")) {
			System.out.println("TRUE:La cadena contiene solo LETRAS O NUMEROS.");

		} else {
			System.out.println("LA CADENA NO CONTIENE SOLO NUMEROS O LETRAS!");

		}

		// ---------------VALIDAR NUMERO TELEFONO ---------------//

		if (r1.validarTelefono("+34 612345678")) {
			System.out.println("El numero es valido!");

		} else

		{
			System.out.println("¡EL NUMERO NO ES VALIDO!");
		}

		// ---------------VALIDAR NUMERO CONTRASENYA ---------------//
		if (r1.validarContraseña("yasminValverde5@")) {
			System.out.println("La contraseña es segura");

		} else {
			System.out.println("¡LA CONTRASEÑA NO ES SEGURA!");

		}

		// ---------------VALIDAR MATRICULA ---------------//
		if (r1.validarMatricula("B-3456-AN")) {
			System.out.println("La matricula es valida");

		} else {
			System.out.println("LA MATRICULA NO ES VALIDA!");

		}

	}

}
