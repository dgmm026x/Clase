/////////////////////////////////////////////////////////////////



import java.util.Scanner;
import java.sql.SQLException;



/////////////////////////////////////////////////////////////////



class Wordle {
	
	public void Juego() throws SQLException {
		
		Scanner teclado = new Scanner(System.in);
		
		WordleDAO eso = new WordleDAO();
		String palabraSolucion = eso.readPalabra();
		
		boolean bucle = true;
		while(bucle == true) {
			
			System.out.println();
			System.out.println(palabraSolucion);
			String prueba = teclado.nextLine();
			String pista = "";
			
			
			
			if(prueba.length() == 0)
				System.err.println(" · Entrada vacia");
			
			if(prueba.length() > 5)
				System.err.println(" · Entrada demasiado larga");

			if(prueba.length() > 0 && prueba.length() < 5)
				System.err.println(" · Entrada demasiado corta");
			
			if(prueba.length() == 5) {
				
				for (int i = 0; i < prueba.length(); i++) {
					
					char letraSolucion = palabraSolucion.charAt(i);
					
					if(prueba.charAt(i) == letraSolucion)
						pista += "+";
					
					else {
						
						boolean y = false;
						
						for (int j = 0; j < prueba.length(); j++) {
							
							char letraSolucion2 = palabraSolucion.charAt(j);
							
							if(prueba.charAt(i) == letraSolucion2) {
								
								pista += "-";
								y = true;
								break;
							}
						}
						
						if(y == false)
							pista += "·";
					}
				}
				
				System.out.println(pista);
			}
			
			if(palabraSolucion.compareTo(prueba) == 0) {
				
				System.out.println(" · Correcto");
				bucle = false;
			}
		}
		
		teclado.close();
	}
}



/////////////////////////////////////////////////////////////////