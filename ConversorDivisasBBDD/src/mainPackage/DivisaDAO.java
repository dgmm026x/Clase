/////////////////////////////////////////////////////////////////



package mainPackage;

import java.sql.*;
import java.util.*;



/////////////////////////////////////////////////////////////////



class DivisaDAO {
	
	private Connection conexion;
	protected TreeMap<String, List<String>> historial = new TreeMap<>();
	
	
	
	public DivisaDAO() {
		
		try {
			
			System.out.println(" ( Conectando con BBDD...    )");
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_divisas", "root", "");
			System.out.println(" ( CONEXION a BBDD con EXITO ) ");
			System.out.println();
		}
		
		catch (SQLException e) {
			
			System.err.println(" · ERROR en CONEXION a la BBDD");
		}
	}
	
	
	
	
	
	
	protected void close() {
		
		try {
			
			conexion.close();
		}
		
		catch (SQLException e) {
			
			System.err.println(" · ERROR DESCONECTANDO de la BBDD");
		}
	}
	
	
	
	
	
	
	protected void createDivisa(Divisa divisa) {
		
		try {
			
			String sentencia = "INSERT INTO divisas (nombre, valor) VALUES (?,?)";
			
			PreparedStatement datosSentencia = conexion.prepareStatement(sentencia);
			
			datosSentencia.setString(1, divisa.getNombre());
			datosSentencia.setDouble(2, divisa.getValor());
			
			datosSentencia.executeUpdate();

			System.out.println(" · Divisa AGREGADA con exito");
		}
		
		catch (SQLException e) {
			
			System.err.println(" · ERROR agregando divisa");
		}
	}
	
	
	
	
	
	
	protected String readDivisa(String nombreDivisa) {
		
		String resultado = "";
		
		try {
			
			String sentencia = "SELECT * FROM divisas";
			
			Statement declaracion = conexion.createStatement();
			
			ResultSet resultadoQuery = declaracion.executeQuery(sentencia);
			
			
			
			boolean hallado = false;
			
			while(resultadoQuery.next()) {
				
				if(resultadoQuery.getString(2).compareTo(nombreDivisa) == 0) {
					
					resultado = " · DIVISA encontrada ---> NOMBRE '" + resultadoQuery.getString(2) + "',  VALOR '" + resultadoQuery.getDouble(3) + "'";
					hallado = true;
				}
			}
			
			if (hallado == false) {
				
				resultado = " · NO se encontro la divisa";
			}
		}
		
		catch (Exception e) {
			
			resultado = " · ERROR buscando divisa";
		}
		
		return resultado;
	}
	
	
	
	
	
	
	protected Divisa readValorDivisa(String nombreDivisa) {
		
		Divisa divisa = new Divisa(null, 0);
		
		try {
			
			String sentencia = "SELECT * FROM divisas";
			
			Statement declaracion = conexion.createStatement();
			
			ResultSet resultadoQuery = declaracion.executeQuery(sentencia);
			
			
			
			boolean hallado = false;
			
			while(resultadoQuery.next()) {
				
				if(resultadoQuery.getString(2).compareTo(nombreDivisa) == 0) {

					divisa.setNombre(resultadoQuery.getString(2));
					divisa.setValor(resultadoQuery.getDouble(3));
					hallado = true;
				}
			}
			
			if (hallado == false) {
				
				System.out.println(" · NO se encontro la divisa");
			}
		}
		
		catch (Exception e) {
			
			System.out.println(" · ERROR buscando divisa");
		}
		
		return divisa;
	}
	
	
	
	
	
	
	protected void listaDivisas() {
		
		try {
			
			String sentencia = "SELECT * FROM divisas";
			
			Statement declaracion = conexion.createStatement();
			
			ResultSet resultadoQuery = declaracion.executeQuery(sentencia);
			
			
			
			while(resultadoQuery.next()) {

				System.out.println(" · DIVISA ---> NOMBRE '" + resultadoQuery.getString(2) + "' - VALOR '" + resultadoQuery.getDouble(3) + "'");
			}

		}
		
		catch (Exception e) {
			
			System.out.println(" · ERROR buscando divisas");
		}
	}
	
	
	
	
	
	
	protected void updateDivisa(Divisa divisa) {
		
		try {
			
			String sentencia = "UPDATE divisas SET valor = ? WHERE nombre = ?";
			
			PreparedStatement datosSentencia = conexion.prepareStatement(sentencia);

			datosSentencia.setDouble(1, divisa.getValor());
			datosSentencia.setString(2, divisa.getNombre());
			
			datosSentencia.executeUpdate();

			System.out.println(" · Divisa ACTUALIZADA con exito");
		}
		
		catch (SQLException e) {
			
			System.err.println(" · ERROR actualizando divisa");
		}
	}
	
	
	
	
	
	
	protected void deleteDivisa() {
	}
	
	
	
	
	
	
	protected void guardarEnHistorial(double valor, Divisa divisa) {
		
		try {
			
			String sentencia = "SELECT * FROM divisas WHERE nombre = ?";
			
			PreparedStatement datosSentencia = conexion.prepareStatement(sentencia);
			
			datosSentencia.setString(1, divisa.getNombre());

			Statement declaracion = conexion.createStatement();
			
			ResultSet resultadoQuery = declaracion.executeQuery(sentencia);
			
			int id = 0;
			
			while(resultadoQuery.next()) {
				
				id = resultadoQuery.getInt(1);
			}
			
			String sentencia2 = "INSERT INTO historial (idDivisa, conversion) VALUES (?,?)";
			
			PreparedStatement datosSentencia2 = conexion.prepareStatement(sentencia2);

			datosSentencia2.setInt(1, id);
			datosSentencia2.setString(2, ("Conversion de " + valor + " EUR a ---> " + (valor * divisa.getValor()) + " " + divisa.getNombre()));
			
			datosSentencia2.executeUpdate();
			System.out.println();
			System.out.println(" · Conversion REGISTRADA en el HISTORIAL");
		}
		
		catch (SQLException e) {

			System.out.println();
			System.err.println(" · ERROR REGISTRANDO conversion en el HISTORIAL");
		}
	}
	
	
	
	
	
	
	protected TreeMap<String, List<String>> verTodoHistorial() {
		
		TreeMap<String, List<String>> historial = null;
		
		try {
			
			String sentencia = "SELECT * FROM divisas";
			
			Statement declaracion = conexion.createStatement();
			
			ResultSet resultadoQuery = declaracion.executeQuery(sentencia);
			
			while(resultadoQuery.next()) {
				
				historial.put(resultadoQuery.getString(2), null);
				
				String sentencia2 = "SELECT * FROM divisas";
				
				Statement declaracion2 = conexion.createStatement();
				
				ResultSet resultadoQuery2 = declaracion2.executeQuery(sentencia2);
				
				while(resultadoQuery2.next()) {
					
					historial.get(resultadoQuery.getString(2)).add(resultadoQuery2.getString(2));
				}
			}
		}
		catch (Exception e) {
			
			System.err.println(" · ERROR buscando divisa");
		}
		
		return historial;
	}
}



/////////////////////////////////////////////////////////////////