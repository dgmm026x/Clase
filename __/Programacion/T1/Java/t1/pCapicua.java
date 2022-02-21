package t1;
import java.util.Scanner;
public class pCapicua
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		//System.out.println("");
		String valor=sc.nextLine();
		
		int posicion=0;
		int longitud=valor.length();
		int v1, v2, v3, v4, v5, v6, v7, v8, v9, v10;
		
		
		for (posicion=longitud; posicion<=longitud;posicion++)
		{
			System.out.println(posicion);
		}
		if (posicion>10)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("si");
		}
	}
}