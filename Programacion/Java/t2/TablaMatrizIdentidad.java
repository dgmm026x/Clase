package t2;
import java.util.*;
public class TablaMatrizIdentidad
{
	public static void main(String[] args)
	{
		int height=5;
		int width=5;
		int fila=0;
		int[][] id=new int[height][width];
		for (int i=0; i<id.length; i++)
		{
			id[i][i]=1;
			
			System.out.println(Arrays.toString(id[fila]));
			if(fila<=4)
				fila++;
			
			System.out.flush();
		}
		//Thread.sleep(1000);
		//TimeUnit.SECONDS.sleep(2);
	}
}
