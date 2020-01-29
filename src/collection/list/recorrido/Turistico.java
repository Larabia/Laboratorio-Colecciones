package collection.list.recorrido;

public class Turistico extends Recorrido {

	private String nombre;

	public Turistico(String tipo, String origen, String destino, float precio, String nombre) {
		super(tipo, origen, destino, precio);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "tipo: " + tipo + "\n" + "Nombre: " + nombre + "\n" + "origen: " + origen + "\n" + "destino: " + destino
				+ "\n" + "precio: " + precio + "\n" + "--------------------------" + "\n";
	}

}
