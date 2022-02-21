package potencia_7;

public class Accion_7
{
	public static void main(String[] args)
	{
		Potencia p=new Potencia();
		p.setBase(4);
		p.setExp(2);
		System.out.println(p.getValor());
		
		Potencia2 p2=new Potencia2(4,2);
		System.out.println(p2.getValor());
	}
}