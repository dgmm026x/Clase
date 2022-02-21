package t1;
import java.util.Scanner;
public class pCalculadora
{
	public static void menu()
	{
		System.out.println("----------------------------");
		System.out.println("");
		System.out.println("Calculadora:");
		System.out.println("");
		System.out.println("  Seleccionar opciones:");
		System.out.println("");
		System.out.println("	Suma           (1)");
		System.out.println("	Resta          (2)");
		System.out.println("	Multiplicación (3)");
		System.out.println("	División       (4)");
		System.out.println("");
		System.out.println("	Salir          (5)");
		System.out.println("");
		System.out.println("----------------------------");
	}
	
	
	
	public static double suma(double valorA, double valorB){return valorA+valorB;}
	public static double resta(double valorA, double valorB){return valorA-valorB;}
	public static double mult(double valorA, double valorB){return valorA*valorB;}
	public static double div(double valorA, double valorB){return valorA/valorB;}
	
	
	
	public static void main(String[] args)
	{
		Scanner tecl=new Scanner(System.in);
		int opcion;
		do
		{
			menu();
			opcion=tecl.nextInt();
			double valorA;
			double valorB;
			if (opcion==4)
			{
				System.out.println("Operación seleccionada: División.");
				System.out.println("");
				System.out.println("");
				
				
				System.out.println("Introducir el valor deseado a dividir:");
				valorA=tecl.nextDouble();
				System.out.println("");

				System.out.println("Introducir el valor divisor:");
				valorB=tecl.nextDouble();
			}
			
			
			else
			{
				if (opcion==1){System.out.println("Operación seleccionada: Suma.");}
				if (opcion==2){System.out.println("Operación seleccionada: División.");}
				if (opcion==3){System.out.println("Operación seleccionada: Multiplicación.");}
				System.out.println("");
				System.out.println("");
				
				System.out.println("Introducir el primer valor:");
				valorA=tecl.nextDouble();
				System.out.println("");
				
				System.out.println("Introducir el segundo valor:");
				valorB=tecl.nextDouble();
			}
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("Resultado:");			
			if (opcion==1){System.out.println("   "+valorA+"+"+valorB+"="+suma(valorA, valorB));}
			if (opcion==2){System.out.println("   "+valorA+"-"+valorB+"="+resta(valorA, valorB));}
			if (opcion==3){System.out.println("   "+valorA+"*"+valorB+"="+mult(valorA, valorB));}
			if (opcion==4){System.out.println("   "+valorA+"/"+valorB+"="+div(valorA, valorB));}
			
			
			System.out.println("");			
			System.out.println("----------------------------");
			System.out.println("");			
			System.out.println("");			
			System.out.println("");
			System.out.println("");			
			System.out.println("");
		}
		while (opcion !=5);
		
		System.out.println("");
		System.out.println("	Fin.");
		System.out.println("");
		System.out.println("----------------------------");
		tecl.close();
	}
}
