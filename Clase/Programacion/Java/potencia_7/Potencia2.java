package potencia_7;

public class Potencia2
{
	private double valor;
	
	Potencia2(double base,double exp)
	{
		this.valor=1;
		if(exp==0)
			return;
		for (;exp>0;exp--)
			this.valor*=base;
	}
	public double getValor()
	{
		return this.valor;
	}
}