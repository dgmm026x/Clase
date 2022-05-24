/////////////////////////////////////////////////////////////////



import java.sql.*;
import java.util.*;



/////////////////////////////////////////////////////////////////



class JugadorDAO implements IJugadorDAO{
	
	private String url;
	private Connection conexion;
	
	
	JugadorDAO() {
		
		this.url = "jdbc:mysql://localhost/bbddexamen";
	}
	
	
	
	public void borrarJugador(Jugador jugador) {
		
		try {
			
			this.conexion = DriverManager.getConnection(url, "root", "");
			
			String sentencia = "DELETE jugador WHERE nombre = ?";
			
			PreparedStatement sentenciaDML = conexion.prepareStatement(sentencia);

			sentenciaDML.setString(1, jugador.getNombre());
			
			sentenciaDML.execute();
			
			System.out.println();
			System.out.println(" · Jugador borrado con exito");
			System.out.println();
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		finally {
			
			cerrarConexion();
		}
	}
	
	
	
	public void crearJugador(Jugador jugador) {
		
		try {
			
			this.conexion = DriverManager.getConnection(url, "root", "");

			String sentencia = "INSERT jugador (Nombre) VALUES (?)";
			
			PreparedStatement sentenciaDML = conexion.prepareStatement(sentencia);

			sentenciaDML.setString(1, jugador.getNombre());
			
			sentenciaDML.execute();
			
			System.out.println();
			System.out.println(" · Jugador agregado con exito");
			System.out.println();
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		finally {
			
			cerrarConexion();
			System.out.println("s");
		}
	}
	
	
	
	public void existeJugadorPorNombre(Jugador jugador) {
		
		try {
			
			this.conexion = DriverManager.getConnection(url, "root", "");
			
			String sentencia = "SELECT * FROM jugador WHERE jugador.Nombre = " + jugador.getNombre();
			
			Statement statement = conexion.createStatement();
			
			ResultSet datosQuery = statement.executeQuery(sentencia);
			
			while(datosQuery.next()) {
				
				System.out.println("");
				System.out.println(" Jugador: " + datosQuery.getString(2) + " (ID: "+ datosQuery.getString(2) + ")");
			}
			
			
			if(datosQuery.getString(2) != jugador.getNombre() ) {
				
				System.out.println(" · Agregando jugador...");
				crearJugador(jugador);
			}
			else {
				System.out.println(" · El usuario ya existe");
			}
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	public void existeJugadorPorId(int id) {
		
	}
	
	
	
	public List<Jugador> listaJugadores() {
		
		try {
			
			this.conexion = DriverManager.getConnection(url, "root", "");
			
			String sentencia = "SELECT * FROM jugador";
			
			Statement statement = conexion.createStatement();
			
			ResultSet datosQuery = statement.executeQuery(sentencia);
			
			List<Jugador> listado = new List<>();
			
			while(datosQuery.next()) {
				
				Jugador jugador = new Jugador();
				jugador.setId(datosQuery.getInt(1));
				jugador.setNombre(datosQuery.getString(2));
				listado.add(jugador);
			}
			
			return listado;
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	public void cerrarConexion() {
		
		try {
			
			this.conexion.close();
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}



/////////////////////////////////////////////////////////////////