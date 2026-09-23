package III;

import java.util.Scanner;

public class CuentaBancaria {

	private double saldoCuenta;
	private int numeroCuenta;
	private Titular[] titulares = new Titular[3];

	public double getSaldoCuenta() {
		return saldoCuenta;
	}

	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Titular[] getTitulares() {
		return titulares;
	}

	public void setTitulares(Titular[] titulares) {
		this.titulares = titulares;
	}

	public CuentaBancaria(double saldoCuenta, int numeroCuenta, Titular[] titulares) {
		super();
		this.saldoCuenta = saldoCuenta;
		this.numeroCuenta = numeroCuenta;
		this.titulares = titulares;
	}

	public static void ingresarDinero(double cantidad, double saldoCuenta) {
		saldoCuenta += cantidad;
	}

	public static void retirarDinero(double cantidad, double saldoCuenta) {
		if (cantidad - saldoCuenta < 0) {
			System.out.println("No se puede confirmar esta operacion");
		} else {
			saldoCuenta -= cantidad;
		}
	}

	public void aniadirTitular(Scanner scanner) {
		int numTitulares = -1;
		for (int i = 0; i < titulares.length; i++) {
			if (titulares[i] == null) {
				numTitulares = i;
				break;
			}
		}

		String dniString, nombreTitularString, apellidosTitularString;
		int telefonoTitular;
		System.out.println("Introduce el DNI del titular");
		dniString = scanner.nextLine();
		System.out.println("Introduce el nombre del titular");
		nombreTitularString = scanner.nextLine();
		System.out.println("Introduce los apellidos del titular");
		apellidosTitularString = scanner.nextLine();
		System.out.println("Introduce el telefono del titular");
		telefonoTitular = scanner.nextInt();
		scanner.nextLine();

		Titular nuevoTitular = new Titular(dniString, nombreTitularString, apellidosTitularString, telefonoTitular);
		titulares[numTitulares] = nuevoTitular;

	}

}
