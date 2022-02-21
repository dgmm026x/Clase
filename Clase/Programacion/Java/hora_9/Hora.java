package hora_9;

public class Hora
{
	private int HORAS;
	private int MINUTOS;
	private int SEGUNDOS;
	
	public Hora(){}
	
	public Hora(int HORAS,int MINUTOS,int SEGUNDOS)
	{
		this.HORAS=HORAS;
		this.MINUTOS=MINUTOS;
		this.SEGUNDOS=SEGUNDOS;
	}
	
	
	
	public void setHORAS(int HORAS){this.HORAS=HORAS;}
	public int getHORAS()
	{
		if(HORAS<0||HORAS>23)
			HORAS=0;
		return HORAS;
	}
	
	
	public void setMINUTOS(int MINUTOS){this.MINUTOS=MINUTOS;}
	public int getMINUTOS()
	{
		if(MINUTOS<0||MINUTOS>59)
			MINUTOS=0;
		return MINUTOS;
	}
	
	
	public void setSEGUNDOS(int SEGUNDOS){this.SEGUNDOS=SEGUNDOS;}
	public int getSEGUNDOS()
	{
		if(SEGUNDOS<0||SEGUNDOS>59)
			SEGUNDOS=0;
		return SEGUNDOS;
	}
	
	
	/*
	public int verHora()
	{
		HORAS=23;
		MINUTOS=59;
		SEGUNDOS=59;
	}*/
}