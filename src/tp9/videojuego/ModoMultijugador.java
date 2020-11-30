package tp9.videojuego;

public class ModoMultijugador extends ModoMaquina {

	public ModoMultijugador(MaquinaVideoJuego juegoRef) {
		super(juegoRef);
	}

	@Override
	public void ingresarFicha() {
		// ERROR: ya no se pueden ingresar mas fichas.
	}

	@Override
	public void iniciarJuego() {
		// Se empieza el juego y en algún momento termina.
		this.terminarJuego();
	}

	@Override
	public void terminarJuego() {
		this.juego.actualizarModo(new ModoInicio(juego));
	}

	@Override
	public String displayPantalla() {
		return "Modo dos jugadores, iniciar juego";
	}

}
