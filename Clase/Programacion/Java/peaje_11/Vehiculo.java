//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//


package peaje_11;


class Vehiculo
{
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
	
	protected String Matricula;
	protected String Color;
	protected int NumeroRuedas;
	protected double Cilindrada;
	protected int Potencia;
	
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
	
	Vehiculo(){}
	
	Vehiculo(String Matricula,String Color,int NumeroRuedas,double Cilindrada,int Potencia)
	{
		this.Matricula=Matricula;
		this.Color=Color;
		this.NumeroRuedas=NumeroRuedas;
		this.Cilindrada=Cilindrada;
		this.Potencia=Potencia;
	}
	
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
	
	protected void setMatricula(String Matricula){this.Matricula=Matricula;}
	protected String getMatricula(){return Matricula;}
	
	//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
}


//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//
//ииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииии//