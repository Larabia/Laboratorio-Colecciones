package collection.list.recorrido;

public class Transporte extends Recorrido {

	public Transporte(String tipo, String origen, String destino, float precio) {
		super(tipo, origen, destino, precio);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "tipo: " + tipo + "\n" + "origen: " + origen + "\n" + "destino: " + destino + "\n" + "precio: " + precio
				+ "\n" + "--------------------------" + "\n";
	}

}
