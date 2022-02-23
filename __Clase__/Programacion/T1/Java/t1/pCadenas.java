package t1;
import java.util.Scanner;
public class pCadenas
{
	public static void menu()
	{
		System.out.println("----------------------------");
		System.out.println("");
		System.out.println("Cadenas:");
		System.out.println("");
		System.out.println("  Seleccionar opciones:");
		System.out.println("");
		System.out.println("	Inversa        (1)");
		System.out.println("	Palíndromo     (2)");
		System.out.println("	Intercalar     (3)");
		System.out.println("	Contar vocales (4)");
		System.out.println("	Contar letras  (5)");
		System.out.println("");
		System.out.println("	Salir          (6)");
		System.out.println("");
		System.out.println("----------------------------");
	}
	
	
	public static String inver(String cadena)
	{
		return cadena;
	}
	public static String palin(String cadena)
	{
		return cadena;
	}
	public static String inter(String cadena)
	{
		return cadena;
	}
	public static String vocal(String cadena)
	{
		return cadena;
	}
	public static String letra(String cadena)
	{
		return cadena;
	}
	
	
	public static void main(String[] args)
	{
		Scanner tecl=new Scanner(System.in);
		menu();
		int opcion=tecl.nextInt();
		do
		{
			
		}
		while (opcion!=6);
	}
}