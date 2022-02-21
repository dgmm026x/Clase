package cuentaCorriente_2;
import java.util.Scanner;


public class Accion_2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean a=false;
		
		
		CuentaCorriente Cuenta1=new CuentaCorriente("Titularrrrrrrrrr","53521469d");
		CuentaCorriente Cuenta2=new CuentaCorriente("rrrrrrrrr","53922343d");
		
		CuentaCorriente Cuenta3=new CuentaCorriente(Cuenta1);
		
		
		while(a==false)
		{
			System.out.println("-------------------------");
			System.out.println("");
			System.out.println("");
			System.out.println("Consultar(1) Extraer(2) Ingresar(3)");
			System.out.println("");
			System.out.println("(SALIR = 0)");
			System.out.println("");
			int opcion=sc.nextInt();
			System.out.println("-------------------------");
			System.out.println("");
			System.out.println("");
			
			
			if(opcion==1)
			{
				System.out.println("Nombre: "+Cuenta1.getTitular());
				System.out.println("ID: "+Cuenta1.getID());
				System.out.println("Fondo: "+Cuenta1.getFondo()+"€");
				System.out.println("");
				System.out.println("");
				System.out.println("Nombre: "+Cuenta2.getTitular());
				System.out.println("ID: "+Cuenta2.getID());
				System.out.println("Fondo: "+Cuenta2.getFondo()+"€");
				System.out.println("");
				System.out.println("");
				System.out.println();
				System.out.println();
				System.out.println("");
				System.out.println("");
				System.out.println("Nombre: "+Cuenta3.getTitular());
				System.out.println("ID: "+Cuenta3.getID());
				System.out.println("Fondo: "+Cuenta3.getFondo()+"€");
			}
			if(opcion==2)
			{
				System.out.println("Introducir valor a extraer:");
				double Valor=sc.nextInt();
				Cuenta1.Extraccion(Valor);
				System.out.println(Cuenta1.getFondo());
			}
			if(opcion==3)
			{
				System.out.println("Introducir valor a ingresar:");
				double Valor=sc.nextInt();
				Cuenta1.Ingreso(Valor);
				System.out.println(Cuenta1.getFondo());
			}
			if(opcion==0)
			{
				System.out.println("Fin...");
				System.out.println("");
				System.out.println("");
				System.out.println("-------------------------");
				a=true;
			}
		}
		sc.close();
	}
}