package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 30, 11, false);
		arroz = new ProductoPrimeraNecesidad("Arroz", 20, 8, false);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(26.7), leche.getPrecio());
	}
	
	@Test
	public void testCalcularPrecioConDistintoPorcentaje() {
		assertEquals(new Double(18.400000000000002), arroz.getPrecio());
	}
}
