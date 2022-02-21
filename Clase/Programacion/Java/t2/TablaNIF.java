package t2;
import java.util.Scanner;
import java.util.*;
public class TablaNIF 
{
	public static String nif(int dni)
	{
		String[] nif={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		int dnil=(dni/23)*23;
		return nif[dnil];
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Introduce el DNI:");
		//int dni=sc.nextInt();
		int dni=sc.nextInt();
		System.out.println("Letra: "+nif(dni));
	}
}
