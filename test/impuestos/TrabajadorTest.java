package impuestos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	
	private Trabajador trabajador;
	private Ingreso ingresoSeptiembre;
	private Ingreso ingresoOctubre;
	private Ingreso ingresoExtraOctubre;
	
	@BeforeEach
	void setUp() throws Exception {
		ingresoSeptiembre = new Ingreso(9, "Sueldo basico", 7000);
		ingresoOctubre = new Ingreso(10, "Sueldo basico", 7000);
		ingresoExtraOctubre = new IngresoHorasExtra(6 ,10, "Horas extra", 600);
		trabajador = new Trabajador();
		trabajador.addIngreso(ingresoSeptiembre);
		trabajador.addIngreso(ingresoOctubre);
		trabajador.addIngreso(ingresoExtraOctubre);
	}

	@Test
	void testTotalPercibido() {
		assertEquals(14600, trabajador.getTotalPercibido());
	}
	
	@Test
	void testMontoImponible() {
		assertEquals(14000, trabajador.getMontoImponible());
	}
	
	@Test
	void testImpuestoAPagar() {
		assertEquals(280, trabajador.getImpuestoAPagar());
	}

}
