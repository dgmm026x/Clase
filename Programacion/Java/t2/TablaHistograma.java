package t2;

import java.util.Arrays;

public class TablaHistograma
{
	public static void main(String[] args)
	{
		int tabla[]=new int[10];
		for (int i=0; i<tabla.length; i++)
		{
			tabla[i]=i+1;
		}
		
		
		int tabla2[]=new int[10];
		for (int i = 0; i <100; i++)
		{
			int valor=(int)(Math.random()*10)+1;
			tabla2[valor-1]++;
		}
		
		
		System.out.println("");
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(tabla2));
		System.out.println("");
		
		
		for (int i = 0; i<tabla2.length; i++)
		{
			if(i<9)
			{
				if(tabla2[i]<=9)
					System.out.print("(0"+tabla[i]+") 0"+tabla2[i]);
				else
					System.out.print("(0"+tabla[i]+") "+tabla2[i]);
			}
				
			else
			{
				if(tabla2[i]<=9)
					System.out.print("("+tabla[i]+") 0"+tabla2[i]);
				else
					System.out.print("("+tabla[i]+") "+tabla2[i]);
			}
			
			
			for (int j=0;j<tabla2[i]; j++)
			{
				System.out.print("-");
			}
			System.out.println("");
		}
	}
}