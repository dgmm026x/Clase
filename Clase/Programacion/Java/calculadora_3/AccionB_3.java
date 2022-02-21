package calculadora_3;


import java.util.Scanner;


public class AccionB_3
{
	public static void menu(int proceso)
	{
		System.out.println("---------------------------");
		System.out.println();
		System.out.println("Calculadora:");
		System.out.println();
		System.out.println("  Seleccionar opciones:");
		System.out.println();
		System.out.println("	Suma           (1)");
		System.out.println("	Resta          (2)");
		System.out.println("	Multiplicación (3)");
		System.out.println("	División       (4)");
		System.out.println();
		System.out.println("	Salir          (0)");
		System.out.println();
		System.out.println("Cantidad de cálculos realizados: "+proceso);
		System.out.println();
		System.out.println("---------------------------");
	}
	
	
	public static void main(String[] args)
	{
		Calculadora calculadora=new Calculadora();
		Scanner sc=new Scanner(System.in);
		int valor;
		int proceso=0;
		
		
		boolean loop=false;
		while(loop==false)
		{
			menu(proceso);
			System.out.println();
			System.out.print("Introducir opción: ");int opcion=sc.nextInt();
			System.out.println();
			System.out.println("- - - - - - - - - - - - - -");
			System.out.println();
			
			
			if(opcion==1)
				System.out.println("  Sumar...:");
			if(opcion==2)
				System.out.println("  Restar...:");
			if(opcion==3)
				System.out.println("  Multiplicar...:");
			if(opcion==4)
				System.out.println("  Dividir...:");
			if(opcion==0)
				break;
			
			
			System.out.println();
			System.out.print("  Valor 1: ");
			valor=sc.nextInt();
			calculadora.setValorA(valor);
			//double valorA=sc.nextDouble();
			
			
			System.out.print("  Valor 2: ");
			valor=sc.nextInt();
			calculadora.setValorB(valor);
			//double valorB=sc.nextDouble();
			System.out.println();
			System.out.println("- - - - - - - - - - - - - -");
			System.out.println();
			
			
			switch(opcion)
			{
				case 1:
					System.out.print("   Suma: ");
					System.out.println(calculadora.getSuma());
					//System.out.println(calculadora.suma(valorA,valorB));
					proceso++;
					break;
				case 2:
					System.out.print("  Resta: ");
					System.out.println(calculadora.getResta());
					//System.out.println(calculadora.rest(valorA,valorB));
					proceso++;
					break;
				case 3:
					System.out.print("  Mult.: ");
					System.out.println(calculadora.getMult());
					//System.out.println(calculadora.mult(valorA,valorB));
					proceso++;
					break;
				case 4:
					System.out.print("   Div.: ");
					System.out.println(calculadora.getDiv());
					//System.out.print("   Div.: ");System.out.println(calculadora.divi(valorA,valorB));
					proceso++;
					break;
			}
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
		
		System.out.println("---------------------------");
		System.out.println();
		System.out.println("           Fin.");
		System.out.println();
		System.out.println("---------------------------");
	}

}
