/*
22. Algorisme que sol·licita notes introduïdes per teclat acabades amb un nombre negatiu, i imprimeix en pantalla l'aprovat de nota més baixa i el suspens de nota més alta.
*/

import java.util.Scanner; // Importamos la clase scanner

public class solicitaNota { // Creamos la clase publica
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in); // Creamos el objeto de la clase scanner
		
		// Creamos las variables
		double nota, notaBaja, notaAlta,condicion; // Definimos las variables
		// Establecemos los valores a las variables
		notaBaja=0; 
		notaAlta=10;

		// Pedimos al usuario que introduzca las notas y que acaba el programa cuando se introduce un número negativo
		System.out.print("Introduce una nota entre 0 y 10: ");
		nota = myScanner.nextDouble();
		condicion = nota;
		
		// Creamos el bucle while para comprobar las notas
		while (nota >= 0){
			if (nota >= 5){
				if (nota < notaAlta)
					notaAlta = nota;
			} else{
				if (nota > notaBaja)
					notaBaja = nota;
			}

			System.out.print("Introduce otra nota entre 0 y 10: ");
			nota = myScanner.nextDouble();
		}
		myScanner.close();
		if (condicion >= 0)
			System.out.println("La nota de suspenso mas alta a sido "+notaBaja+" y la nota de aprovado mas baja ha sido de "+notaAlta);		
		
	}
}
