package Succession;

public class Principal {

	public static void main(String[] args) {
		Metodos metodos = new Metodos();
		int opcion;

		do {
			imprimirMenu();
			opcion = Integer.parseInt(System.console().readLine());

			switch (opcion) {
			case 1:
				System.out.print("Ingrese un numero entero: ");
				int numeroSiguiente = Integer.parseInt(System.console().readLine());
				String sucesionSiguiente = metodos.obtenerSucesionSiguiente(numeroSiguiente);
				System.out.println("Sucesion siguiente: " + sucesionSiguiente);
				break;
			case 2:
				System.out.print("Ingrese un numero entero: ");
				int numeroAnterior = Integer.parseInt(System.console().readLine());
				String sucesionAnterior = metodos.obtenerSucesionAnterior(numeroAnterior);
				System.out.println("Sucesion anterior: " + sucesionAnterior);
				break;
			case 3:
				System.out.print("Ingrese un numero entero: ");
				int numeroAmbos = Integer.parseInt(System.console().readLine());
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
