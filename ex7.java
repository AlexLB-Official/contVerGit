/*
    7. Realitzar un programa que calcule els nombres primers entre 1 i 1000, utilitzant una funció que indique si un número rebut com a paràmetre és o no primer.
*/

// Para saber si un número este solo debe de ser divisible entre si mismo

public class ex7 {
    public static void main(String[] args) {
        // Creamos las variables
        int numMax = 1000, cont = 2;

        // Creamos el bucle

        while (cont < numMax){
            if (esPrimo(cont))
                System.out.println("El número "+cont+" es primo.");
            else
                System.out.println("El número "+cont+" no es primo.");

            cont++;
        }
    }

    public static boolean esPrimo(int cont){
        // Creamos un for
        for (int i = 2; i < cont; i++)
            if ((cont%i)==0)
                return false;
        return true;
    }
}