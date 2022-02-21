//---------------------------------------------


package password_4;


import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class Accion_4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random rdRandom=new Random();
		
		
		Password crearclave=new Password(8);
		boolean bucle=false;
		while(bucle==false)
		{
			int opcion=sc.nextInt();
			switch(opcion)
			{
				case 1:
					
				case 2:
					int longg=sc.nextInt();
					Password clavealeatoria=new Password(longg);
					crearclave.getContrasenna();
			}
			System.out.println(crearclave.getContrasenna());
		}
	}
}



//---------------------------------------------