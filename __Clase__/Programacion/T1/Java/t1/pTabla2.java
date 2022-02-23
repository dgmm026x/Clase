package t1;

public class pTabla2
{
	public static void main(String[] args)
	{
		int[] t1,t2;
		t1=new int[10];
		t2=new int[10];
		
		t1[3]=4;
		t1[8]=9;
		
		t2[2]=2;
		
		for (int i = 0; i < t1.length; i++)
			System.out.print(t1[i]+" ");
		
		System.out.println();
		
		for (int i = 0; i < t2.length; i++)
			System.out.print(t2[i]+" ");
		
		t2=t1;
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < t1.length; i++)
			System.out.print(t1[i]+" ");
	}
}
