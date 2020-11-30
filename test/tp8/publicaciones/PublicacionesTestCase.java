package tp8.publicaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PublicacionesTestCase {
	
	/** Para simplificar los casos de testeo tengo que dejar de lado los Tests Doubles y usar 
	 * las clases concretas. 
	 * Además los casos de testeo se verán reducidos. */
	
	SistemaPublicacion sistema = new SistemaPublicacion();
	Investigador investigador1 = new Investigador("Cowes", sistema);
	Investigador investigador2 = new Investigador("Aquin", sistema);
	
	Publicacion publicSmallTalk = new Publicacion(
			"SmallTalk, una herramienta para objetosos",
			Arrays.asList("Wirfs", "Brock"),
			Arrays.asList("Universidad"),
			"Educativo",
			"Universidad de Quilmes",
			Arrays.asList("SmallTalk", "Objetos", "Programacion")
			);
	Publicacion publicBiologia = new Publicacion(
			"Felinos",
			Arrays.asList("Murphy"),
			Arrays.asList("Universidad", "Ciencias Naturales"),
			"Educativo",
			"UBA",
			Arrays.asList("Animales", "Carnivoros")
			);
	
	FiltroPorTitulo filtroTitulo = new FiltroPorTitulo();
	FiltroPorPalabraClave filtroKey = new FiltroPorPalabraClave();
	
	@Test
	void testCargarPublicaciones() {
		investigador1.cargarPublicacion(publicBiologia);
		assertEquals(1, sistema.getPublicaciones().size());
	}
	
	@Test
	void testSuscripcion() {
		investigador1.suscribirse(filtroTitulo, "prueba");
		assertEquals(1, sistema.getFiltros().size());
	}
	
	@Test
	void testNotificacionSmallTalk() {
		investigador1.suscribirse(filtroKey, "SmallTalk");
		assertFalse(investigador1.estaNotificado());
		// Se suscribe pero aun no fue notificado porque no hay publicaciones.
		
		investigador2.cargarPublicacion(publicSmallTalk);
		assertTrue(investigador1.estaNotificado());
		// Fue notificado luego de que se cargó la publicación de su interés.
	}

	@Test
	void testSinNotificacionSolid() {
		investigador1.suscribirse(filtroTitulo, "Principios Solid");
		assertFalse(investigador1.estaNotificado());
		// Se suscribe pero aun no fue notificado porque no hay publicaciones.
		
		investigador2.cargarPublicacion(publicSmallTalk);
		assertFalse(investigador1.estaNotificado());
		// Se cargó una publicacion pero como no es de su interés sigue sin ser notificado.
		}
	
	@Test
	void testFiltroTituloFelinos() {
		investigador2.suscribirse(filtroTitulo, "Felinos");
		assertFalse(investigador2.estaNotificado());
		// Se suscribe pero aun no fue notificado porque no hay publicaciones.
		
		investigador1.cargarPublicacion(publicBiologia);
		assertTrue(investigador2.estaNotificado());
		// Fue notificado luego de que se cargó la publicación de su interés.
	}
}
