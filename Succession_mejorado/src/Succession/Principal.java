package Succession;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Metodos metodos = new Metodos();
		Scanner tec = new Scanner(System.in);
		int opcion;

		do {
			imprimirMenu();
			opcion = tec.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Ingrese un numero entero: ");
				int numeroSiguiente = tec.nextInt();
				String sucesionSiguiente = metodos.obtenerSucesionSiguiente(numeroSiguiente);
				System.out.println("Sucesion siguiente: " + sucesionSiguiente);
				break;
			case 2:
				System.out.print("Ingrese un numero entero: ");
				int numeroAnterior = tec.nextInt();
				String sucesionAnterior = metodos.obtenerSucesionAnterior(numeroAnterior);
				System.out.println("Sucesion anterior: " + sucesionAnterior);
				break;
			case 3:
				System.out.print("Ingrese un numero entero: ");
				int numeroAmbos = tec.nextInt();
				String sucesionSiguienteAmbos = metodos.obtenerSucesionSiguiente(numeroAmbos);
				String sucesionAnteriorAmbos = metodos.obtenerSucesionAnterior(numeroAmbos);
				System.out.println("Sucesion siguiente: " + sucesionSiguienteAmbos);
				System.out.println("Sucesion anterior: " + sucesionAnteriorAmbos);
				break;
			case 4:
				System.out.println("Hasta luego!");
				break;
			default:
				System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
				break;
			}

			System.out.println();
		} while (opcion != 4);

		tec.close();
	}

	public static void imprimirMenu() {
		System.out.println("Seleccione una opcion:");
		System.out.println("1. Mostrar sucesion siguiente");
		System.out.println("2. Mostrar sucesion anterior");
		System.out.println("3. Mostrar ambos metodos");
		System.out.println("4. Salir");
		System.out.print("Ingrese el numero de la opcion deseada: ");
	}

} // FINAL CLASS
