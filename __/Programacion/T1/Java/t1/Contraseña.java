package t1;
import java.util.Scanner;
public class Contraseña
{
    public static void main(String[] args)
    {
        Scanner tecl=new Scanner(System.in);
        int clave=3432;
        int inten=3;

        do
        {
            System.out.println("Introducir clave:");
            int contr=tecl.nextInt();
            if(clave==contr)
            {
                System.out.println("Correcto.");
                break;
            }
            else
            {
                System.out.println("Intente de nuevo:");
            }
            inten--;
        }
        while(inten>0);

        if(inten==0)
        {
            System.out.println("Máximo intentos superado.");
        }
    }
}