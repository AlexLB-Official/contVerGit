
public class tablamult 
{
    public static void main (String args [])
    {
        for (int i =1; i <= 10; i++)
        {
            System.out.println("Tabla de mutliplicar de " + i);
            modTablas(i);
        }
    }

    public static void modTablas(int n){
        for (int i = 1; i <= 10; i++)
            System.out.println(n+" x "+i+" = "+(n*i));
    }
}
