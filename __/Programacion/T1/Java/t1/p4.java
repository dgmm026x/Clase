package t1;

public class p4
{
	public enum Dia {Lunes, Martes, Mi�rcoles, Jueves, Viernes, S�bado, Domingo};

	public static void main(String[] args)
	{
		Dia hoy=Dia.Lunes;
		Dia despues=Dia.Martes;
		
		System.out.println("Hoy es: ");
		System.out.println(hoy);
		System.out.println("Ma�ana es: "+despues);
	}
}