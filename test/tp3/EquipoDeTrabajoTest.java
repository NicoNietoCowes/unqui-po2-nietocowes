package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp3.EquipoDeTrabajo;
import tp3.Persona;

class EquipoDeTrabajoTest {
	
	private EquipoDeTrabajo equipo;
	private Persona Ricardo;
	private Persona Al;
	private Persona Pato;
	private Persona SrX;
	private Persona Pachu;
	
	@BeforeEach
	void setUp() throws Exception {
		equipo = new EquipoDeTrabajo("Equipo Rojo");
		Ricardo = new Persona("Ricardo", 1954, 1, 25);
		Al = new Persona("Al", 2012, 12, 15);
		Pato = new Persona("Pato", 1970, 4, 1);
		SrX = new Persona("SrX", 1980, 2, 17);
		Pachu = new Persona("Pachu", 1968, 7, 21);
		equipo.add(Ricardo);
		equipo.add(Al);
		equipo.add(Pato);
		equipo.add(SrX);
		equipo.add(Pachu);
		
	}

	@Test
	void testElEquipoSabeResponderSuNombre() {
		assertEquals("Equipo Rojo", equipo.nombre());
	}
	
	@Test
	void testElEquipoSabeResponderElPromedioDeEdadDeLosIntegrantes() {
		assertEquals(43, equipo.promedioEdades());
	}

}
