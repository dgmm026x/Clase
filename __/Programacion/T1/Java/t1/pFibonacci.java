package t1;
import java.util.Scanner;
public class pFibonacci
{
	public static void main(String[] args)
	{
		Scanner tec;
		tec=new Scanner(System.in);
		int valor, valor0, valor1, valorf;

		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println(" ");
		System.out.println("Numeros de Fibonacci:");
		System.out.println(" ");
		System.out.println("  Introducir valor máximo");
		System.out.println("  para ver todas las unidades");
		System.out.println("  inferiores...:");
		System.out.println(" ");
		System.out.println("- - - - - - - - - - - - - - - -");
		System.out.println(" ");
		valor=tec.nextInt();
		System.out.println(" ");

		valorf=0;
		valor0=0;
		valor1=1;
		while(valorf<=valor)
		{
			System.out.println(valorf);
			valorf=valor0+valor1;
			valor0=valor1;
			valor1=valorf;
		}
		System.out.println(" ");
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
	}
}