package tp9.encriptacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp9.encriptacion.EncriptacionNumero;
import tp9.encriptacion.EncriptacionVocal;
import tp9.encriptacion.EncriptadorNaive;

class EncriptadorNaiveTestCase {
	/** En este caso se testeara el funcionamiento de los dos
	 *  tipos de encriptadores directamente, para simplificar los 
	 *  casos de testeo. */
	
	EncriptadorNaive encriptador = new EncriptadorNaive();
	EncriptacionVocal modo1 = new EncriptacionVocal();
	EncriptacionNumero modo2 = new EncriptacionNumero();
	
	@BeforeEach
	public void setUp() {
		encriptador.seleccionarModo(modo1);
	}
		
	
	@Test
	void testEncriptarVocal() {
		assertEquals("tumes", encriptador.encriptar("tomas"));
	}

	@Test
	void testDesencriptarVocal() {
		assertEquals("bianca", encriptador.desencriptar("boence"));
	}
	
	@Test
	void testEncriptarNumero() {
		encriptador.seleccionarModo(modo2);
		assertEquals("20,15,13,1,19", encriptador.encriptar("tomas"));
	}
	
	@Test
	void testDesencriptarNumero() {
		encriptador.seleccionarModo(modo2);
		assertEquals("bianca", encriptador.desencriptar("2,9,1,14,3,1"));
	}
}
