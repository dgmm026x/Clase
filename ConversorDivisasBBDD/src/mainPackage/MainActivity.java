/////////////////////////////////////////////////////////////////



package mainPackage;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.InputMismatchException;
import java.util.List;



////////////////////////////////////////////////////////////////



public class MainActivity {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		menu(teclado);
	}
	
	
	
	protected static void menu(Scanner teclado) {
		
		boolean bucle = true;
		
		while(bucle == true) {
			
			try {
				
				System.out.println("иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии");
				System.out.println("CONVERSOR DIVISAS");
				System.out.println("иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии");
				System.out.println();
				System.out.println("   [1] Agregar NUEVA divisa");
				System.out.println("   [2] CONVERSION de EUR a cualquier divisa");
				System.out.println("   [3] ACTUALIZAR divisa");
				System.out.println("   [4] LISTA de divisas");
				System.out.println("   [5] HISTORIAL de CONVERSIONES");
				System.out.println();
				System.out.println("   [0] SALIR");
				System.out.println();
				System.out.println();
				System.out.print(  "   [x] -> "); int opcion = teclado.nextInt(); teclado.nextLine();
				System.out.println();
				
				if(opcion < 0 || opcion > 5) {
					
					throw new InputMismatchException();
				}
				
				else {
					
					switch(opcion) {
					
						case 1:
							
							nuevaDivisa(teclado);
							break;
							
						case 2:
							
							conversionDivisa(teclado);
							break;
							
						case 3:
							
							actualizarDivisa(teclado);
							break;
							
						case 4:
							
							listaDivisas();
							break;

						case 5:
							
							verHistorialConversiones(teclado);
							break;
							
						case 0:
							
							bucle = false;
							System.out.println("иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии");
							System.out.println("FIN DE PROGRAMA");
							System.out.println("иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии");
							break;
					}
				}
			}
			
			catch (InputMismatchException e) {
				
				System.err.println(" и Caracter introducido invalido");
			}
			
			System.out.println();
			System.out.println();
		}
	}
	
	
	
	
	
	
	protected static void nuevaDivisa(Scanner teclado) {
		
		try {
			
			System.out.println("иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии");
			System.out.println("NUEVA DIVISA");
			System.out.println();
			System.out.print(  "   Introducir NOMBRE de NUEVA divisa: "); String nombre = teclado.nextLine();
			System.out.println();
			System.out.println();
			
			DivisaDAO divisaDAO = new DivisaDAO();
			
			String letra = Character.toString(divisaDAO.readDivisa(nombre).charAt(3));
			
			switch (letra) {
			
				case "D":
					
					System.out.println(" и La divisa ya esta REGISTRADA");
					System.out.println(" и Agregacion de divisa CANCELADA");
					break;
					
				case "N":
					
					System.out.println(" и Divisa disponible");
					System.out.println();
					System.out.print(  "   Introducir VALOR de NUEVA divisa: "); double valor = teclado.nextDouble();
					System.out.println();
					if(valor <= 0) {
						
						System.out.println(" и Nuevo valor de divisa INCORRECTO");
						System.out.println(" и Agregacion de divisa CANCELADA");
					}
					
					else {
						
						Divisa divisa = new Divisa(nombre, valor);
						divisaDAO.createDivisa(divisa);
					}
					break;
					
				case "E":
					
					System.out.println(divisaDAO.readDivisa(nombre));
					System.out.println(" и Agregacion de divisa CANCELADA");
					break;
			}
			
			divisaDAO.close();
		}
		
		catch (InputMismatchException e) {
			
			System.err.println(" и Caracter introducido invalido");
		}
		
		System.out.println();
		System.out.println();
	}
	
	
	
	
	
	
	protected static void conversionDivisa(Scanner teclado) {
		
		try {
			
			System.out.println("иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии");
			System.out.println("CONVERSION DE DIVISA");
			System.out.println();
			System.out.print(  "   Introducir valor en EUR: "); double valor = teclado.nextDouble(); teclado.nextLine();
			System.out.println();
			System.out.println();
			
			
			
			DivisaDAO divisaDAO = new DivisaDAO();
			
			divisaDAO.listaDivisas();
			
			

			System.out.println();
			System.out.print(  "   Introducir nombre de la divisa a CONVERTIR: "); String nombre = teclado.nextLine();
			System.out.println();
			System.out.println();
			
			
			String letra = Character.toString(divisaDAO.readDivisa(nombre).charAt(3));
			
			switch (letra) {
			
				case "D":
					
					Divisa divisa = divisaDAO.readValorDivisa(nombre);
					System.out.println();
					System.out.println(" и Divisa indicada valida");
					System.out.println();
					System.out.println("   CONVERSION: " + valor + " EUR ---> " + (valor * divisa.getValor()) + " " + divisa.getNombre());
					divisaDAO.guardarEnHistorial(valor, divisa);
					break;
					
				case "N":
					
					System.out.println(" и La divisa NO esta registrada");
					System.out.println(" и Conversion de divisa CANCELADA");
					break;
					
				case "E":
					
					System.out.println(divisaDAO.readDivisa(nombre));
					System.out.println(" и Conversion de divisa CANCELADA");
					break;
			}
			
			divisaDAO.close();
		}
		
		catch (InputMismatchException e) {
			
			System.err.println(" и Caracter introducido invalido");
		}
		
		System.out.println();
		System.out.println();
	}
	
	
	
	
	
	
	protected static void actualizarDivisa(Scanner teclado) {
		
		try {
			
			System.out.println("иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии");
			System.out.println("ACTUALIZAR DIVISA");
			System.out.println();
			System.out.print(  "   Introducir nombre de la divisa: "); String nombre = teclado.nextLine();
			System.out.println();
			System.out.println();
			
			DivisaDAO divisaDAO = new DivisaDAO();
			
			String letra = Character.toString(divisaDAO.readDivisa(nombre).charAt(3));
			
			switch (letra) {
			
				case "D":
					
					System.out.println(" и Divisa DISPONIBLE para actualizar");
					System.out.println();
					System.out.print(  "   Introducir NUEVO VALOR para la divisa: "); double valor = teclado.nextDouble();
					System.out.println();
					if(valor <= 0) {
						
						System.out.println(" и Nuevo valor de divisa INCORRECTO");
						System.out.println(" и Actualizacion de divisa CANCELADA");
					}
					else {

						Divisa divisa = new Divisa(nombre, valor);
						divisaDAO.updateDivisa(divisa);
					}
					break;
					
				case "N":
					
					System.out.println(" и La divisa NO esta registrada");
					System.out.println(" и Actualizacion de divisa CANCELADA");
					break;
					
				case "E":
					
					System.out.println(divisaDAO.readDivisa(nombre));
					System.out.println(" и Actualizacion de divisa CANCELADA");
					break;
			}
			
			divisaDAO.close();
		}
		
		catch (InputMismatchException e) {
			
			System.err.println(" и Caracter introducido invalido");
		}
		
		System.out.println();
		System.out.println();
	}
	
	
	
	
	
	
	protected static void listaDivisas() {
		
		System.out.println("иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии");
		System.out.println("LISTA DE DIVISAS");
		System.out.println();
		System.out.println();
		
		DivisaDAO divisaDAO = new DivisaDAO();
		
		divisaDAO.listaDivisas();
		
		divisaDAO.close();
		
		System.out.println();
		System.out.println();
	}
	
	
	
	
	
	
	protected static void verHistorialConversiones(Scanner teclado) {
		
		try {
			
			System.out.println("иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии");
			System.out.println("HISTORIAL DE CONVERSIONES");
			System.out.println("иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии");
			System.out.println();
//			System.out.println("   [1] Por TIPO");
			System.out.println("   [2] TODAS");
			System.out.println();
			System.out.println("   [0] SALIR");
			System.out.println();
			System.out.println();
			System.out.print(  "   [x] -> "); int opcion = teclado.nextInt(); teclado.nextLine();
			System.out.println();
			
			if(opcion < 1 || opcion > 2) {
				
				throw new InputMismatchException();
			}
			
			else {
				
				DivisaDAO divisaDAO = new DivisaDAO();
				
				switch(opcion) {
				
//					case 1:
//						
//						System.out.println();
//						System.out.print(  "   Introducir nombre de la divisa: "); String nombre = teclado.nextLine();
//						System.out.println();
//						System.out.println();
//						break;
						
					case 2:
						
						System.out.println(divisaDAO.verTodoHistorial());
						break;
						
					case 0:
						
						System.out.println("иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии");
						System.out.println("PROCESO CANCELADO");
						System.out.println("иииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии");
						break;
				}
			}
		}
		
		catch (InputMismatchException e) {
			
			System.err.println(" и Caracter introducido invalido");
		}
	}
}



/////////////////////////////////////////////////////////////////