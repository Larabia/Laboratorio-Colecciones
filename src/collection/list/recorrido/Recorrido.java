package collection.list.recorrido;

public abstract class Recorrido {
	
	protected String tipo;
	protected String origen;
	protected String destino;
	protected float precio;
	

	public Recorrido(String tipo, String origen, String destino, float precio) {
		super();
		this.tipo = tipo;
		this.origen = origen;
		this.destino = destino;
		this.precio = precio;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	
	

	
	

	

	

}

