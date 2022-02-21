package t2;
import java.util.*;
public class TablaAcierto
{
	public static void main(String[] args)
	{
		int[] seis=new int[6];
		
		for (int i=0; i<seis.length;)
		{
			int rrdd=(int)(Math.random()*49)+1;
			
			System.out.println("Valor: "+rrdd+"; "+ Arrays.toString(seis));
			
			boolean encontrado=false;
			
			for (int j=0; j<seis.length; j++)
			{
				if(rrdd==seis[j])
				{
					encontrado=true;
					break;
				}
			}
			if(encontrado==false)
			{
				seis[i]=rrdd;
				i++;
			}
			else
			{
				System.out.println("Repetido: "+rrdd);
			}
			System.out.println("Iteración: "+i+"; valor "+rrdd+"; "+Arrays.toString(seis));
			System.out.println("");
		}
		
		Arrays.sort(seis);
		System.out.println("Tabla final: "+Arrays.toString(seis));
		
		int aleatorios[]= {41,6,13,26,2,38};
		int acierto=0;
		System.out.println("");
		System.out.println("Aciertos: "+acierto);
	}
	public static int comprobacion(int tabla1[], int tabla2[])
	{
		int acierto=0;
		for (int i = 0; i < tabla1.length; i++)
		{
			for (int j = 0; j < tabla2.length; j++)
			{
				if(tabla1[i]==tabla2[j])
					acierto++;
			}
		}
		return acierto;
	}
}
