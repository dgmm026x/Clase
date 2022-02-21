package persona_y_fecha_10;

public class Fecha
{
	private int AA;
	private int MM;
	private int DD;
	
	
	public Fecha(){}
	public Fecha(int AA,int MM,int DD)
	{
		this.AA=AA;
		this.MM=MM;
		this.DD=DD;
	}
	
	
	public boolean fechaCorrecta()
	{
		return true;
	}
	
	
	public void setAA(int AA){this.AA=AA;}
	public int getAA(){return AA;}
	
	public void setMM(int MM){this.MM=MM;}
	public int getMM(){return MM;}
	
	public void setDD(int DD){this.DD=DD;}
	public int getDD(){return DD;}
}