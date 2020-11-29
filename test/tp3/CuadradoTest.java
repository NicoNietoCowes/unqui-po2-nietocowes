package tp3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp3.Cuadrado;

class CuadradoTest {
	
	private Cuadrado cuadrado;
	
	@BeforeEach
	void setUp() throws Exception {
		cuadrado = new Cuadrado(3);
	}


	@Test
	void testContructor() {
		assertTrue("no son iguales", cuadrado.esIgual(new Cuadrado(3)));
	}
	
	@Test
	void testArea() {
		assertEquals(9, cuadrado.area());
	}
	
	@Test
	void testPerimetro() {
		assertEquals(12, cuadrado.perimetro());
	}
	
}
