package t1;

import java.util.Scanner;


public class Edad
{
	public static void main(String[] args)
	{
		int edad;
		Scanner teclado;
		teclado=new Scanner(System.in);
		System.out.println ("introducir valor y presionar 'intro':");
		edad=teclado.nextInt();
		System.out.println("El valor es: "+edad);
		teclado.close();
	}
}