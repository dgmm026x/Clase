/////////////////////////////////////////////////////////////////



import java.sql.*;



/////////////////////////////////////////////////////////////////



class WordleDAO {
	
	private Connection conexion;
	
	
	
	public WordleDAO() throws SQLException {
		
		this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/dam_dgm_bbddwordle2", "root", "");
	}
	
	
	
	protected String readPalabra() throws SQLException {
		
		String palabraSeleccionada = "";
		
		
		String sentenciaSql = "SELECT COUNT(palabra) FROM palabras";
		Statement sentencia = conexion.createStatement();
		ResultSet datosQuery = sentencia.executeQuery(sentenciaSql);
		
		int longitudTabla = 0;
		if(datosQuery.next())
			longitudTabla = datosQuery.getInt(1);
		int posicionPalabraAleatoria = (int) (Math.random() * longitudTabla) + 1;
		
		
		sentenciaSql = "SELECT * FROM palabras WHERE id = " + posicionPalabraAleatoria;
		ResultSet datosQuery2 = sentencia.executeQuery(sentenciaSql);
		
		if(datosQuery2.next())
			palabraSeleccionada = datosQuery2.getString(2);
		
		
		return palabraSeleccionada;
	}
}


/////////////////////////////////////////////////////////////////