package t2;
import java.util.Scanner;
public class Juego
{
	public static void main(String[] args)
	{
		int intento=5;
		while(intento!=0)
		{
			boolean tirar=false;
			Scanner sc=new Scanner(System.in);
			int pajaro=(int)(Math.random()*10)-1;
			String pajaroX="";
			String tiro="";
			if (pajaro==1)
				pajaroX="-//-";
			System.out.print("//-----");
			System.out.print(tiro);
			System.out.print("       ");
			System.out.print(pajaro);
			
			if(tirar==true)
			{
				tiro="*";
				if(pajaro==1&&tirar==true)
				{
					System.out.println("Mató al pajaro!");
					break;
				}
				else
				{
					intento--;
				}
			}
		}
		if(intento==0)
		{
			System.out.println("Has fallado todos los tiros...");
		}
	}
}
