package t2;
import java.util.Arrays;
import java.util.Scanner;
public class Matrices
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("dimensiones de matrices:");
		System.out.print("X: ");
		int ordenada=sc.nextInt();
		System.out.print("Y: ");
		int abcisa=sc.nextInt();
		System.out.println("");
		int[][] matriz=new int[abcisa][ordenada];
		int bucle;
		if(ordenada>=abcisa)
			bucle=ordenada;
		
		else
			bucle=abcisa;
		
		for(int i=0;i<bucle;i++)
		{
			System.out.println(Arrays.toString(matriz[i]));
		}
	}
}
