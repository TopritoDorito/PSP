package I;

import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique cuantos numeros va a introducir");
		int nums=sc.nextInt();
		
		int[] array = new int[nums];
		int num;
		System.out.println("Introduce los numeros del array");
		for (int i = 0; i < array.length; i++) {
			num=sc.nextInt();
			array[i]=num;
		}
		for (int i = 0; i < array.length; i++) {
		    System.out.println(array[i]);
		}
		
		sc.close();
		
	}

}
