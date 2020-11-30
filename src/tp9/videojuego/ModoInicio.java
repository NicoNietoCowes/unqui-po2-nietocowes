package tp9.videojuego;

public class ModoInicio extends ModoMaquina {

	public ModoInicio(MaquinaVideoJuego juegoRef) {
		super(juegoRef);
	}

	@Override
	public void ingresarFicha() {
		this.juego.actualizarModo(new ModoUnJugador(juego));
	}

	@Override
	public void iniciarJuego() {
		// ERROR: no se puede iniciar el juego sin fichas ingresadas.
	}

	@Override
	public void terminarJuego() {
		// ERROR: no se puede finalizar el juego si nunca se empezó.
	}

	@Override
	public String displayPantalla() {
		return "Modo inicio de juego, por favor ingresar fichas | 1 ficha = 1 jugador | 2 fichas = 2 jugadores";
	}

}
