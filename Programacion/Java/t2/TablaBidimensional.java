package t2;
import java.util.Arrays;
import java.util.Random;
public class TablaBidimensional
{
	public static void main(String[] args)
	{
		Random rd=new Random();
		int[][] cuadro=new int[3][3];
		int longg=cuadro.length;
		int alt=0;
		
		
		for (int i=0; i<longg; i++)
		{
			for (int j=0; j<cuadro.length; j++)
			{
				cuadro[i][j]=rd.nextInt(100);
			}
		}
		System.out.println(Arrays.deepToString(cuadro));
	}
}