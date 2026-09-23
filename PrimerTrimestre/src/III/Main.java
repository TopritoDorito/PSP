package III;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("1. Ingresar dinero");
			System.out.println("2. Retirar dinero");
			System.out.println("3. Añadir titular");
			System.out.println("4. Borrar titular");
			System.out.println("0. Salir del programa");
			System.out.println("Que quieres hacer?");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1: {

				break;
			}
			case 2: {

				break;
			}
			case 3: {

				break;
			}
			case 4: {

				break;
			}
			case 0: {

				break;
			}
			default:
				System.out.println("Introduzca una opcion valida");
			}

		} while (opcion != 0);

		sc.close();
	}

}
