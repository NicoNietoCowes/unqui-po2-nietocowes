package tp3;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp3.Persona;

class PersonaTest {

	private Persona Ricardo;
	private Persona Al; 
	
	@BeforeEach
	void setUp() throws Exception {
		Ricardo = new Persona("Ricardo", 1954, 01, 25);
		Al = new Persona("Al", 2012, 12, 15);
	}

	@Test
	void testEdadRicardo() {
		assertEquals(66, Ricardo.edad());
	}
	
	@Test
	void testEdadAl() {
		assertEquals(7, Al.edad());
	}

	@Test
	void testAlEsMenorQueRicardo() {
		assertTrue(Al.menorQue(Ricardo));
	}
	
}