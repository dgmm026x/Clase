package t1;
import java.util.Scanner;
public class pLetra
{
	public static void main(String[] args)
	{
		Scanner tecl=new Scanner(System.in);
		
		System.out.println("Car�cteres:");
		String hola=tecl.nextLine();
		
		System.out.println("Letra:");
		char letra=tecl.next().charAt(0);

		int longtd=hola.length();
		int posic=0;
		int cant=0;

		for (posic = longtd; posic <= longtd; posic++)
		{
			if (hola.charAt(posic)==letra)
			{
				cant++;
			}
		}
		System.out.println("Cantidad de car�cteres "+letra+" es: "+cant);
	}
}