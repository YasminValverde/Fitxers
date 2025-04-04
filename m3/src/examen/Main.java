package examen;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Personatge[] personatges = new Personatge[5];

		Jugador jugador1 = new Jugador("Marc", LocalDate.parse("2006-09-05"), "angles", "marianao");
		Jugador jugador2 = new Jugador("Paula", LocalDate.parse("2004-02-20"), "español", "marianao");

		Guerrer pers1 = new Guerrer("Kilian", jugador1, 100, 300, 2, 3, 50, true);
		Mag pers2 = new Mag("Emma", jugador2, 80, 500, 4, 2, 300);
		/*
		 * // Mostra num de personatjes creats
		 * 
		 * System.out.println("Personatges creats de " + jugador1.getNomUsuari() +
		 * " son: " + pers1.numPersonatges);
		 * 
		 * // mostrar info d'un personatje System.out.println("Infomacio personatge");
		 * System.out.printf( "Nom Personatge: " + pers1.getNomPersonatge() +
		 * " ,jugador: " + jugador1.getNomUsuari() + " ,vida: " + pers1.getVida() +
		 * " ,puntuacio: " + pers1.getPuntuacio() + " ,nivell: " + pers1.getNivell());
		 * 
		 * // mostrar info propietari System.out.println("");
		 * System.out.println("Infomacio propietari"); System.out.printf("Nom: " +
		 * jugador1.getNomUsuari() + " ,jdata Neixement: " + jugador1.getDataNaixement()
		 * + " ,idioma preferit: " + jugador1.getIdiomPreferit() + " ,contrasenya: " +
		 * jugador1.getPasword());
		 */

		System.out.println("COMEÇA EL LLOC!");
		System.out.println(
				"El guerrer " + pers1.getNomPersonatge() + " ataca a " + pers1.ataca(true, pers2, 20) + ",el mag.");

		System.out.println(
				pers2.nomPersonatge + " ha rebut " + pers2.repDany(true, 30, 60) + " punts de dany. Vida restant: ");

		System.out.println(
				"El mag " + pers2.getNomPersonatge() + " ataca a " + pers2.ataca(true, pers1, 20) + ",el mag.");

		System.out.println(
				pers1.nomPersonatge + " ha rebut " + pers1.repDany(true, 20, 60) + " punts de dany. Vida restant: ");
	}

}
