package funcionalidades;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero y te dire si es par o impar");
		
		int num = sc.nextInt();
		
		if ((num % 2) == 0) {
			System.out.println("Su numero es par.");
		}else {
			System.out.println("Su numero es impar.");
		}
		
		System.out.println("Introduce otro numero:");
		
		int num2 = sc.nextInt();
		
		if (num2 > 0) {
			System.out.println("Su numero es positivo.");
		}else if (num2 < 0) {
			System.out.println("Su numero es negativo");
		}else {
			System.out.println("Su numero es 0");
		}

	}

}
