//-----------------------------------------------------
//-----------------------------------------------------
package calculadora_3;

public class Calculadora
{
	//-----------------------------------------------------
	//-----------------------------------------------------
	
	
	public double ValorA;
	public double ValorB;

	
	public double getValorA(){return ValorA;}
	public void setValorA(double valorA){ValorA=valorA;}
	
	public double getValorB(){return ValorB;}
	public void setValorB(double valorB){ValorB=valorB;}
	
	
	//-----------------------------------------------------
	
	
	private double Suma;
	private double Resta;
	private double Mult;
	private double Div;
	
	
	public void setSuma(double suma){Suma=suma;}
	public double getSuma(){return ValorA+ValorB;}

	public void setResta(double resta){Resta=resta;}
	public double getResta(){return ValorA-ValorB;}
	
	public void setMult(double mult){Mult=mult;}
	public double getMult(){return ValorA*ValorB;}
	
	public void setDiv(double div){Div=div;}
	public double getDiv(){return ValorA/ValorB;}
	
	
	public static double suma(double valorA, double valorB){return valorA+valorB;}
	public static double rest(double valorA, double valorB){return valorA-valorB;}
	public static double mult(double valorA, double valorB){return valorA*valorB;}
	public static double divi(double valorA, double valorB){return valorA/valorB;}
	
	
	//-----------------------------------------------------
	//-----------------------------------------------------
}
//-----------------------------------------------------
//-----------------------------------------------------