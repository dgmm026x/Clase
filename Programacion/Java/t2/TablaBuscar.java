package t2;
import java.util.Random;
import java.util.Scanner;

public class TablaBuscar
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		
		int[] buscar=new int[10];
		for (int i=0; i<buscar.length; i++)
		{
			buscar[i]=rd.nextInt(10);
		}
		
		
	}
}
