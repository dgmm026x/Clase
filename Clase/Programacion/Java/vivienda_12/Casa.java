//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//


package vivienda_12;

class Casa extends Vivienda
{
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
	
	private double Parcela;
	private boolean Piscina;
	
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
	
	Casa(){}
	
	Casa(double Parcela,boolean Piscina)
	{
		this.Parcela=Parcela;
		this.Piscina=Piscina;	
	}
	
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
	
	protected void setParcela(double Parcela){this.Parcela=Parcela;}
	protected double getParcela(){return Parcela;}
	
	protected void setPiscina(boolean Piscina){this.Piscina=Piscina;}
	protected boolean getPiscina(){return Piscina;}
	
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
	
	/*@Override
	public String toString()
	{
		return super.toString();
	}*/
	
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
}


//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//