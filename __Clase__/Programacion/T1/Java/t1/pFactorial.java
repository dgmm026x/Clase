package t1;
import java.util.Scanner;
import java.util.*;

public class pFactorial
{
	public static void main(String[] args)
	{
		Scanner tecl;
		tecl=new Scanner(System.in);
		
		int valor, mult, resul;
		
		System.out.println("-------------------");
		System.out.println("Factoriales: Introducir valor: ");
		System.out.println(" ");
		valor=tecl.nextInt();
		
		mult=0;
		while (mult<=valor)
		{
			resul=valor*mult;
			mult=mult+1;
			System.out.println(resul);
		}
	}
}