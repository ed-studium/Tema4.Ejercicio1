package es.Studium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaBlancaFor {

	@Test
	void testCamino2() {
		String resultadoEsperado = "1 x 7 = 7\n2 x 7 = 14\n3 x 7 = 21\n4 x 7 = 28\n5 x 7 = 35\n6 x 7 = 42\n7 x 7 = 49\n8 x 7 = 56\n9 x 7 = 63\n10 x 7 = 70\n";
		String resultadoReal= Ejercicio1For.tablaDeMultiplicar(7);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
