package t1;
import java.util.Scanner;
import java.util.Random;
public class pJuegoSuma
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int bien=0;
		int x=1;
		System.out.println("---------------------------------");
		System.out.println("");
		System.out.println("Juego de suma de valores:");
		System.out.println("");
		System.out.println("   Introducir '1' para continuar.");
		System.out.println("   Introduzca cualquier otra tecla para salir...");
		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - - -");
		int comienzo=sc.nextInt();
		System.out.println("");
		if (comienzo==1)
		{
			System.out.println("---------------------------------");
			System.out.println("");
			System.out.println("Comienze:");
			System.out.println("");
			do
			{
				int A=rd.nextInt(2);
				int B=rd.nextInt(2);
				System.out.println("Suma "+ A +" y "+ B +":");
				int resultado=sc.nextInt();
				
				if (resultado==A+B)
				{
					System.out.println("");
					System.out.println("Correcta.");
					System.out.println("");
					System.out.println("");
					bien++;
				}
				if (resultado!=A+B)
				{
					if (resultado==000)
					{
						System.out.println("");
						System.out.println("SALIR...");
						System.out.println("Número total de aciertos: "+bien);
						x=0;
					}
					else
					{
						System.out.println("");
						System.out.println("¡Ha errado!");
						System.out.println("Número total de aciertos: "+bien);
						x=0;
					}
				}
			}
			while(x==1);
		}
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("");
		System.out.println("Fin del juego.");
		System.out.println("Fin del programa.");
		System.out.println("");
		System.out.println("---------------------------------");
	}
}
