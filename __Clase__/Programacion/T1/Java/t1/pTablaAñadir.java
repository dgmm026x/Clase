package t1;
import java.util.Scanner;
import java.util.Random;
public class pTablaAñadir
{
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int max=0,min=1000,aLong=10;
		int[] a=new int[aLong];
		
		for (int i=0; i<a.length; i++)
		{
			a[i]=rd.nextInt(1000);
			System.out.println(a[i]);
			
			
			if(a[i]>max)
				max=a[i];
			
			if(a[i]<min)
				min=a[i];
		}
		System.out.println();
		System.out.println(max);
		System.out.println(min);
	}
}