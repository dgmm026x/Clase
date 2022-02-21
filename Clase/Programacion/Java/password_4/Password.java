//---------------------------------------------


package password_4;


public class Password
{
//---------------------------------------------
//---------------------------------------------
	
	
	private String Contrasenna;
	private int Longitud;
	
	
	public Password()
	{
		Longitud=8;
	}
	
	
	public Password(int ll)
	{
		Longitud=ll;
		Contrasennaaleatoria();
	}
	
	
//---------------------------------------------
	
	
	public void setContrasenna(String contrasenna)
	{Contrasenna = contrasenna;}
	public String getContrasenna()
	{return Contrasenna;}	
	
	
	public void setLongitud(int longitud)
	{Longitud = longitud;}
	public int getLongitud()
	{return Longitud;}
	
	
	
	private void Contrasennaaleatoria()
	{
		String clave="";
		for (int i=0; i<this.Longitud; i++)
		{
			clave+=(char)(Math.random()*126-33)-33;
		}
		clave=Contrasenna;
	}
	
	
//---------------------------------------------
//---------------------------------------------
}


//---------------------------------------------