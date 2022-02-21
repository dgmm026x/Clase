package unidadClases;


public class Punto
{
	private double ordenada;
	private double abcisa;
	
	public Punto(double x, double y)
	{
		ordenada=x;
		abcisa=y;
	}
	
	
	public double getOrdenada(){return ordenada;}
	public void setOrdenada(double ordenada){this.ordenada = ordenada;}
	
	public double getAbcisa(){return abcisa;}
	public void setAbcisa(double abcisa){this.abcisa = abcisa;}
}