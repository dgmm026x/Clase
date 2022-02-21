//··········································································//
//··········································································//


package vivienda_12;

class Vivienda
{
	//······································································//
	
	protected int NumHab;
	protected double MetCua;
	protected double Precio;
	protected String Ciudad;
	protected String Zona;
	
	//······································································//
	
	Vivienda(){}
	
	Vivienda(int NumHab,double MetCua,double Precio,String Ciudad,String Zona)
	{
		this.NumHab=NumHab;
		this.MetCua=MetCua;
		this.Precio=Precio;
		this.Ciudad=Ciudad;
		this.Zona=Zona;	
	}
	
	//······································································//
	
	protected void setNumHab(int NumHab){this.NumHab=NumHab;}
	protected int getNumHab(){return NumHab;}
	
	protected void setMetCua(double MetCua){this.MetCua=MetCua;}
	protected double getMetCua(){return MetCua;}
	
	protected void setPrecio(double Precio){this.Precio=Precio;}
	protected double getPrecio(){return Precio;}
	
	protected void setCiudad(String Ciudad){this.Ciudad=Ciudad;}
	protected String getCiudad(){return Ciudad;}
	
	protected void setZona(String Zona){this.Zona=Zona;}
	protected String getZona(){return Zona;}
	
	//······································································//
	
	protected double Comision()
	{
		return Precio*1.03;
	}
	
	//······································································//
}


//··········································································//
//··········································································//