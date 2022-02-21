//----------------------------------------------------
//----------------------------------------------------
package bombillas_8;

import java.util.Iterator;
import java.util.Scanner;

//----------------------------------------------------
//----------------------------------------------------
public class Accion_8
{
	public static void main(String[] args)
	{
		BOMBILLA casa=new BOMBILLA();
		Scanner sc=new Scanner(System.in);
		
		
		String interruptor;
		int seleccion;
		boolean corriente;
		boolean luz=false;
		boolean loop=false;
		while(loop==false)
		{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("  S  C  E  P  H  B     T    (-f-)");
			for(int i=0;i<6;i++)
			{
				System.out.print("  ");
				switch(i)
				{
				case 0:
					luz=casa.getSALON();
					break;
				case 1:
					luz=casa.getCOCINA();
					break;
				case 2:
					luz=casa.getENTRADA();
					break;
				case 3:
					luz=casa.getPASILLO();
					break;
				case 4:
					luz=casa.getHABITACION();
					break;
				case 5:
					luz=casa.getBANNO();
					break;
				}
				
				
				if(casa.getTOTAL()==false)
				{
					if(luz==false)
						System.out.print("0");
					if(luz==true)
						System.out.print("1");
					if(i==5)
						System.out.print("    (E)");
				}
				
				
				else
				{
					System.out.print("0");
					if(i==5)
						System.out.print("   (A)");
				}
			}
			
			
			System.out.println();
			System.out.println();
			System.out.print("  Seleccionar luz:");interruptor=sc.nextLine();
			
			
			switch(interruptor)
			{
			case "s":
			case "S":
				if(casa.getSALON()==false)
					casa.setSALON(true);
				else
					casa.setSALON(false);
				break;
				
				
			case "c":
			case "C":
				if(casa.getCOCINA()==false)
					casa.setCOCINA(true);
				else
					casa.setCOCINA(false);
				break;
				
				
			case "e":
			case "E":
				if(casa.getENTRADA()==false)
					casa.setENTRADA(true);
				else
					casa.setENTRADA(false);
				break;
				
				
			case "p":
			case "P":
				if(casa.getPASILLO()==false)
					casa.setPASILLO(true);
				else
					casa.setPASILLO(false);
				break;
				
				
			case "h":
			case "H":
				if(casa.getHABITACION()==false)
					casa.setHABITACION(true);
				else
					casa.setHABITACION(false);
				break;
				
				
			case "b":
			case "B":
				if(casa.getBANNO()==false)
					casa.setBANNO(true);
				else
					casa.setBANNO(false);
				break;
				
				
			case "t":
			case "T":
				if(casa.getTOTAL()==false)
					casa.setTOTAL(true);
				else
					casa.setTOTAL(false);
				break;
				
				
			case "f":
			case "F":
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("  ---------------");
				System.out.println("       Fin.");
				System.out.println("  ---------------");
				loop=true;
				break;
			}
		}
	}
}
//----------------------------------------------------
//----------------------------------------------------