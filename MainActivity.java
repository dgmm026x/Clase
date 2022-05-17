/////////////////////////////////////////////////////////////////



package tienda_v2;

import java.util.*;



/////////////////////////////////////////////////////////////////



public class MainActivity {
	
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		TiendaClass tienda = new TiendaClass();
		
		
		
		boolean bucle = true;
		
		while(bucle == true) {

			menu(teclado);
		}
	}
	
	
	
	protected static void menu(Scanner teclado) {
		

		System.out.println("·································································");
		System.out.println();
		System.out.println(" · Seleccionar opcion:");
		System.out.println();
		System.out.println("   [1] Añadir producto");
		System.out.println("   [2] Eliminar producto");
		System.out.println("   [3] Buscar producto");
		System.out.println("   [4] Eliminar producto");
		System.out.println();
		System.out.print(  "   [x]: "); int opcion = teclado.nextInt();
	}
	
	
	
	protected boolean cerrarBucle() {
		
		return false;
	}
}



/////////////////////////////////////////////////////////////////