package Fitxers;

public class MatriculaInvalidaException extends Exception {

	public MatriculaInvalidaException(String message) {
		super(message);
	}

	public String getLocalizedMessage() {
		String error = super.getMessage();
		error += "\nLA MATRICULA NO ES VALIDA!";
		return error;
	}
}
