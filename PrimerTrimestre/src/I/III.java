package I;

import java.util.*;

public class III {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 5 numeros para ordenarlos de forma creciente (no repetidos y positivos)");

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el número " + (i + 1) + ":");
			numeros[i] = sc.nextInt();
		}

		Arrays.sort(numeros);
		
		System.out.println("Numeros ordenados");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}


		sc.close();
	}

}
