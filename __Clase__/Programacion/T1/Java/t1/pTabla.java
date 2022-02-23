package t1;

public class pTabla
{
	private static final int Tam1=20;
	private static final int Tam2=60;
	public static void main(String[] args)
	{
		int[] int1=new int[100];
		String[] String1=new String[10];
		int[] boolean1=new int[5];
		
		float[] float1=new float[Tam1];
		float[] float2=new float[Tam2];

		
		System.out.println();
		for (int i=0; i<int1.length; i++)
			int1[i]=i;
		for (int i=0; i<int1.length; i++)
			System.out.print(int1[i]+" ");
	}
}