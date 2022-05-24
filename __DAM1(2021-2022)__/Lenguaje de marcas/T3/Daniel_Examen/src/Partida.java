/////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////



class Partida {
	
	private int id;
	private List<Integer> numeros;
	private int puntuacion;
	private Jugador jugador;
	
	
	
	Partida() {}


	
	public void setId(int id) {
		
		this.id = id;
	}
	
	public int getId() {
		
		return id;
	}

	public void setNumeros(List<Integer> numeros) {
		
		this.numeros = numeros;
	}
	
	public List<Integer> getNumeros() {
		
		return numeros;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public int getPuntuacion() {
		return puntuacion;
	}

	public void setJugador(Jugador jugador) {
		
		this.jugador = jugador;
	}
	
	public Jugador getJugador() {
		
		return jugador;
	}
}



/////////////////////////////////////////////////////////////////