package myArrayList;

public class MyArrayList {
	public String[] vector;
	public int tamaño;

	public MyArrayList(int cantidad) {
		this.vector = new String[cantidad];
		this.tamaño = 0;
	}

	public MyArrayList() {
		this.vector = new String[100];
		this.tamaño = 0;
	}

	// ------METODO----//

	public void add(String elemento) {
		this.vector[tamaño] = elemento;
		tamaño++;
	}

	public void add(int posicion, String elemento) {
		this.vector[posicion] = elemento;
		tamaño++;
	}

//-----METODO GET----//
	public String get(int posicion) {
		return vector[posicion];

	}

	// -----METODO SET----//
	public void set(int posicion, String elemento) {
		this.vector[posicion] = elemento;
	}

	// tengo que verificar que no me pase del tamaño total//

}
