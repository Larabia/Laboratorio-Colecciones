package collection.list.recorrido;


import java.util.ArrayList;
import java.util.Scanner;

public class AppRecorrido {

	public static void main(String[] args) {
		
		System.out.println("AGENDA SEMANAL DE RECORRIDOS");
		System.out.println("============================");

		ArrayList <ArrayList<Recorrido>> semana = new ArrayList <ArrayList<Recorrido>>();
		String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" };
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Recorridos para el dia " + dias[i]);
			System.out.println("Ingrese tipo de recorrido 1.Transpote| 2.Turismo| 3.Terminar");
			int opcion = scan.nextInt();
			 scan.nextLine();
			 semana.add(new ArrayList<Recorrido>());

			while (opcion != 3) {

				System.out.println("Ingresar origen: ");
				String or = scan.nextLine();
				System.out.println("Ingresar destino: ");
				String des = scan.nextLine();
				System.out.println("Ingresar precio: ");
				float pre = scan.nextFloat();
				 scan.nextLine();
				/*float pre = 100;*/

				switch (opcion) {
				case 1: {
					
					String tipo = "TRANSPORTE";
					semana.get(i).add(new Transporte (tipo, or, des, pre));
					
					break;
				}
				case 2: {

					System.out.println("Ingresar nombre: ");
					String nom = scan.nextLine();
					String tipo = "TURISTICO";
					
					semana.get(i).add(new Turistico (tipo, or, des, pre, nom));
					break;
				}
				
				default:
					break;
				}
				
			System.out.println("Ingrese tipo de recorrido 1.Transpote| 2.Turismo| 3.Terminar");
				opcion = scan.nextInt();
				scan.nextLine();

			}

		}
		
		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
			System.out.println(semana.get(i));

			/*if (semana.get(i) instanceof Turistico) {
				System.out.print(" (TURISTICO)");
			}
			else {
				System.out.print(" (TRANSPORTE)");
			}*/
			
		}

	}

}
