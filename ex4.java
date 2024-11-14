/*
4. Realitzar un programa que demane un número positiu a l'usuari i done la llista dels factorials dels números des del valor introduït fins al 1, indicant quins dels factorials trobats tenen algun dígit igual a 2.
	S'utilitzarà una funció per al càlcul del factorial de cada número i una altra per a saber si el factorial calculat té o no algun dígit igual a 2.
	Exemple per al 5:

	5: factorial = 120	SI té 2
	4: factorial = 24	SI té 2
	3: factorial = 6	 NO té 2
	2: factorial = 2	SI té 2
	1: factorial = 1	NO té 2
*/

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner mySc = new Scanner(System.in);
		
		// Creamos las variables
		int num;
		long result;
		boolean tieneDos;
		
		System.out.print("Introduce un entero: ");
		num = mySc.nextByte();
		
 		while (num >= 1) {
 			result = factorial(num);
			// Pasamos el valor al metodo fectorial()
			System.out.println("El factorial de " + num + " es igual a " + result);
		
			if (tieneDos)
				System.out.println("# Tiene 2.");
			else
				System.out.println("# No tiene 2.");
			num--;
		}
	}
	
	public static long factorial(int n) {
		if (n > 1)
			return n * factorial(n-1);
		else
			return 1;
	}
}
