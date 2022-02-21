//··········································································//
//··········································································//


package peaje_11;

import java.util.Scanner;

class Accion_11
{
	//······································································//
	
	public static void Menu()
	{
		System.out.println(" Seleccionar opcion: ");
		System.out.println("   Coche  (1)");
		System.out.println("   Moto   (2)");
		System.out.println("   TestVehiculo (3)");
		System.out.println();
		System.out.println("    Consulta (8)");
		System.out.println("    SALIR    (0)");
	}
	
	//······································································//
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Peaje peaje=new Peaje("CSM001","dgtCTM", 0, 0, 0, 0);
		
		
		boolean bucle=true;
		while(bucle==true)
		{
			System.out.println();
			System.out.println("·······························");
			System.out.println("·······························");
			System.out.println();
			Menu();
			System.out.println();
			System.out.println("· · · · · · · · · · · · · · · ·");
			System.out.println();
			System.out.print(" Seleccionar tipo: ");int opcion=sc.nextInt();
			System.out.println();
			while(opcion!=1 && opcion!=2 && opcion!=3 && opcion!=8 && opcion!=0)
			{
				System.out.println("   Valor incorrecto.");
				System.out.print("   Seleccionar tipo: ");opcion=sc.nextInt();
				System.out.println();
			}
			System.out.println("· · · · · · · · · · · · · · · ·");
			System.out.println();
			
			
			if(opcion!=8 && opcion!=0)
			{
				System.out.print(" · Matricula: ");String id=sc.nextLine();
				/*System.out.print(" · Color    : ");String color=sc.nextLine();
				System.out.print(" · Marca    : ");String marca=sc.nextLine();
				System.out.print(" · Modelo   : ");String modelo=sc.nextLine();*/
				
				
				switch(opcion)
				{
				case 1:
					peaje.setPaseCoche(1);
					peaje.setIngresos(30);
					break;
				case 2:
					peaje.setPaseMoto(1);
					peaje.setIngresos(10);
					break;
				case 3:
					System.out.print(" · Clr_remol: ");String remolque=sc.nextLine();
					System.out.print(" · Nº_ejes  : ");int eje=sc.nextInt();
					peaje.setPaseCamion(1);
					peaje.setIngresos(50*eje);
					break;
				}
			}
			if(opcion==8)
			{
				System.out.println(" COCHES ACEPTADOS   : "+peaje.getPaseCoche());
				System.out.println(" MOTOS ACEPTADAS    : "+peaje.getPaseMoto());
				System.out.println(" CAMIONES ACEPTADOS : "+peaje.getPaseCamion());
				System.out.println(" Ingresos: "+peaje.getIngresos()+"€");
			}
			if(opcion==0)
				break;
			
			
			System.out.println();
			System.out.println("· · · · · · · · · · · · · · · ·");
			System.out.println();
		}
		System.out.println();
		System.out.println("·······························");
		System.out.println("            Fin.");
		System.out.println("·······························");
		sc.close();
	}
	
	//······································································//
}


//··········································································//
//··········································································//