package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import collection.list.Persona;

public class AppMapEjercicioAuto {
	
	public static void main(String[] args) {
		HashMap<String, Auto> mapa = new HashMap<String, Auto>();
	
		String patente1 = "lg123";
		Auto auto1 = new Auto(patente1, "gol");
		mapa.put(patente1, auto1);
		
		
		String patente2 = "mg234";
		Auto auto2 = new Auto(patente2, "fiesta");
		mapa.put(patente2, auto2);

		
		Set<String> setKeyMapa = mapa.keySet();
		Iterator<String> it = setKeyMapa.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("key: " + key);
			System.out.println("value: " + mapa.get(key).getModelo());
			System.out.println("mapa.size() " + mapa.size());
			
		}
	}

}