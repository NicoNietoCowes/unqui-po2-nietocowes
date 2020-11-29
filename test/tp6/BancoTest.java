package tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp6.Banco;
import tp6.Cliente;
import tp6.Propiedad;
import tp6.SolicitudCreditoHipotecario;
import tp6.SolicitudCreditoPersonal;

class BancoTest {

	private Banco banco;
	private Cliente cliente1;
	private Cliente cliente2;
	private SolicitudCreditoPersonal solicitudP;
	private SolicitudCreditoHipotecario solicitudH;
	private Propiedad propiedadCliente2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		banco = new Banco();
		cliente1 = new Cliente("Myles", "Kennedy", "Siempreviva 742", 51, 2500.00);
		cliente2 = new Cliente("Mark", "Tremonti", "Wallaby st 42", 46, 2000.00);
		banco.registrarCliente(cliente1);
		propiedadCliente2 = new Propiedad("Casa de verano", "Costanera 75", 40000.00);
		solicitudP = new SolicitudCreditoPersonal(cliente1, 4000.00, 4);
		solicitudH = new SolicitudCreditoHipotecario(cliente2, 20000.00, 40, propiedadCliente2);
		banco.registrarSolicitudCredito(solicitudP);
		banco.registrarSolicitudCredito(solicitudH);
	}

	@Test
	void testRegistrarClientes() {
		assertEquals(1, banco.getClientes().size());
	}
	
	@Test
	void testRegistrarSolicitudDeCredito() {
		assertEquals(2, banco.getSolicitudesDeCredito().size());
	}
	
	@Test
	void testCantidadDeDineroADesembolsar() {
		SolicitudCreditoPersonal solicitud3 = new SolicitudCreditoPersonal(cliente2, 8000.00, 4); 
		banco.registrarSolicitudCredito(solicitud3);
		assertEquals(24000.00, banco.montoTotalADesembolsar());
	}
	
}
