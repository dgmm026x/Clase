package t1;

import java.util.Scanner;
import java.util.*;

public class pPi
{
	public static void main(String[] args)
	{
		Scanner tecl;
		tecl=new Scanner(System.in);

		double radio, area, circ;

		
		System.out.println("C�lculo de �rea y circunferencia:");
		System.out.println(" ");
		System.out.println("Introducir radio:");
		System.out.println(" ");
		radio=tecl.nextDouble();

		area = Math.PI*radio*radio;
		circ = 2*Math.PI*radio;
		
		System.out.println("�rea: "+area);
		System.out.println("Circunfererncia: "+circ);
	}
}