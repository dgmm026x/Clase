package unidadClases;


public class Persona
{
	private String nombre;
	public int peso;
	public double estatura;
	
	
	public String darNombre(){return nombre;}
	public int darPeso(){return peso;}
	public double darEstatura(){return estatura;}
	
	
	public void datosNombre(String a){nombre=a;}
	public void datosPeso(int b){peso=b;}
	public void datosEstatura(double c){estatura=c;}
}