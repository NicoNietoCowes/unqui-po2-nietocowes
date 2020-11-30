package tp9.reproductormp3;

// import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp9.reproductormp3.ReproductorMP3;
import tp9.reproductormp3.Song;

class ReproductorMP3TestCase {
	ReproductorMP3 mp3 = new ReproductorMP3();
	Song cancion = mock(Song.class);
	
	@BeforeEach
	public void setUp() {
		mp3.seleccionarCancion(cancion);
		when(cancion.getName()).thenReturn("Eric Reed - New Morning");
	}
	
	@Test
	void testInicioConSeleccionDeCanciones() {
		assertEquals(
				"Modo Seleccion de Canciones", 
				mp3.displayPantalla());
	}

	@Test
	void testPlaySinErrores() {
		mp3.play();
		verify(cancion).play();
		assertEquals(
				"Se está reproduciendo Eric Reed - New Morning", 
				mp3.displayPantalla());
	}
	
	/** @Test
	void testPlay2VecesConError() {
		mp3.play();
		assertThrows(
				"Ya se está reproduciendo una cancion",
				Reproduciendo.class, mp3.play());
	}
	*/
	
	@Test
	void testPauseCuandoEstaReproduciendo() {
		mp3.play();
		mp3.pause();
		verify(cancion).pause();
		assertEquals(
				"Eric Reed - New Morning se encuentra en pausa",
				mp3.displayPantalla());
	}
	
	@Test
	void testPauseCuandoEstaEnPausa() {
		mp3.play();
		mp3.pause();
		mp3.pause();
		assertEquals(
				"Se está reproduciendo Eric Reed - New Morning", 
				mp3.displayPantalla());
	}
	
	/** @Test
	void testPauseConErrorEnSeleccionCanciones() {
		assertThrows(
				"No hay nada en reproducción",
				SeleccionDeCanciones.class, mp3.pause());
	}
	*/
	
	@Test
	void testStopMientrasEstaEnReproduccion() {
		mp3.play();
		mp3.stop();
		verify(cancion).stop();
		assertEquals(
				"Modo Seleccion de Canciones", 
				mp3.displayPantalla());
	}
	
	@Test
	void testStopMientrasEstaEnPausa() {
		mp3.play();
		mp3.pause();
		mp3.stop();
		assertEquals(
				"Modo Seleccion de Canciones", 
				mp3.displayPantalla());
	}
}
