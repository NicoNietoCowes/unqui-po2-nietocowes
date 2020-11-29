package tp3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp3.Rectangulo;

class RectanguloTest {

	private Rectangulo rectanguloHorizontal;
	private Rectangulo rectanguloVertical;
	
	@BeforeEach
	void setUp() throws Exception {
		rectanguloHorizontal = new Rectangulo(4,2);
		rectanguloVertical = new Rectangulo(3,6);
	}

	@Test
	void testContructorEn4deBasey2DeAltura() {
		assertTrue("no son iguales", rectanguloHorizontal.esIgual((new Rectangulo(4,2))));
	}

	@Test
	void testAreaEn4deBasey2DeAltura() {
		assertEquals(8, rectanguloHorizontal.area());
	}
	
	@Test
	void testPerimetroEn4deBasey2DeAltura() {
		assertEquals(12, rectanguloHorizontal.perimetro());
	}
	
	@Test
	void test4deBasey2DeAlturaEsHorizontal() {
		assertTrue("no es horizontal", rectanguloHorizontal.esHorizontal());
	}
	
	@Test
	void test3deBasey6DeAlturaEsVertical() {
		assertTrue("no es horizontal", rectanguloVertical.esVertical());
	}
	
}
