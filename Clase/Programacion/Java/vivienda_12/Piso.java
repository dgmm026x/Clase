//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//


package vivienda_12;

class Piso extends Vivienda
{
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
	
	private double Comunidad;
	private boolean Exterior;
	
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
	
	Piso(){}
	
	Piso(double Comunidad,boolean Exterior)
	{
		this.Comunidad=Comunidad;
		this.Exterior=Exterior;	
	}
	
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
	
	protected void setComunidad(double Comunidad){this.Comunidad=Comunidad;}
	protected double getComunidad(){return Comunidad;}
	
	protected void setExterior(boolean Exterior){this.Exterior=Exterior;}
	protected boolean getExterior(){return Exterior;}
	
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
	
	@Override
	protected double Comision()
	{
		if(MetCua<100)
			return Precio*1.035;
	}
	
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//s
}


//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//