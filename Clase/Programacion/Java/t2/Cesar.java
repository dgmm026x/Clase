package t2;
import java.util.Scanner;
public class Cesar
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		int valor=65;
		char[] ascii=new char[26];
		
		for (int i1=0; i1<26; i1++)
		{
			ascii[i1]=(char)valor;
			valor++;
		}
		
		System.out.println("");
		System.out.println("Palabra clave: ");
		String palabra=sc.nextLine();
		System.out.println("");
		
		//System.out.println("Desplazamiento de cifrado césar: ");
		//int despl=sc.nextInt();
		int despl=1;
		//System.out.println("");
		sc.close();
		
		String cesar="";
		
		int letra;
		int longtd=palabra.length();
		
		for (int i2=0; i2<longtd; i2++)
		{
			letra=palabra.charAt(i2);
			
			//cesar=cesar+ascii[];
		}
		System.out.println("Conversión: "+cesar);
		System.out.println("");
	}
}