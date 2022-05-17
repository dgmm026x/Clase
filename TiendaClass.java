/////////////////////////////////////////////////////////////////



package tienda_v2;

import java.util.*;



/////////////////////////////////////////////////////////////////



class TiendaClass {

	protected TreeMap<LinealEnum, TreeSet<ArticuloClass>> mapaArticulos;
	
	
	
	TiendaClass() {
		

		System.out.println("·································································");
		System.out.println();
		System.out.println("   Tienda");
		System.out.println("   v 2.0.0");
		System.out.println();
		this.mapaArticulos = new TreeMap<>();
		for (LinealEnum Lineales : LinealEnum.values()) {
			
			this.mapaArticulos.put(Lineales, new TreeSet<ArticuloClass>());
			System.out.println(mapaArticulos);
		}
	}
	
	
	
	protected void introducirArticulo(Scanner teclado) {
		
		try {
			
			System.out.println("·································································");
			System.out.println();
			System.out.println(" · Nuevo artículo a añadir:");
			System.out.println();
			System.out.print(  "   Codigo de referencia: "); String nuevoCodigo = teclado.nextLine();
			System.out.print(  "   Nombre del artículo: "); String nuevoNombre = teclado.nextLine();
			System.out.print(  "   Unidades a contar: "); int nuevaCantidad = teclado.nextInt();
			
			
			
			int opcion = 0;
			boolean bucle = true;
			while(bucle == true) {
				
				try {
					System.out.println();
					System.out.println(" · ¿Continuar?");
					System.out.println("   [1] Si");
					System.out.println("   [0] No");
					System.out.println();
					System.out.print(  "   [X]: "); opcion = teclado.nextInt();
					
					if(opcion > 1 || opcion < 0) {

						System.err.println("   Valor introducido incorrecto");
					}
					
					else {

						bucle = false;
					}
				}
				
				catch(InputMismatchException e) {

					System.err.println("   Caracter introducido incorrecto");
				}
			}
			
			
			
			if(opcion == 1) {
				
				char letraCodigo = nuevoCodigo.charAt(0);
				String linealIndicado = Character.toString(letraCodigo);
				LinealEnum linealSeleccionado = null;
				
				switch(linealIndicado) {

				case "A":
					linealSeleccionado = LinealEnum.A;
					break;
				case "B":
					linealSeleccionado = LinealEnum.B;
					break;
				case "C":
					linealSeleccionado = LinealEnum.C;
					break;
				case "D":
					linealSeleccionado = LinealEnum.D;
					break;
				case "E":
					linealSeleccionado = LinealEnum.E;
					break;
				case "F":
					linealSeleccionado = LinealEnum.F;
					break;
				default:
					break;
				}
				
				
				
				ArticuloClass articuloNuevo = new ArticuloClass(nuevoCodigo, nuevoNombre, nuevaCantidad);
				mapaArticulos.get(linealSeleccionado).add(articuloNuevo);
			}
			
			
			
			else {
				
				System.out.println();
				System.out.println(" · Inserción cancelada");
			}
		}
		
		 catch(Exception e) {
			 
			System.err.println("   ayo");
		 }
		
		
		
		System.out.println();
	}
	
	
	
	protected void buscarArticulo(Scanner teclado) {

		TreeSet<ArticuloClass> coleccion = mapaArticulos.get(LinealEnum.A);
		Iterator<ArticuloClass> buscador = coleccion.iterator();
		
		
		
		while(buscador.hasNext()) {
			
			ArticuloClass objeto = (ArticuloClass) buscador.next();
			System.out.println(objeto);
		}
	}
}



/////////////////////////////////////////////////////////////////