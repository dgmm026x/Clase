package persona_5;

public class Persona
{
	public String Nombre;
	public double Edad;
	public double Estatura;
	public double Peso;
	public String Sexo;
	public String Dni;
	
	
	public Persona(){}
	public Persona(String nombre,double edad,double estatura,double peso,String sexo,String dni)
	{
		Nombre=nombre;
		Edad=edad;
		Estatura=estatura;
		Peso=peso;
		Sexo=sexo;
		Dni=dni;
		
		generarDni();
	}
	
	
	public void setNombre(String nombre){Nombre=nombre;}
	public String getNombre()
	{
		return Nombre;
	}
	
	
	public void setEdad(double edad){Edad=edad;}
	public double getEdad()
	{
		return Edad;
	}
	
	
	public void setEstatura(double estatura){Estatura=estatura;}
	public double getEstatura()
	{
		return Estatura;
	}
	
	
	public void setPeso(double peso){Peso=peso;}
	public double getPeso()
	{
		return Peso;
	}
	
	
	public void setSexo(String sexo){Sexo=sexo;}
	public String getSexo()
	{
		return Sexo;
	}
	
	
	public void setDni(String dni){Dni=dni;}
	public String getDni()
	{
		return Dni;
	}
	
	
	public boolean esMayorEdad()
	{
		boolean mayorEdad;
		if(Edad>=18)
			mayorEdad=true;
		else
			mayorEdad=false;
		
		return this.esMayorEdad();
	}
	
	
	private String generarDni()
	{
		String Dni="";
		for (int i=0;i<8;i++)
		{
			Dni+=(int)(Math.random()*9);
		}
		return this.Dni;
	}
}