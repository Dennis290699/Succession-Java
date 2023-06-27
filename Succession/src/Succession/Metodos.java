package Succession;

public class Metodos {

	public String obtenerSucesionSiguiente(int numero) {
		String sucesion = String.valueOf(numero);

		for (int i = numero + 1; i <= numero + 5; i++) {
			sucesion += "-" + i;
		}

		return sucesion;
	}

	public String obtenerSucesionAnterior(int numero) {
		String sucesion = String.valueOf(numero);

		for (int i = numero - 1; i >= numero - 5; i--) {
			sucesion = i + "-" + sucesion;
		}

		return sucesion;
	}

} // FINAL CLASS
