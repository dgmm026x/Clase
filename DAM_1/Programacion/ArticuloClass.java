/////////////////////////////////////////////////////////////////



package tienda_v2;

import java.util.Collections;
import java.util.InputMismatchException;



/////////////////////////////////////////////////////////////////



class ArticuloClass implements Comparable<Object>{

	protected String referenciaArticulo;
	protected String nombreArticulo;
	protected int unidadesArticulo;
	
	
	
	ArticuloClass(String lA, String nA, int uA) {
		
		try {
			
			this.referenciaArticulo = lA;
			this.nombreArticulo = nA;
			this.unidadesArticulo = uA;
		}
		
		catch(InputMismatchException e) {
			
			System.err.println("ayo");
		}
	}



	protected void setReferenciaArticulo(String referenciaArticulo) {
		this.referenciaArticulo = referenciaArticulo;
	}
	
	protected String getReferenciaArticulo() {
		return referenciaArticulo;
	}

	protected void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	protected String getNombreArticulo() {
		return nombreArticulo;
	}

	protected void setUnidadesArticulo(int unidadesArticulo) {
		this.unidadesArticulo = unidadesArticulo;
	}
	
	protected int getUnidadesArticulo() {
		return unidadesArticulo;
	}
	
	
	
	@Override
	public String toString() {

		return "[" + referenciaArticulo + "]: " + nombreArticulo + ", " + unidadesArticulo + " uds.";
	}



	@Override
	public int compareTo(Object o) {
		if(!(o instanceof ArticuloClass))
			return -1;
		ArticuloClass temp = (ArticuloClass) o;
		int r = this.referenciaArticulo.compareTo(temp.getReferenciaArticulo());
		if(r==0) {
			r=this.nombreArticulo.compareToIgnoreCase(temp.nombreArticulo);
		}
		if(r==0) {
			r= Integer.compare(this.unidadesArticulo, temp.getUnidadesArticulo());
		}
		return r;
	}
}



/////////////////////////////////////////////////////////////////