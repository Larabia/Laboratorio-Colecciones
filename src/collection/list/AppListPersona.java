package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class AppListPersona {
	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();
		String nombre = " ";
		String dni = " ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre (. para terminar)");
		nombre = sc.next();
	
		while (!nombre.equals(".")) {
			while (! ".".equals(nombre)) {
				System.out.println("Ingrese dni:");
				dni = sc.next();
				Persona p = new Persona(nombre, dni);
				lista.add(p);
				System.out.println("Elemento agregado correctamente. Lista " + lista.size());
				System.out.println("Ingrese nombre (. para terminar)");
				nombre = sc.next();
				
			} 
			
			for (Persona ItemPersona :lista)
				System.out.println(ItemPersona);
			}
	}
}



