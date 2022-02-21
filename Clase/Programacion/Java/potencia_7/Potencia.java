package potencia_7;

public class Potencia
{
	private double base;
	private int exp;
	private double valor;
	
	
	public void setBase(double base){this.base=base;}
	public double getBase(){return base;}
	
	public void setExp(int exp){this.exp=exp;}
	public int getExp(){return exp;}
	
	public void setValor(double valor){this.valor=valor;}
	public double getValor()
	{
		if(exp==0)
			return 0;
		this.valor=1;
		for (;exp>0;exp--)
			valor*=base;
		return valor;
	}
}