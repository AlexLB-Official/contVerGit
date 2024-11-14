import java.util.Scanner;
/*1. Crear una classe Rellotge (hora,minuts,segons) que permeta almenys:

 - crear rellotges amb hora inicial les 12 del migdia
 - crear rellotges amb hora inicial a triar
 - canviar només l'hora, només els minuts o només els segons (setters)
 - obtindre només el valor d'hora, o de minuts o de segons (getters)
 - obtindre els segons transcorreguts des de les 12 de la mitjanit()
 - afegir una quantitat de temps expressada en segons (vigila que els minuts o segons no excedisquen de 59, ni les hores de 23).
 	Exemple:
 	si el rellotge marca les 10.35:24 i se li afigen 1810 segons (mitja hora i 10 segons) quedarà en 11.05:34
 - ... (altres operacions que se t'ocórreguen útils)
 
 Crea un programa que instàncie rellotges posant a prova tota la classe anterior. */
 class Reloj
 {
	//Atributos
	private int hora;
	private int segundos;
    private int minuto;

	public Reloj (){ //CONSTRUCTOR POR DEFECTO
		hora = 12;
		minuto = 00;
		segundos = 00;
	}
	public Reloj (int hora, int minuto, int segundos) {//Contrusctor general
		this.hora = hora %24;
		this.minuto = minuto %60;
		this.segundos = segundos % 60;
	}
	public Reloj (Reloj r){//Constructor de copia
		this.hora = r.hora;
		this.minuto = r.minuto;
		this.segundos = r.segundos;
	}
	//SETTERS
	public void setHora (int hora){
		this.hora = hora %24;
	}
	public void setMinuto (int minuto){
		this.minuto = minuto %60;
	}
	public void setSegundos (int segundos){
		this.segundos = segundos %24;
	}
	//GETTERS
	public int getHora (){
		return hora %24;
	}
	public int getMinuto () {
		return minuto %60;
	}
	public int getSegundos (){
		return segundos % 60;
	}
	//FUNCION toString
	public String toString (){
		return "La hora del reloj es:" + hora + ":"+ minuto+ ":"+ segundos;
	}
	//Funcion sacar segundos
	public int sacarSegundos (){
		return 3600 * hora + 60 * minuto + segundos;
	}
	//Funcion añadir segundos
	public void añadirSegundos (int añadirsecs){
		int totalsecs = this.sacarSegundos()+ añadirsecs;
		totalsecs = totalsecs % 86400;

		this.hora = totalsecs / 3600;
		totalsecs = totalsecs % 3600;
		this.minuto = totalsecs / 60;
		this.segundos = totalsecs % 60;
	}
	
 }
 public class ex1
 {
	static Scanner myScanner = new Scanner(System.in);
	public static void main (String args [])
	{
        //Creamos los objetos
		Reloj reloj1 = new Reloj();
		Reloj reloj2 = new Reloj(15, 00,00);
        //Realizamos el menu
		int opcion=1;
		System.out.println("Que quieres hacer? \n 1-Crear un reloj que marque las 12:00 \n 2-Crear un reloj con la hora a elegir \n 3- Sacar los segundos totales de un reloj \n 4- Cambiar la hora de un reloj \n 5- Añadir segundos al reloj inicial \n 6- Recibir las horas del reloj inicial\n 7- Salir del programa");
		while ((opcion >= 1) || (opcion <=7)){
		
			opcion = myScanner.nextInt();
            //Realizo el menu del reloj 
			switch (opcion) {
				case 1:
					System.out.println(reloj1);
					break;
				case 2:
					int h,m,s;
					System.out.println("Introduce la hora en formate hh/mm/ss");//Pido al usuario que introduzca una hora
					h = myScanner.nextInt();
					m = myScanner.nextInt();
					s = myScanner.nextInt();
					Reloj reloj3=new Reloj(h,m,s);
					System.out.println(reloj3);
					break;
				case 3:
					int subopcion;
					System.out.println("¿De que reloj quieres sacar los segundos? \n Del 1 o del 2?");
					subopcion = myScanner.nextInt();
						if (subopcion == 1)
					System.out.println(reloj1.sacarSegundos());
						if (subopcion == 2)
						System.out.println(reloj2.sacarSegundos());
						if ((subopcion != 1) && (subopcion != 2))
						System.out.println("Elección errónea");
					break;
				case 4:
					int subopcion2;
					System.out.println("¿A que reloj le quieres cambiar la cantidad de horas? \n Elegir 1 o 2");
					subopcion2 = myScanner.nextInt();
					if (subopcion2 == 1){
						reloj1.setHora(8);
						System.out.println(reloj1);
					}
					if (subopcion2 == 2){
						reloj2.setHora(25);
						System.out.println(reloj2);
					}
					break;
				case 5:
					int secs;
					System.out.println("¿Cuantos segundos quieres añadirle?");
					secs = myScanner.nextInt();
					reloj1.añadirSegundos(secs);
					System.out.println(reloj1);
					break;
				case 6:
					System.out.println(reloj1.getHora());
					break;
				case 7:
					System.out.println("Salida del programa");
					System.exit(0);

					
			}
		}
	}
 }