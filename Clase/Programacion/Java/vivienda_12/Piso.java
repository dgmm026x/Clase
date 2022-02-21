//··········································································//
//··········································································//


package vivienda_12;

class Piso extends Vivienda
{
	//······································································//
	
	private double Comunidad;
	private boolean Exterior;
	
	//······································································//
	
	Piso(){}
	
	Piso(double Comunidad,boolean Exterior)
	{
		this.Comunidad=Comunidad;
		this.Exterior=Exterior;	
	}
	
	//······································································//
	
	protected void setComunidad(double Comunidad){this.Comunidad=Comunidad;}
	protected double getComunidad(){return Comunidad;}
	
	protected void setExterior(boolean Exterior){this.Exterior=Exterior;}
	protected boolean getExterior(){return Exterior;}
	
	//······································································//
	
	@Override
	protected double Comision()
	{
		if(MetCua<100)
			return Precio*1.035;
	}
	
	//······································································//s
}


//··········································································//
//··········································································//