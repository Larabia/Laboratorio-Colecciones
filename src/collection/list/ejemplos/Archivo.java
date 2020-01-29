package collection.list.ejemplos;

public class Archivo implements Ejecutable {

	public String mensaje;

	@Override
	public void Ejecutar(String mensaje) {
		System.out.println(mensaje);
	}
}
