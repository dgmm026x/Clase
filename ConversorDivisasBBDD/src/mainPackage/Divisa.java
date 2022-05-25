/////////////////////////////////////////////////////////////////



package mainPackage;



/////////////////////////////////////////////////////////////////



class Divisa {
	
	private int id;
	private String nombre;
	private double valor;
	
	
	
	Divisa(String n, double v) {
		
		this.nombre = n;
		this.valor = v;
	}



	public int getId() {
		
		return id;
	}
	
	public void setId(int id) {
		
		this.id = id;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public double getValor() {
		
		return valor;
	}
	
	public void setValor(double valor) {
		
		this.valor = valor;
	}
}



/////////////////////////////////////////////////////////////////