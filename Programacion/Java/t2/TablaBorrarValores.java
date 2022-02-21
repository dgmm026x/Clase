package t2;
import java.util.*;
import java.util.Random;
public class TablaBorrarValores
{
	public static void main(String[] args)
	{
		Random rd=new Random();
		int valor=5;
		int[] tabla=new int[9];
		for (int i=0; i<tabla.length; i++)
			tabla[i]=rd.nextInt(9);
		System.out.println(Arrays.toString(tabla));
		System.out.println("");
	
		System.out.println(Arrays.toString(sinM(tabla,valor)));
	}
	public static int[] sinM(int tabla[], int valor)
	{
		int copia[]=Arrays.copyOf(tabla, tabla.length);
		for (int i=0; i<copia.length; i++)
		{
			if(copia[i]>valor)
				copia[i]=0;
		}
		return copia;
	}
}
