package t2;
import java.util.*;
import java.util.Scanner;
public class CamaraSecreta2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("");
		System.out.println("Cámara secreta:");
		System.out.println("");
		System.out.println("  Seleccione la longitud");
		System.out.print("   de la combinación (de 1 a 15): ");int longg=sc.nextInt();	//Introduzca la cantidad de cifras para resolver...
		System.out.println("");
		if(longg<1||longg>15)	//Esto saltará si introduce un valor por debajo del mínimo permitido(1), o mayor al valor máximo disponible(15)...
			while(longg<1||longg>15)
			{
				System.out.println("  Porfavor, introduzca un");
				System.out.print("   valor entre 1 y 15: ");longg=sc.nextInt();	//Valor de longitud de combinación...
				System.out.println("");
			}
		System.out.println("");
		System.out.println("  Seleccione cantidad de valores aleatorios");
		System.out.println("");
		System.out.println("  Valor mínimo (Comienza desde");
		System.out.print("   el 0 como mínimo): ");int valormin=sc.nextInt();	//Valor minimo de claves...
		System.out.println("");
		if(valormin<0||valormin>98)	//Esto saltará si introduce un valor por debajo del mínimo permitido(0), o mayor al valor máximo disponible(99-1)...
			while(valormin<0||valormin>98)
			{
				
				System.out.println("  Porfavor, introduzca un");
				System.out.print("   valor a partir de 0: ");valormin=sc.nextInt();	//Valor minimo de claves...
				System.out.println("");
			}
		System.out.println("  Valor máximo");
		System.out.print("   (Máximo hasta el 99): ");int valormax=sc.nextInt();	//Valor máximo de claves...
		System.out.println("");
		if(valormax<=valormin||valormax>99)	//Esto saltará si introduce un valor por debajo del mínimo introducido, o mayor al valor máximo disponible(99)...
			while(valormax<=valormin||valormax>99)
			{
				
				System.out.println("  Porfavor, introduzca un");
				System.out.print("   valor por debajo de 99: ");valormax=sc.nextInt();	//Valor minimo de claves...
				System.out.println("");
			}
		System.out.println("  Seleccione cantidad de");
		System.out.print("   intentos (de 1 al 10): ");int intento=sc.nextInt();	//Introduzca la cantidad intentos...
		System.out.println("");
		if(intento<1||intento>10)	//Esto saltará si introduce una cantidad de intentos no admitida...
			while(intento<1||intento>10)
			{
				
				System.out.println("  Porfavor, introduzca un");
				System.out.print("   valor por solamente entre 1 y 10: ");intento=sc.nextInt();	//Valor minimo de claves...
				System.out.println("");
			}
		
		
		
		int intentomemo=intento;
		String[] tablaEstetica=new String[longg];	//Tabla con mero fin estético en la consola...
		for (int i=0; i<tablaEstetica.length; i++)
			tablaEstetica[i]="-";	//Se rellena cada celda con un "-" para su muestra final...
		
		
		
		System.out.println("---------------------------");
		System.out.println("");
		System.out.println(" "+Arrays.toString(tablaEstetica));	//Tabla estética mostrada...
		System.out.println("");
		System.out.println("---------------------------");
		System.out.println("");
		System.out.println("");
		
		
		
		int[] tabla=new int[longg];	//Tabla donde se crea la combinación...
		for (int i=0; i<tabla.length; i++)
			tabla[i]=(int)(Math.random()*valormax)+valormin;	//Generación de cifras aleatorias...
		
		
		
		for (int i=0; i<tabla.length;)	//Aqui comienza el descifrado de la combinación...
		{
			System.out.println("Introduzca la cifra nº "+(i+1)+": ");
			System.out.println("(Valores entre "+valormin+" y "+valormax+"...)");
			System.out.println("  (Nº de intentos:"+intento+")");
			int cifra=sc.nextInt();
			
			
			
			if(cifra==tabla[i])	//Si acertó...
			{
				if(i<longg-1)	//Si acertó y NO es la última cifra...
				{
					System.out.println("");
					System.out.println("");
					System.out.println("- - - - - - - - - - - - - -");
					System.out.println("");
					System.out.println("");
						String valorResuelto=Integer.toString(cifra);	//Esto introduce la cifra acertada sobre la tabla estética...
						tablaEstetica[i]=valorResuelto;
					System.out.println("  ¡Correcto!, siguiente cifra...");
					System.out.println("    (Progreso de "+i+"/"+longg+")");
					System.out.println("");
					System.out.println("    "+Arrays.toString(tablaEstetica));//...y aquí se muestra la tabla estética...
					System.out.println("");
					System.out.println("");
					System.out.println("- - - - - - - - - - - - - -");
					System.out.println("");
					System.out.println("");

					i++;
					intento=intentomemo;
				}
				
				else	//Si acertó la última cifra...
					i++;//Se finaliza el bucle...
			}
			
			
			
			else	//Si erró...
			{
				--intento;//Pérdida de intento...
				if(cifra<tabla[i]&&intento>0)	//Comenta sobre una cifra mayor a la introducida...
					System.out.println("  (Psss... ! La cifra correcta es mayor...)");
					
				if(cifra>tabla[i]&&intento>0)	//Comenta sobre una cifra menor a la introducida...
					System.out.println("  (Psss... ! La cifra correcta es menor...)");
					
				if(intento==0)//Pérdida de todos los intentos...
					break;//Fin de bucle...
			}
		}
		sc.close();	//Cierre de teclado...
		
		
		
		if(intento==0)	//Fracaso total adjaslodailkgfskjdbd...
		{
			System.out.println("");
			System.out.println("");
			System.out.println("---------------------------");
			System.out.println("");
			System.out.println("");
			System.out.println("Ha perdido todos los intentos...");
			System.out.println("Fin del programa.");
			System.out.println("");
			System.out.println("");
			System.out.println("---------------------------");

		}
		
		
		
		else	//Éxito :3
		{
			System.out.println("");
			System.out.println("");
			System.out.println("---------------------------");
			System.out.println("");
			System.out.println("");
			System.out.println("    "+Arrays.toString(tabla));	//Muestra tabla completada...
			System.out.println("");
			System.out.println(" ¡Ha descrifrado la conbinación!");
			System.out.println("Fin del programa.");
			System.out.println("");
			System.out.println("");
			System.out.println("---------------------------");

		}
	}
}