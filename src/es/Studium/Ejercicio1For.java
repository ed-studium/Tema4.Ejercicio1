package es.Studium;

public class Ejercicio1For {

public static String tablaDeMultiplicar(int numero) {
	String resultado = "";
	for (int i = 1; i <= 10; i++) {
		resultado += i + " x " + numero + " = " + i * numero + "\n";
	}
	return resultado;
}
}
