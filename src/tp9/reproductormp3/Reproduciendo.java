package tp9.reproductormp3;

public class Reproduciendo extends ModoMP3 {

	public Reproduciendo(ReproductorMP3 mp3Ref) {
		super(mp3Ref);
	}

	@Override
	public void play() {
		// Como puedo hacer para que tire error?
	}

	@Override
	public void pause() {
		this.mp3.getCancionActual().pause();
		this.mp3.actualizarModo(new CancionPausada(mp3));
	}

	@Override
	public void stop() {
		this.mp3.getCancionActual().stop();
		this.mp3.actualizarModo(new SeleccionDeCanciones(mp3));
	}

	@Override
	public String displayPantalla() {
		return "Se está reproduciendo " + this.mp3.getCancionActual().getName();
	}

}
