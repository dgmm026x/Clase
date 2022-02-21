//----------------------------------------------------------------------------
//----------------------------------------------------------------------------


package actividad41;


import java.util.Scanner;


//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
public class ACCION
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		int opcion;
		int H1,M1,S1;
		int H2,M2,S2;
		
		
		System.out.println(" ---------------------------");
		boolean loop=false;
		while(loop==false)
		{
			//----------------------------------------------------------------------------
			
			System.out.println(" ---------------------------");
			System.out.print("  Introducir HORAS(1) o SALIR(0): ");opcion=sc.nextInt();
			if(opcion==0)
				break;
			System.out.println();
			System.out.println();
			System.out.println("  Introducir datos en HORA1:");
			System.out.print("  H: ");H1=sc.nextInt();
			System.out.print("  M: ");M1=sc.nextInt();
			System.out.print("  S: ");S1=sc.nextInt();
			System.out.println();
			System.out.println("  Introducir datos en HORA2:");
			System.out.print("  H: ");H2=sc.nextInt();
			System.out.print("  M: ");M2=sc.nextInt();
			System.out.print("  S: ");S2=sc.nextInt();
			System.out.println();
			System.out.println(" ---------------------------");
			System.out.println();
			HORA hora1=new HORA(H1,M1,S1);	//HORA1
			HORA hora2=new HORA(H2,M2,S2);	//HORA2
			HORA horaT=new HORA();	//Objeto para comparar horas, suma de HORA1 y HORA2...
			
			
			//MOSTRAR OBJETOS HORA1 Y HORA2
			System.out.println();
			System.out.println("  · Horas:");
			System.out.println("    HORA1:  "+hora1.VERHORA());	//Ver HORA1
			System.out.println("    HORA2:  "+hora2.VERHORA());	//Ver HORA2
			
			
			//COMPROBAR SI OBJETOS SON IDENTICOS
			System.out.println();
			System.out.println("  · ¿Son horas identicas?:");
			System.out.println("    "+horaT.IGUALES(hora1,hora2));
			
			
			//DIFERENCIA HORAS
			System.out.println();
			System.out.println("  · ¿HORA1 es mayor que HORA2?:");
			if(horaT.MAYORQUE(hora1,hora2)==0)
				System.out.println("    Las horas son idénticas...");
			if(horaT.MAYORQUE(hora1,hora2)==1)
				System.out.println("    Si");
			if(horaT.MAYORQUE(hora1,hora2)==2)
				System.out.println("    No");
			
			
			//SUMA DE HORAS
			System.out.println();
			System.out.println("  · Suma de HORA1 y HORA2 (dias incluidos):");
			System.out.println("    "+horaT.SUMA(hora1,hora2));	//Ver suma de HORA1 y HORA2
			
			
			//COPIA DE HORA1 A HORA2
			System.out.println();
			hora2=new HORA(hora1);	//Copia de HORA1 a HORA2
			System.out.println("  · Copia de HORA1 en HORA2:  ");
			System.out.println("    HORA1:  "+hora1.VERHORA());
			System.out.println("    HORA2:  "+hora2.VERHORA());
			System.out.println();
			System.out.println();
			System.out.println(" ---------------------------");
			
			
			//----------------------------------------------------------------------------
		}
		sc.close();
		System.out.println(" ---------------------------");
		System.out.println(" ---------------------------");
		System.out.println("           Fin");
		System.out.println(" ---------------------------");
	}
}


//----------------------------------------------------------------------------
//----------------------------------------------------------------------------