package t1;
import java.util.Scanner;
public class pTienda
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int Producto;
		int Precio;
		int Litro;
		
		int Facturas=0;
		int Facturacion=0;
		int LitroTotal=0;
		int mas600=0;
		
		int Salir=1;
		do
		{
			Facturas++;
			System.out.println("----------------------------------------");
			System.out.println("Introducir producto:");
			Producto=sc.nextInt();
			System.out.println("Introducir volumen:");
			Litro=sc.nextInt();
			System.out.println("Introducir coste:");
			Precio=sc.nextInt();
			if (Precio>600) {mas600++;}
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("Resumen de ventas:");
			Facturacion=Facturacion+Precio;
				System.out.println("Ingreso total: "+Facturacion+"€");
			LitroTotal=LitroTotal+Litro;
				System.out.println("Litraje total: "+LitroTotal+"L");
				System.out.println(mas600);
			
			System.out.println("¿Intrducir otra factura '1' o salir '0'?");
			Salir=sc.nextInt();

		}
		while(Salir==1);
		System.out.println("----------------------------------------");
		System.out.println("				  Fin					");
		System.out.println("----------------------------------------");
	}
}
