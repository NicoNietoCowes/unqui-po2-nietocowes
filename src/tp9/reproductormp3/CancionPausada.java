package tp9.reproductormp3;

public class CancionPausada extends ModoMP3 {

	public CancionPausada(ReproductorMP3 mp3Ref) {
		super(mp3Ref);
	}

	@Override
	public void play() {
		// Tambien debo generar un error
	}

	@Override
	public void pause() {
		this.mp3.getCancionActual().play();
		this.mp3.actualizarModo(new Reproduciendo(mp3));
	}

	@Override
	public void stop() {
		this.mp3.getCancionActual().stop();
		this.mp3.actualizarModo(new SeleccionDeCanciones(mp3));
	}

	@Override
	public String displayPantalla() {
		return this.mp3.getCancionActual().getName() + " se encuentra en pausa";
	}

}
