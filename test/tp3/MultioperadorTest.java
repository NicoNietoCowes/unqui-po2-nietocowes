package tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp3.Multioperador;

class MultioperadorTest {
	
	ArrayList<Integer>ejemplo = new ArrayList<Integer>();
	
	ArrayList<Integer> operandos = new ArrayList<Integer>();
	
	Multioperador multioperador = new Multioperador();
	
	@BeforeEach
	void setUp() throws Exception {
		
		this.multioperador.setOperandos(operandos);
		operandos.add(5);
		operandos.add(2);
		operandos.add(3);
		operandos.add(4);
		ejemplo.add(5);
		ejemplo.add(2);
		ejemplo.add(3);
		ejemplo.add(4);
		
	}

	@Test
	void testConstructor() {
		assertEquals(ejemplo, this.multioperador.getOperandos());
	}
	
	@Test
	void testSumaOperandos() {
		assertEquals(14, this.multioperador.sumaDeOperandos(operandos));
	}
	
	@Test
	void testRestaOperandos() {
		assertEquals(-4, this.multioperador.restaDeOperandos(operandos));
	}

	@Test
	void testMultiplicacionOperandos() {
		assertEquals(120, this.multioperador.multiplicacionDeOperandos(operandos));
	}
}
