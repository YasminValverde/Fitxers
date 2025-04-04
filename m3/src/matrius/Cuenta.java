package matrius;

public class Cuenta {
	private static double interesAnual = 1.5; // Porcentaje de interés anual
	private static int totalCuentas = 0; // Total de cuentas creadas
	private String dni_cliente;
	private String nombre_cliente;
	private String num_cuenta;
	private double saldo;
	private double descobert = -50;

	// Constructor sin saldo
	/*
	 * public Cliente(String num_cuenta, String dni_cliente, String nombre_cliente)
	 * { this.num_cuenta = num_cuenta; if ((this.validarDNI()==false)) {
	 * System.out.println("DNI incorrecto"); }else { this.dni_cliente = dni_cliente;
	 * this.nombre_cliente = nombre_cliente; this.saldo = 0; } }
	 */

	// Constructor sin el nombre y sin saldo
	public Cuenta(String num_cuenta, String dni_cliente) {
		this.num_cuenta = num_cuenta;
		this.dni_cliente = dni_cliente;
		this.saldo = 0;
		totalCuentas++;
	}

	// Constructor con todo menos descobert
	public Cuenta(String num_cuenta, String dni_cliente, String nombre_cliente, double saldo) {
		this(num_cuenta, dni_cliente);
		this.nombre_cliente = nombre_cliente;
		this.saldo = saldo;
	}

//Constructor con todo
	public Cuenta(String num_cuenta, String dni_cliente, String nombre_cliente, double saldo, double descobert) {
		this(num_cuenta, dni_cliente, nombre_cliente, saldo);
		this.descobert = descobert;
	}

	// Getters y Setters
	public String getDni_cliente() {
		return dni_cliente;

	}

	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;

	}

	public double getDescobert() {
		return descobert;
	}

	public void setDescobert(double descobert) {
		this.descobert = descobert;
	}

	public static int getTotalCuentas() {
		return totalCuentas;
	}

	public static void setTotalCuentas(int totalCuentas) {
		Cuenta.totalCuentas = totalCuentas;
	}

	/**
	 * Este metodo solo te dice la entidad de la cuenta de banco
	 * 
	 * @param IBAN
	 * @author Yasmin Valverde
	 * 
	 */

	public String getEntidad() {
		return this.num_cuenta.substring(4, 8);
	}

	/**
	 * Este metodo solo te dice la sucursal de la cuenta de banco.
	 * 
	 * @param IBAN
	 * @author Yasmin Valverde
	 */
	public String getSucursal() {
		return this.num_cuenta.substring(8, 12);
	}

	/**
	 * Este metodo solo te dice el numero de cuenta.
	 * 
	 * @param IBAN
	 * @author Yasmin Valverde
	 */

	public String getCompte() {
		return this.num_cuenta.substring(8);
	}

	/*
	 * // Método para obtener el nombre del banco a partir del código de entidad
	 * public String getBanco() { String[] codigos = { "0182", "0081", "0049",
	 * "0128", "2100", "0019", "1465" }; String[] bancos = { "BBVA",
	 * "Banc de Sabadell", "Banco Santander", "Bankinter", "Caixabank",
	 * "Deutsche Bank", "ING Bank NV" };
	 * 
	 * String codigoEntidad = getSucursal(); for (int i = 0; i < codigos.length;
	 * i++) { if (codigos[i].equals(codigoEntidad)) { return bancos[i]; } } return
	 * "Es desconegut"; }
	 */

	// matriz bancos
	/**
	 * Este metodo te dice el banco al que pertenece el numero de cuenta
	 * 
	 * @author Yasmin Valverde
	 * @return El banco al que corresponde
	 */
	public String getBanco() {
		// String codban = iban.substring(4, 8);
		String codBan = this.num_cuenta.substring(4, 8);

		String[][] bancs = new String[7][2];
		bancs[0][0] = "BBVA";
		bancs[0][1] = "0182";
		bancs[1][0] = "Banc Sabadell";
		bancs[1][1] = "0081";
		bancs[2][0] = "Banco Santander";
		bancs[2][1] = "0049";
		bancs[3][0] = "Bankinter";
		bancs[3][1] = "0128";

		for (int i = 0; i < bancs.length; i++) {
			if (bancs[i][1].equals(codBan)) {
				return bancs[i][0];

			}
		}
		return "Banco Desconocido";

	}

}
