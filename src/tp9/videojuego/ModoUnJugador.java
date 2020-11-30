package tp9.videojuego;

public class ModoUnJugador extends ModoMaquina {

	public ModoUnJugador(MaquinaVideoJuego juegoRef) {
		super(juegoRef);
	}

	@Override
	public void ingresarFicha() {
		this.juego.actualizarModo(new ModoMultijugador(juego));
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
		return "Modo un jugador, iniciar juego o ingresar ficha extra para modo multijugador";
	}

}
