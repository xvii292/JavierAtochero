package funcionalidades;

import java.util.Scanner;

public class TratamientoCadenas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra:");
		String p1 = sc.next();
		System.out.println("Introduce otra palabra:");
		String p2 = sc.next();
		
		System.out.println(p1 + p2);
		
		System.out.println("Introduce otro String:");
		String p3 = sc.next();
		int cont = 0 ;
		char vocal = 'a';
		
		for (int i = 0; i<p3.length(); i++ ) {
			if (p3.toLowerCase().charAt(i) == vocal) {
				cont = cont + 1;
			}
		}
		if (cont == 1) {
			System.out.println("La letra a aparece: " + cont + " vez.");
		}else {
		System.out.println("La letra a aparece: " + cont + " veces.");
		}
	}
}
