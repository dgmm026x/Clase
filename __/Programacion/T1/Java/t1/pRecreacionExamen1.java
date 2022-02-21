package t1;
import java.util.Scanner;
import java.util.Random;
public class pRecreacionExamen1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("---10---");
		System.out.println("Indique cantidad de filas:");
		//int fila=sc.nextInt();
		int fila=5;
		for (int i=1; i<=fila; i++)
		{
			for (int ii=1; ii<=fila-1; ii++)
			{
				System.out.print(" ");
			}
			for (int iii=1; iii<=(iii*2); iii++)
			{
				System.out.print("+");
			}
			System.out.println();
		}
		
		
		
		System.out.println("");
		System.out.println("");
		sc.close();
	}
}