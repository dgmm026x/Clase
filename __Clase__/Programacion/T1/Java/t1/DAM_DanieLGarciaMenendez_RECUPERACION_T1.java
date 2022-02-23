package t1;
import java.util.Scanner;
public class DAM_DanieLGarciaMenendez_RECUPERACION_T1
{
	public static void main(String[] args)
	{
		//ACTIVIDAD 1
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("-----ACTIVIDAD 1-----");
		System.out.println("");
		int primero=0;
		for (int i=0; i<=9; i++)
		{
			System.out.print(primero+"  ");
			primero++;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		//ACTIVIDAD 2
		
		System.out.println("-----ACTIVIDAD 2-----");
		System.out.println("");
		int segundo=1;
		for (int i=0; i<20; i++)
			segundo=segundo+2;
		
		for (int i=0; i<20; i++)
		{
			System.out.print(segundo+"  ");
			segundo=segundo-2;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		//ACTIVIDAD 3
		
		Scanner sc=new Scanner(System.in);
		System.out.println("-----ACTIVIDAD 3-----");
		System.out.println("");
		System.out.println("Introduzca 2 valores enteros para sumar:");
		System.out.println("");
		System.out.print("Valor 1: ");
		int entero1=sc.nextInt();
		System.out.print("Valor 2: ");
		int entero2=sc.nextInt();
		System.out.println("");
		System.out.println("La suma es: "+sumar(entero1,entero2));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		//ACTIVIDAD 4
		
		System.out.println("-----ACTIVIDAD 4-----");
		System.out.println("");
		System.out.println("Seleccione cantidad de valores pares a mostrar:");
		int pares=sc.nextInt();
		System.out.println("");
		int par=0;
		for (int i=0; i<pares; i++)
		{
			System.out.print(par+"  ");
			par=par+2;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		//ACTIVIDAD 5
		
		System.out.println("-----ACTIVIDAD 5-----");
		System.out.println("");
		System.out.print("Introduzca su nombre: ");
		String nombre=sc.next();
		System.out.println("");
		System.out.println("Hola "+nombre+".");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		//ACTIVIDAD 6
		
		System.out.println("-----ACTIVIDAD 6-----");
		System.out.println("");
		System.out.println("10 números aleatorios: ");
		System.out.println("");
		for (int i=0; i<=10; i++)
		{
			int aleatorio=(int)(Math.random()*10);
			System.out.print(aleatorio+"  ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		//ACTIVIDAD 7
		
		System.out.println("-----ACTIVIDAD 7-----");
		System.out.println("");
		int bucle=0;
		do
		{
			System.out.println("");
			System.out.println("-----------------");
			System.out.println("---Asignaturas---");
			System.out.println("1. Programación");
			System.out.println("2. Sistemas informáticos");
			System.out.println("3. Lenguaje de marcas");
			System.out.println("4. Bases de datos");
			System.out.println("");
			System.out.println("5. Salir...");
			System.out.println("-----------------");
			System.out.println("");
			System.out.print("Seleccione: ");
			int opcion=sc.nextInt();
			
			String asignatura="";
			if(opcion==1)
				asignatura="Programación";
			if(opcion==2)
				asignatura="Sistemas informáticos";
			if(opcion==3)
				asignatura="Lenguaje de marcas";
			if(opcion==4)
				asignatura="Bases de datos";
			if(opcion==5)
				break;
			
			System.out.println("");
			System.out.println("");
			System.out.println("Menú de "+asignatura+":");
			System.out.println(" Gracias por acceder y no hacer");
			System.out.println("  absolutamente nada, vuelva pronto...");
			System.out.println("  ...para lo mismo...");
			System.out.println("");
			System.out.println("");
		}while(bucle==0);
		
		System.out.println("");
		System.out.println("---Saliendo...---");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("-----FIN DEL PROGRAMA-----");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------------");
	}
	
	
	private static int sumar(int entero1, int entero2) //ACTIVIDAD 3
	{
		return entero1+entero2;
	}
}
