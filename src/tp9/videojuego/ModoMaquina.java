package tp9.videojuego;

public abstract class ModoMaquina {
	protected MaquinaVideoJuego juego;
	
	public ModoMaquina(MaquinaVideoJuego juegoRef) {
		this.juego = juegoRef;
	}
	
	public abstract void ingresarFicha();
	public abstract void iniciarJuego();
	public abstract void terminarJuego();
	public abstract String displayPantalla();
}
