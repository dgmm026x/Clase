package t1;
import java.util.Scanner;
public class pMediaEdades
{
	public static void main(String[] args)
	{
		Scanner tec;
		tec=new Scanner(System.in);
		double edad, menor, resul, porcent;
		int cant, mayor;
		
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println(" ");
		System.out.println("Media de edades:");
		System.out.println(" ");
		System.out.println("  Introducir valores de edades");
		System.out.println("  para realizar su media.");
		System.out.println(" ");
		System.out.println("  (Se incluirá la cantidad");
		System.out.println("  de personas mayores de 23):");
		System.out.println(" ");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println(" ");
		
		cant=0;
		menor=1000;
		mayor=0;
		resul=0;

		edad=tec.nextDouble();
		cant++;
		resul=resul+edad;
		if(edad<menor) {if (menor>0){menor=edad;}}
		if (edad>=23){mayor++;}
		while(edad>0)
		{
			edad=tec.nextDouble();
			cant++;
			resul=resul+edad;
			if(edad<menor) {if (menor>0){menor=edad;}}
			if (edad>=23){mayor++;}
		}
		cant=cant-1;
		resul=resul/cant;
		porcent=mayor*100/cant;
		System.out.println(" Media de edad total:    "+resul);
		System.out.println(" ");
		System.out.println(" La edad más joven es:   "+menor);
		System.out.println(" Cantidad de mayores de 23:    "+mayor);
		System.out.println(" Porcentaje de mayores de 23:  "+porcent+"%");

		
		System.out.println(" ");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
	}
}