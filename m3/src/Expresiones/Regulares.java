package Expresiones;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regulares {
	private static final List<String> CODIGOS_PROVINCIALES = Arrays.asList("A", "AB", "AL", "AV", "B", "BA", "BI", "BU",
			"C", "CA", "CC", "CS", "CR", "CO", "CU", "GE", "GR", "GU", "H", "HU", "J", "L", "LE", "LO", "LU", "M", "MA",
			"MU", "O", "OR", "P", "NA", "PM", "PO", "S", "SA", "SS", "SG", "SE", "SO", "T", "TE", "GC", "TF", "TO", "V",
			"VA", "VI", "Z", "ZA", "CE", "ML", "GI", "OU", "IB");

	// --------metodo validar correo -------------------//

	public boolean validarCorreo(String correo) {
		String condiciones = ("^[a-zA-Z0-9._]+@[a-zA-Z]+\\.+[a-zA-Z]{2,}");
		boolean encontrado = Pattern.matches(condiciones, correo);
		Pattern pattern = Pattern.compile(condiciones);
		Matcher matcher = pattern.matcher(correo);
		return matcher.matches();
	}

//---------------METODO	SI UNA CADENA SLO TIENE NUMEROS Y LETRAS---------------//

	public boolean validarCadena(String cadena) {
		String condiciones = ("^[a-zA-Z]+$|^[0-9]+$");
		boolean encontrado = Pattern.matches(condiciones, cadena);
		Pattern pattern = Pattern.compile(condiciones);
		Matcher matcher = pattern.matcher(cadena);
		return matcher.matches();

	}

//---------------METODO	VALIDAR NUMERO TELEFONO---------------//
	public boolean validarTelefono(String telefono) {
		String condiciones = ("^[0-9]{9}|^[0-9]{3}\\s[0-9]{2}\\s[0-9]{2}\\s[0-9]{2}|^\\+34\\s[0-9]{9}");
		boolean encontrado = Pattern.matches(condiciones, telefono);
		Pattern pattern = Pattern.compile(condiciones);
		Matcher matcher = pattern.matcher(telefono);
		return matcher.matches();

	}

	// ---------------METODO VALIDAR CONTRASENYA---------------//

	public boolean validarContraseña(String contraseña) {
		String condiciones = ("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%&]).{8,}$");
		boolean encontrado = Pattern.matches(condiciones, contraseña);
		Pattern pattern = Pattern.compile(condiciones);
		Matcher matcher = pattern.matcher(contraseña);
		return matcher.matches();
	}

	// ---------------METODO VALIDAR MATRICULA---------------//
	public boolean validarMatricula(String matricula) {

		String condiciones = ("^[0-9]{4}\\-[B-Z]{3}|^[A-Z]{2}\\-[0-9]{4}\\-[A-Z]{1}|^[CODIGOS_PROVINCIALES]{1}\\-[0-9]{4}\\-[A-Z]{2}");
		boolean encontrado = Pattern.matches(condiciones, matricula);
		Pattern pattern = Pattern.compile(condiciones);
		Matcher matcher = pattern.matcher(matricula);
		return matcher.matches();
	}

}
