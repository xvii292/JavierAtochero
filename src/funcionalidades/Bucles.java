package funcionalidades;

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		System.out.println("Te mostrare todos los numeros hasta el.");
		int n1 = sc.nextInt();

		for (int i = 1; i <= n1; i++) {
			System.out.println(i);
		}

		System.out.println("Introduce un numero: ");
		System.out.println("Te mostrare todos los numeros pares hasta el.");
		int n2 = sc.nextInt();

		for (int i = 1; i <= n2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

	}

}
