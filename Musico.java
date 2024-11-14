/*2. Crea una classe Music que incloga 2 atributs (nom del músic i instrument, tots dos de tipus String). La classe inclourà també, almenys:

 - un constructor que inicialitze el músic amb un nom i un instrument inicial.
 - constructor de còpia.
 - un mètode mostraMusic (o toString()) que mostre les dades del músic per pantalla.
 - els corresponents mètodes "setters" i "getters" (setNom,setInst,getNom,getInstr) que canvien l'instrument o el nom (mètodes setXxx), o retornen aqueixos mateixos valors (mètodes getXxx).

	Realitza un programa que, utilitzant la classe Musica, definisca almenys dos objectes d'aquest tipus, mostre les seues dades, modifique alguna dada de cadascun d'ells i acabe mostrant els seus noms, instruments i el total de músics. */



public class Musico
{
    private String nombre;
    private String instrumento;
    public Musico()
    {   
    }
    public Musico(String nombre, String instrumento)
    {
        this.nombre = nombre;
        this.instrumento = instrumento;
    }
    public Musico(Musico other) {
        this.nombre = other.nombre;
        this.instrumento = other.instrumento;
    }
    public String toString() {
        return  this.nombre + " , y usa el siguiente  instrumento: " + this.instrumento;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getInstrumento()
    {
        return instrumento;
    }
   
    public void setInstrumento(String instrumernto)
    {
        this.instrumento = instrumernto;
    }
    

    public static void main(String args[]) 
    {
        Musico music1 = new Musico("Romeo Santos","Guitarra");
        Musico music2 = new Musico("Jessi Uribe" ,"Acordeon");
        Musico music3 = new Musico(music1);
        Musico music4 = new Musico(music2);
        System.out.print("El primer musico es ");
        System.out.println(music1);   
        System.out.print("El segundo musico es ");
        System.out.println(music2); 

        music1.setNombre("Damiano David");
        music1.setInstrumento("Tambor");
        music2.setNombre("Luis Alfonso");
        music2.setInstrumento("Tuba");
        System.out.println("Los artistas tras los cambios son: ");
        System.out.println(music1);   
        System.out.println(music2); 
        System.out.println("Los artistas en total han sido: ");
        System.out.println(music1);   
        System.out.println(music2); 
        System.out.println(music3);   
        System.out.println(music4); 

         
        
    }

}
