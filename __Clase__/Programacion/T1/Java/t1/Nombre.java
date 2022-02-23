package t1;

import java.util.Scanner;

public class Nombre
{
	public static void main(String[] args)
	{
		Scanner tec;
		tec=new Scanner(System.in);
		
		System.out.println ("Hola como te llamas???");
		String nom=tec.nextLine();
		
		System.out.print ("Hola"+nom+"!");
		System.out.print ("Cuántos años tienes???");
		
		 int edad=tec.nextInt();
		System.out.println ("Tu edad es "+edad+"?");
		tec.close();
	}
}
