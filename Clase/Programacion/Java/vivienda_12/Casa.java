//··········································································//
//··········································································//


package vivienda_12;

class Casa extends Vivienda
{
	//······································································//
	
	private double Parcela;
	private boolean Piscina;
	
	//······································································//
	
	Casa(){}
	
	Casa(double Parcela,boolean Piscina)
	{
		this.Parcela=Parcela;
		this.Piscina=Piscina;	
	}
	
	//······································································//
	
	protected void setParcela(double Parcela){this.Parcela=Parcela;}
	protected double getParcela(){return Parcela;}
	
	protected void setPiscina(boolean Piscina){this.Piscina=Piscina;}
	protected boolean getPiscina(){return Piscina;}
	
	//······································································//
	
	/*@Override
	public String toString()
	{
		return super.toString();
	}*/
	
	//······································································//
}


//··········································································//
//··········································································//