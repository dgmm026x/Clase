package cuentaCorriente_2;


public class CuentaCorriente
{
	private String Titular;
	private String DNI;
	private double Fondo;
	private int ID;
	
	
	public CuentaCorriente(String t, String d)
	{
		Titular=t;
		DNI=d;
		ID++;
	}

	
	public CuentaCorriente(CuentaCorriente objCuentaCorriente)
	{
		this.Titular=objCuentaCorriente.Titular;
		this.DNI=objCuentaCorriente.DNI;
		this.Fondo=objCuentaCorriente.Fondo;
		this.ID=objCuentaCorriente.ID;
	}
	
	
	
	
	public void setTitular(String titular) {Titular=titular;}
	public String getTitular() {return Titular;}
	
	
	
	public String getDNI() {return DNI;}
	public int getID() {return ID;}
	
	
	public void setFondo(double fondo) {Fondo=fondo;}
	public double getFondo() {return Fondo;}
	
	
	public void Extraccion(double Valor)
	{
		if(Fondo>=Valor)
			Fondo-=Valor;
		if(Fondo<Valor&&Fondo>0)
			{}
	}
	
	
	public void Ingreso(double Valor)
	{Fondo+=Valor;}
}