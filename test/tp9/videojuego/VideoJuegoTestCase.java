package tp9.videojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tp9.videojuego.MaquinaVideoJuego;

class VideoJuegoTestCase {

	/** En esta suite de tests solo se corrobora
	 * que el cambio de estado se hace efectivo, esto 
	 * se logra mediante el .displayPantalla que va a devolver 
	 * una cadena de texto diferente frente a distintos estados
	 * en los que se puede encontrar una MaquinaVideoJuego. */
	MaquinaVideoJuego snowBros = new MaquinaVideoJuego("SnowBros");
	
	@Test
	void testEncedidoDeMaquinaEnModoInicio() {
		/** Cuando se crea la clase MaquinaVideoJuego se 
		 * inicia siempre con el estado ModoInicio. */
		assertEquals(
				"Modo inicio de juego, por favor ingresar fichas | 1 ficha = 1 jugador | 2 fichas = 2 jugadores",
				snowBros.displayPantalla());
	}
	
	@Test
	void testUnJugadorLuegoDeIngresarFicha() {
		snowBros.ingresarFicha();
		assertEquals(
				"Modo un jugador, iniciar juego o ingresar ficha extra para modo multijugador",
				snowBros.displayPantalla());	
	}

	@Test
	void testModoInicioLuegoDeTerminarDeJugar1Jugador() {
		snowBros.ingresarFicha();
		assertEquals(
				"Modo un jugador, iniciar juego o ingresar ficha extra para modo multijugador",
				snowBros.displayPantalla());
		snowBros.iniciarJuego();
		assertEquals(
				"Modo inicio de juego, por favor ingresar fichas | 1 ficha = 1 jugador | 2 fichas = 2 jugadores",
				snowBros.displayPantalla());	
	}
	
	@Test
	void testModoMultijugador() {
		snowBros.ingresarFicha();
		assertEquals(
				"Modo un jugador, iniciar juego o ingresar ficha extra para modo multijugador",
				snowBros.displayPantalla());
		snowBros.ingresarFicha();
		assertEquals(
				"Modo dos jugadores, iniciar juego",
				snowBros.displayPantalla());	
	}
	
	@Test
	void testModoInicioLuegoDeTerminarDeJugar2Jugadores() {
		snowBros.ingresarFicha();
		assertEquals(
				"Modo un jugador, iniciar juego o ingresar ficha extra para modo multijugador",
				snowBros.displayPantalla());
		
		snowBros.ingresarFicha();
		assertEquals(
				"Modo dos jugadores, iniciar juego",
				snowBros.displayPantalla());
		
		snowBros.iniciarJuego();
		assertEquals(
				"Modo inicio de juego, por favor ingresar fichas | 1 ficha = 1 jugador | 2 fichas = 2 jugadores",
				snowBros.displayPantalla());	
	}
}
