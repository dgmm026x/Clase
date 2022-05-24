/////////////////////////////////////////////////////////////////



import java.util.InputMismatchException;
import java.util.Scanner;



/////////////////////////////////////////////////////////////////



public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		
		
		boolean enBucle = true;
		while(enBucle == true) {
			
			try {
				
				System.out.println("·································································");
				System.out.println("   JUEGO AFA");
				System.out.println();
				System.out.println(" · [1] Nueva partida");
				System.out.println(" · [2] Lista jugadores");
				System.out.println(" · [3] Partidas de todos los jugadores");
				System.out.println(" · [4] Partidas de jugador por nombre");
				System.out.println(" · [5] Historial de partidas de todos los jugadores");
				System.out.println(" · [6] Salir");
				System.out.println();
				System.out.print(  " · [x]: "); int opcion = teclado.nextInt();
				
				
				
				if(opcion < 1 || opcion > 6) {
					
					System.err.println(" · Valor introducido incorrecto");
				}
				
				else {
					
					switch (opcion) {
					
					case 1:
						nuevaPartida(teclado);
						break;
					case 2:
						listaDeJugadores();
						break;
					case 3:
						break;
					case 4:
						partidasDeJugadorPorNombre(teclado);
						break;
					case 5:
						break;
					case 6:
						enBucle = false;
						System.out.println("·································································");
						System.out.println("   FIN");
						System.out.println("·································································");
						break;
					default:
						break;
					}
				}
			}
			
			catch(InputMismatchException e) {
				
				System.err.println(" · Caracter introducido incorrecto");
			}
		}
	}
	
	
	
	public static void nuevaPartida(Scanner teclado) {
		
		Jugador jugador = new Jugador();
		JugadorDAO jugadorDAO = new JugadorDAO();
		
		System.out.println("·································································");
		System.out.println("   Nuevo jugador");
		System.out.println();
		System.out.print(  "   Nombre: "); teclado.nextLine(); jugador.setNombre(teclado.nextLine());
		
		jugadorDAO.existeJugadorPorNombre(jugador);
	}
	
	
	
	public static void listaDeJugadores() {

		JugadorDAO jugadorDAO = new JugadorDAO();
		
		System.out.println("·································································");
		System.out.println("   Lista de jugadores");
		System.out.println();
		System.out.print(  "  " + jugadorDAO.listaJugadores());
	}
	
	

	public static void partidasDeJugadorPorNombre(Scanner teclado) {
		
		Jugador jugador = new Jugador();
		JugadorDAO jugadorDAO = new JugadorDAO();
		PartidaDAO partidaDAO = new PartidaDAO();
		
		System.out.println("·································································");
		System.out.println("   Buscar jugador");
		System.out.println();
		System.out.print(  "   Nombre: "); /*teclado.nextLine();*/ jugador.setNombre(teclado.nextLine());
		
		partidaDAO.partidasOrdernadasPorJugador();
	}
}
//SELECT COUNT(ID) FROM PARTIDA WHERE IDJUGADOR = 33;


/////////////////////////////////////////////////////////////////