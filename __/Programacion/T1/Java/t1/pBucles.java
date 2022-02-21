package t1;
import java.util.Scanner;
public class pBucles
{
	public static void main(String[] args)
	{
		Scanner tecl;
		tecl=new Scanner(System.in);
		
		int valor;
		System.out.println("Introducir valor: ");
		valor=tecl.nextInt();
		
		while (valor>-1)
		{
			switch (valor)
			{
				case 0: System.out.println(valor+": Suspenso."); break;
				case 1: System.out.println(valor+": Suspenso."); break;
				case 2: System.out.println(valor+": Suspenso."); break;
				case 3: System.out.println(valor+": Suspenso."); break;
				case 4: System.out.println(valor+": Suspenso."); break;
				case 5: System.out.println(valor+": Suficiente."); break;
				case 6: System.out.println(valor+": Bien."); break;
				case 7: System.out.println(valor+": Notable."); break;
				case 8: System.out.println(valor+": Notable+."); break;
				case 9: System.out.println(valor+": Sobresaliente."); break;
				case 10: System.out.println(valor+": Sobresaliente+."); break;
			}
			
			System.out.println("Introducir valor: ");
			valor=tecl.nextInt();
			tecl.close();
		}
	}
}