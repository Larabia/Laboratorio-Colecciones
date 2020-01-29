package collection.list.ejemplos;

import java.util.ArrayList;

public class AppList {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		System.out.println("Tasmano lista " + lista.size());
		lista.add("item1");
		lista.add("item2");		
		lista.add("item3");		
		lista.add("item4");		
		lista.add("item5");
		
		
		for (int i = 0; i < lista.size(); i++) {
		
		System.out.println("Se agrega el elemento " + lista.get(i));
		System.out.println("Tamano lista " + lista.size());
		
		}
		
		System.out.println("Eliminar el elemento " + lista.remove(0));
		System.out.println("Tamano lista " + lista.size());
	}

}
