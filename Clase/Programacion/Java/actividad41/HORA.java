//----------------------------------------------------------------------------
//----------------------------------------------------------------------------


package actividad41;


//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
public class HORA
{
	//----------------------------------------------------------------------------
	
	
	private int DIA;
	private int HH;
	private int MM;
	private int SS;
	
	private String cHH=""; //Estos atributos son los "Cero HH/MM/SS" solamente por estética del reloj (manías mias...)
	private String cMM="";
	private String cSS="";
	
	private int tHH;	//Estos atributos tienen fin de usarse en la suma de los dos objetos HORA
	private int tMM;
	private int tSS;
	
	private int MAYOR;	//Atributos para comprobar que objeto es mayor
	
	
	//----------------------------------------------------------------------------
	
	
	public HORA(){}	//CONSTRUCTOR VACÍO
	
	
	public HORA(int HH,int MM,int SS)	//CONSTRUCTOR
	{
		if(HH>23||HH<0)
			HH=0;
		if(MM>59||MM<0)
			MM=0;
		if(SS>59||SS<0)
			SS=0;
		
		this.HH=HH;
		this.MM=MM;
		this.SS=SS;
	}
	
	
	//----------------------------------------------------------------------------
	
	
	public String VERHORA()	//MOSTRAR HORA
	{
		if(HH<10)
			cHH="0";
		if(MM<10)
			cMM="0";
		if(SS<10)
			cSS="0";
		
		return cHH+HH+":"+cMM+MM+":"+cSS+SS;
	}
	
	
	public String IGUALES(HORA hora1,HORA hora2)
	{
		if(hora1.HH==hora2.HH&&hora1.MM==hora2.MM&&hora1.SS==hora2.SS)
			return "Si";
		else
			return "No";
	}
	
	
	public int MAYORQUE(HORA hora1,HORA hora2)//Sin comentarios...hdashjfdbahjkfa *sonidos de agonía*
	{
		if(hora1.HH==hora2.HH&&hora1.MM==hora2.MM&&hora1.SS==hora2.SS)
			MAYOR=0;
		else
		{
			if(hora1.HH>hora2.HH)
			MAYOR=1;
			else
			{
				if(hora1.HH<hora2.HH)
					MAYOR=2;
				else
				{
					if(hora1.MM>hora2.MM)
						MAYOR=1;
					else
					{
						if(hora1.MM<hora2.MM)
							MAYOR=2;
						else
						{
							if(hora1.SS>hora2.SS)
								MAYOR=1;
							else
								MAYOR=2;
	}}}}}
		
		return MAYOR;
	}
	
	
	public String SUMA(HORA hora1,HORA hora2)	//Sumas de HORA1 y HORA2
	{
		tSS=hora1.SS+hora2.SS; //Suma de segundos...
		if(hora1.SS+hora2.SS>59)//Si pasa de 59 segundos...se restan 60s y se añade +1 minuto
			while(tSS>59)
			{
				tSS-=60;
				tMM++;
			}
		
		
		tMM+=hora1.MM+hora2.MM;	//Suma de minutos...
		if(hora1.MM+hora2.MM>59)//Se restan 60 minutos y se añade +1 hora
			while(tMM>59)
			{
				tMM-=60;
				tHH++;
			}
		
		
		tHH+=hora1.HH+hora2.HH;	//Suma de horas...
		if(hora1.HH+hora2.HH>23)//Se restan 24h y se añade +1 día
			while(tHH>23)
			{
				tHH-=24;
				DIA++;
			}
		
		
		//Añadí aquí los "0" estéticos para no complicarme mucho
		if(tHH<10)
			cHH="0";
		if(tMM<10)
			cMM="0";
		if(tSS<10)
			cSS="0";
		
		return DIA+":"+cHH+tHH+":"+cMM+tMM+":"+cSS+tSS;
	}
	
	
	public HORA(HORA hora1)	//Copia de HORA1
	{
		this.HH=hora1.HH;
		this.MM=hora1.MM;
		this.SS=hora1.SS;
	}
	
	
	//----------------------------------------------------------------------------
	
	
	/*public void setDIA(int DIA)
	{this.DIA=DIA;}
	public int getDIA()
	{return DIA;}*/
	
	
	public void setHH(int HH)
	{this.HH=HH;}
	public int getHH()
	{return HH;}
	
	
	public void setMM(int MM)
	{this.MM=MM;}
	public int getMM()
	{return MM;}
	
	
	public void setSS(int SS)
	{this.SS=SS;}
	public int getSS()
	{return SS;}
	
	
	//----------------------------------------------------------------------------
}


//----------------------------------------------------------------------------
//----------------------------------------------------------------------------