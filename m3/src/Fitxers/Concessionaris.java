package Fitxers;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Concessionaris {
	private String adreça;
	protected Set<Vehicles> vehicles;
	private static final int MAX_VEHICLES = 10;

	public Concessionaris() {
		this.vehicles = new TreeSet<>(new Comparator<Vehicles>() {
			public int compare(Vehicles v1, Vehicles v2) {
				return v1.getMatricula().compareTo(v2.getMatricula());
			}
		});
	}
	// CREAR CONSTRUCTOR VACIO

	public String getAdreça() {
		return adreça;
	}

	public void setAdreça(String adreça) {
		this.adreça = adreça;
	}

	public Set<Vehicles> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Set<Vehicles> vehicles) {
		this.vehicles = vehicles;
	}

	public static int getMaxVehicles() {
		return MAX_VEHICLES;
	}

	// ------------Afegir i treure vehicles del concessionari----------------//
	public boolean añadirVehiculo(Vehicles vehicle) {
		if (vehicles.size() >= MAX_VEHICLES) {
			System.out.println("No se puede añadir más vehículos!");
			return false;
		}
		return vehicles.add(vehicle);
	}

	public boolean treureVehicle(Vehicles v) {
		return vehicles.remove(v);

	}

	// ------------Conèixer el nombre de vehicles dels concessionaris-----------//

	public int obtenirNumVehicles() {

		return vehicles.size();
	}

	// -----------Mostrar la llista de vehicles al concessionari------------//
	public void mostrarVehicles() {
		for (Vehicles vehicles2 : vehicles)
			System.out.println(vehicles2);
		System.out.println();
	}

	// --Conèixer la mitjana del quilometratge dels vehicles d'un concessionari//
	public double mitjanaKm() {
		int totalKm = 0;
		if (vehicles.isEmpty()) {
			return 0;
		}

		for (Vehicles v : vehicles) {
			totalKm += v.getKm();
		}
		return (double) totalKm / vehicles.size();
	}

	// ------Metodo EX3---------//
	public String LeerFitxero(String nomFitxer) throws IOException, FileNotFoundException, MatriculaInvalidaException {
		File fitxer = new File(nomFitxer);
		FileReader fReader = null; // Lector del fitxer
		BufferedReader bReader = null; // Buffer
		String linea;

		if (fitxer.exists()) {
			System.out.println("El fitxer existeix");
			System.out.println("Ruta absoluta: " + fitxer.getAbsolutePath()); // {path_to_file}/fitxer
		} else {
			System.out.println("El fitxer NO existeix, el creem");
			fitxer.createNewFile();
		}
		fReader = new FileReader(fitxer); // Inicialitza lector amb el fitxer
		bReader = new BufferedReader(fReader); // Inicialitza buffer
		System.out.println("");
		System.out.println("Contenido del fitxero:");

		while ((linea = bReader.readLine()) != null) {
			String string = linea;
			String[] parts = string.split(";");
			String tipo = parts[0].trim();
			String matricula = parts[1].trim();
			String km = parts[2].trim();
			String dato = parts[3].trim();
			int KM = Integer.parseInt(km);

			if (tipo.equalsIgnoreCase("cotxe")) {
				boolean classic = Boolean.parseBoolean(dato);
				Cotxes c1 = new Cotxes(matricula, KM, classic);
				añadirVehiculo(c1);
				System.out.println("Se ha creado un COCHE nuevo:  " + linea);
			} else if (tipo.equalsIgnoreCase("moto")) {
				int cilindrada = Integer.parseInt(dato);
				Motos m1 = new Motos(matricula, KM, cilindrada);
				añadirVehiculo(m1);
				System.out.println("Se ha creado una MOTO nueva:  " + linea);
			} else {
				System.out.println("¡ESE TIPO DE VEHICULO NO ESTA PERMITIDO!");
			}
		}
		return nomFitxer;
	}

	public void guardarXML() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el nombre del archivo XML: ");
		String nomFitxer = scanner.nextLine();

		try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(nomFitxer + ".xml")))) {
			encoder.writeObject(this.vehicles); // Guarda el objeto Concessionaris completo
			System.out.println("Concesionario guardado en " + nomFitxer + ".xml correctamente.");
		} catch (IOException e) {
			System.out.println("Error al guardar el archivo XML: " + e.getMessage());
		}
	}

}
