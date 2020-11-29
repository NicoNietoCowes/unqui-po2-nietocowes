package tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp6.Cliente;
import tp6.Propiedad;
import tp6.SolicitudCreditoHipotecario;
import tp6.SolicitudCreditoPersonal;

class SolicitudCreditoTest {

	private Cliente cliente1;
	private Cliente cliente2;
	private SolicitudCreditoPersonal solicitudP;
	private SolicitudCreditoHipotecario solicitudH;
	private Propiedad propiedadCliente2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		cliente1 = new Cliente("Myles", "Kennedy", "Siempreviva 742", 51, 2500.00);
		cliente2 = new Cliente("Mark", "Tremonti", "Wallaby st 42", 46, 2000.00);
		propiedadCliente2 = new Propiedad("Casa de verano", "Costanera 75", 40000.00);
		solicitudP = new SolicitudCreditoPersonal(cliente1, 4000.00, 4);
		solicitudH = new SolicitudCreditoHipotecario(cliente2, 52800.00, 66, propiedadCliente2);
	}

	@Test
	void testGetCliente() {
		assertEquals(cliente1, solicitudP.getCliente());
	}
	
	@Test
	void testGetMonto() {
		assertEquals(4000, solicitudP.getMonto());
	}
	
	@Test
	void testGetPlazo() {
		assertEquals(4, solicitudP.getPlazo());
	}
	
	@Test
	void testCuota() {
		assertEquals(1000, solicitudP.cuota());
	}
	
	@Test
	void testAprobada() {
		assertTrue(solicitudP.estaAprobada());
	}
	
	@Test
	void testNoEstaAprobada() {
		SolicitudCreditoPersonal solicitud3 = new SolicitudCreditoPersonal(cliente2, 10000.00, 4);
		assertFalse(solicitud3.estaAprobada());
	}

}
