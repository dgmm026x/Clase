//··········································································//
//··········································································//


package peaje_11;


class Peaje
{
	//······································································//
	
	protected String Nombre;
	protected String Dept;
	protected int PaseCoche;
	protected int PaseMoto;
	protected int PaseCamion;
	protected int Ingresos;
	
	//······································································//
	
	protected Peaje(){}
	
	protected Peaje(String Nombre,String Dept,int PaseCoche,int PaseMoto,int PaseCamion,int Ingresos)
	{
		this.Nombre=Nombre;
		this.Dept=Dept;
		this.PaseCoche=PaseCoche;
		this.PaseMoto=PaseMoto;
		this.PaseCamion=PaseCamion;
		this.Ingresos=Ingresos;
	}
	
	//······································································//
	
	
	
	//······································································//
	
	protected void setNombre(String Nombre){this.Nombre=Nombre;}
	protected String getNombre(){return Nombre;}
	
	protected void setDept(String Dept){this.Dept=Dept;}
	protected String getDept(){return Dept;}
	
	protected void setPaseCoche(int PaseCoche){this.PaseCoche+=PaseCoche;}
	protected int getPaseCoche(){return PaseCoche;}

	protected void setPaseMoto(int PaseMoto){this.PaseMoto+=PaseMoto;}
	protected int getPaseMoto(){return PaseMoto;}
	
	protected void setPaseCamion(int PaseCamion){this.PaseCamion+=PaseCamion;}
	protected int getPaseCamion(){return PaseCamion;}
	
	protected void setIngresos(int Ingresos){this.Ingresos+=Ingresos;}
	protected int getIngresos(){return Ingresos;}
	
	//······································································//
}


//··········································································//
//··········································································//