package tp8.cultivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CultivosTestCase {
	/** Voy a tomar el ejemplo dado en el ejercicio, en el cual el sistema cuenta con 4 regiones, 2 con cultivos soja, 1 con trigo y 1 con 
	 *  un cultivo subdividido entre 2 de soja y 2 de trigo. */
	Soja cultivoSoja = new Soja();
	Trigo cultivoTrigo = new Trigo();
	CultivoMixto cultivoMixto = new CultivoMixto();
	
	/** SETUP */
	@BeforeEach
	public void setUp() {
		cultivoMixto.addCultivo(cultivoSoja);
		cultivoMixto.addCultivo(cultivoSoja);
		cultivoMixto.addCultivo(cultivoTrigo);
		cultivoMixto.addCultivo(cultivoTrigo);
	}
	
	@Test
	void testGananciaAnualTotal4Regiones() {
		/** EXCERCISE */
		double totalDeGanancias = cultivoSoja.getGananciaAnual() + cultivoSoja.getGananciaAnual() + cultivoTrigo.getGananciaAnual()
									+ cultivoMixto.getGananciaAnual();
		/** VERIFY */
		assertEquals(1700d, totalDeGanancias);
	}

}
