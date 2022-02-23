package t1;

public class pConversion
{
	public static void main(String[] args)
	{
		float float1=4.3f;
		int int1=12;
		float1=int1;
		System.out.println("Conv. automática: "+float1);
		
		float float2=5.6f;
		int int2=0;
		int1=(int)float2;
		System.out.println("Conv. cast: "+int2);
	}
}
