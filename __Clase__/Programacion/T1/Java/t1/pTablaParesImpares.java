package t1;
import java.util.*;
public class pTablaParesImpares
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Introduce longitud de la tabla:");
		int cant=sc.nextInt();
		System.out.println("");
		System.out.println("");
		int[] valores=new int[cant];
		for (int i=0; i<valores.length; i++)
		{
			System.out.println("Inroduce el valor de la celda "+(i+1)+"/"+cant+":");
			valores[i]=sc.nextInt();
		}
		
		
		System.out.println("");
		System.out.println("");
		int[] pares1=new int[cant];
		int longp=0;
		int[] impares1=new int[cant];
		int longi=0;
		
		
		for (int i=0; i<valores.length; i++)
		{
			if(valores[i]%2==0)
			{
				pares1[longp]=valores[i];
				longp++;
			}
			else
			{
				impares1[longi]=valores[i];
				longi++;
			}
		}
		int[] pares2=new int[longp];
		int[] impares2=new int[longi];
		pares2=Arrays.copyOf(pares1, longp);
		impares2=Arrays.copyOf(impares1, longi);
		Arrays.sort(pares2);
		Arrays.sort(impares2);
		System.out.println("Su tabla: "+Arrays.toString(valores));
		Arrays.sort(valores);
		System.out.println("Su tabla, ordenada: "+Arrays.toString(valores));
		System.out.println("");
		System.out.println("Valores pares: "+Arrays.toString(pares2));
		System.out.println("Valores impares: "+Arrays.toString(impares2));
	}
}
