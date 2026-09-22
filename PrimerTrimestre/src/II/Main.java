package II;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nombre;
		double nota, notasTotales = 0;
		String[] nombres = new String[6];
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < 6; i++) {
				System.out.println("Introduce el nombre del alumno");
				nombre = sc.nextLine();

				System.out.println("Introduce la nota de " + nombre);
				nota = sc.nextDouble();
				sc.nextLine();
				notasTotales += nota;
				 nombres[i] = nombre;
				Alumno alumno = new Alumno(nombre, nota);

				System.out.println(alumno.toString());
			}
			System.out.println("La nota media de los alumnos es de: "+(notasTotales/6));
			System.out.print("El nombre de los alumnos analizados es:");
			for (int i = 0; i < nombres.length; i++) {
				if (i < nombres.length - 1) {
					System.out.print(nombres[i]+", ");
				}else{
					System.out.print(nombres[i]+".");
				}
				
				
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}
}
