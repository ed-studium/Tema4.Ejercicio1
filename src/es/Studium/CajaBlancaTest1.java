package es.Studium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaBlancaTest1 {

	@Test
	void testCamino1() {
		boolean resultadoReal = EsPar.esPar(2);
		boolean resultadoEsperado = true;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testCamino2() {
		boolean resultadoReal = EsPar.esPar(1);
		boolean resultadoEsperado = false;
		assertEquals(resultadoReal, resultadoEsperado);
	}

}