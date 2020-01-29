package collection.list.ejemplos;

import java.util.ArrayList;

public class Cliente implements Ordenable {
	
	private int ID;
	private String nombre;
	private ArrayList<String> cuentas = new ArrayList();

	public void agregarCuenta(String cuenta) {
		cuentas.add(cuenta);
		cuentas.size();
	}
	public void OrdenarPorCodigo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void OrdenarPorAlfabeto() {
		// TODO Auto-generated method stub
		
	}

	
}
