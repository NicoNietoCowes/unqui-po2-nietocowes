package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp5.Caja;
import tp5.Producto;
import tp5.ProductoCooperativa;
import tp5.pagosMercado.FacturaImpuesto;
import tp5.pagosMercado.FacturaServicio;

class CajaTest {

	private Caja caja;
	private ProductoCooperativa leche;
	private Producto arroz;
	private Producto pan;
	private FacturaServicio facturaDeLuz;
	private FacturaImpuesto patenteAuto;

	
	
	@BeforeEach
	void setUp() throws Exception {
		caja = new Caja();
		leche = new ProductoCooperativa(30.0, 50);
		arroz = new Producto(20.0, 60);
		pan = new Producto (25.0, 70);
		caja.registrarProducto(leche);
		caja.registrarProducto(arroz);
		caja.registrarProducto(pan);
		facturaDeLuz = new FacturaServicio("Octubre", 2.0, 2000.0);
		patenteAuto = new FacturaImpuesto(1200.0);
		caja.registrarPago(facturaDeLuz);
		caja.registrarPago(patenteAuto);
				
	}

	@Test
	void testMontoTotal() {
		assertEquals(72, caja.getMontoTotal());
	}
	
	@Test
	void testDescontandoStock() {
		assertEquals(49, leche.getStock());
	}
	
	@Test
	void testPagoDeFacturas() {
		assertEquals(5200, caja.getRecaudacionFacturasTotal());
	}

}
