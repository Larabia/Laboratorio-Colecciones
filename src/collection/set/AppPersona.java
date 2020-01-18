package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class AppPersona {
	
public static void main(String[] args) {
		
		HashSet<Persona>hash = new HashSet<Persona>();
		System.out.println("Size: " + hash.size());
		
		
		
		Persona p1 = new Persona ("Marta","123456");
		System.out.println(p1.hashCode());
		hash.add(p1);
		System.out.println("Size: " + hash.size());
		
		
		Persona p2 = new Persona ("Pablo","23456");
		System.out.println(p2.hashCode());
		hash.add(p2);
		System.out.println("Size: " + hash.size());
		
		hash.add(p2);
		System.out.println("Size: " + hash.size());


		
		
		//recorrer set
		Iterator<Persona> it = hash.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
