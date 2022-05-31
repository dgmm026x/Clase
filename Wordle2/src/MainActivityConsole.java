/////////////////////////////////////////////////////////////////



import java.sql.SQLException;
import java.util.Scanner;



/////////////////////////////////////////////////////////////////



public class MainActivityConsole {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner teclado = new Scanner(System.in);
		
		WordleDAO eso = new WordleDAO();
		String palabraSolucion = eso.readPalabra();
		System.out.println(palabraSolucion);
		boolean x = false;
		while(x == false) {
			
//			char letra1 = palabraSolucion.charAt(1);
//			char letra2 = palabraSolucion.charAt(2);
//			char letra3 = palabraSolucion.charAt(3);
//			char letra4 = palabraSolucion.charAt(4);
//			char letra5 = palabraSolucion.charAt(5);
			System.out.println();
			String prueba = teclado.nextLine();
			
			
			
			if(prueba == palabraSolucion) {
				
				System.out.println("CORRECTO");
				x = true;
			}
			
			if(prueba.length() == 0) {
				
				System.err.println(" · entrada vacia");
			}
			
			if(prueba.length() < 5 && prueba.length() > 0) {
				
				System.err.println(" · long muy corta");
			}
			
			if(prueba.length() > 5) {
				
				System.err.println(" · long muy larga");
			}
			
			if(prueba.length() == 5 && prueba != palabraSolucion) {
				
				for (int i = 0; i < 5; i++) {
					
					char letraSolucion = palabraSolucion.charAt(i);
					
					if(prueba.charAt(i) == letraSolucion)
						System.out.print("+");
					
					else {
						
						boolean y = false;
						for (int j = 0; j < 5; j++) {
							
							char letraSolucion2 = palabraSolucion.charAt(j);
							
							if(prueba.charAt(i) == letraSolucion2) {
								
								System.out.print("-");
								y = true;
								break;
							}
						}
						
						if(y == false) {
							System.out.print("·");
						}
					}
				}
			}
		}
		
		
		
		teclado.close();
	}
}



/////////////////////////////////////////////////////////////////