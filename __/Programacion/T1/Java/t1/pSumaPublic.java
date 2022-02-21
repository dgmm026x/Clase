package t1;
import java.util.Scanner;
public class pSumaPublic
{
	public static int suma(int A, int B)
	{
		int resul=0;
		resul=A+B;
		
		return resul;
	}
	public static void main(String[] args)
	{
		Scanner tecl=new Scanner(System.in);
		
		System.out.println("Introducir el primer valor: ");
		double A=tecl.nextDouble();
		
		System.out.println("Introducir el segundo valor: ");
		double B=tecl.nextDouble();

		System.out.println("Suma: "+ suma((int)A, (int)B ));		
	}
}