package t1;
import java.util.Scanner;
public class pLioso
{
	public static int expo(int A)
	{
		int resul;
		resul=A*A;
		return resul;
	}
	public static void main(String[] args)
	{
		Scanner tecl=new Scanner(System.in);
		int par;
		par = 0;
		
		System.out.println("Introducir primer valor: ");
		int A=tecl.nextInt();
		System.out.println("Introducir segundo valor: ");
		int B=tecl.nextInt();
		
		for (int i=A; i<=B; i++)
		{
			if (i%7==0)
			{
				System.out.println(A+"*"+" ("+expo(A)+")^");
			}
			else
			{
				System.out.println(A);
			}
			if (i%2==0)
			{
				par=par+A;
				System.out.println("Total par: "+par);

			}
			A++;
		}
	}
}