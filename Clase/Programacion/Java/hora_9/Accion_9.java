package hora_9;

import java.util.Scanner;

public class Accion_9 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Hora tiempo=new Hora(32,12,2);
		
		
		int mostrar;
		for (int i=0;i<2;i++)
		{
			switch(i)
			{
			case 0:
				mostrar=tiempo.getHORAS();
				break;
			case 1:
				mostrar=tiempo.getMINUTOS();
				break;
			case 2:
				mostrar=tiempo.getSEGUNDOS();
				break;
			}
		}
		
		
		System.out.println();
		System.out.println();
	}
}