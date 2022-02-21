package persona_5;

import java.util.Scanner;

public class Accion_5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Persona perso=new Persona();
		
		boolean loop=false;
		while(loop==false)
		{
			System.out.println("seleccionar");
			int opcion=sc.nextInt();
			switch(opcion)
			{
				case 1:
					System.out.println();
					System.out.print("Nombre: ");
					String pNombre=sc.nextLine();
					perso.setNombre(pNombre);
					
					System.out.println();
					System.out.print("Edad: ");
					double pEdad=sc.nextDouble();
					perso.setEdad(pEdad);
					
					System.out.println();
					System.out.print("Estatura: ");
					double pEst=sc.nextDouble();
					perso.setEstatura(pEst);
					
					System.out.println();
					System.out.print("Peso: ");
					double pPeso=sc.nextDouble();
					perso.setPeso(pPeso);
					
					
					System.out.println();
					System.out.print("Sexo (M/F): ");
					String pSexo=sc.nextLine();
					perso.setSexo(pSexo);
					
					perso.getDni();
				case 2:
			}
			System.out.println(perso.getNombre());
			System.out.println(perso.getEdad());
			System.out.println(perso.getEstatura());
			System.out.println(perso.getPeso());
			System.out.println(perso.getSexo());
			System.out.println(perso.getDni());
		}
	}
}