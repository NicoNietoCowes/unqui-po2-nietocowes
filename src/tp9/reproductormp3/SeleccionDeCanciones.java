package tp9.reproductormp3;

public class SeleccionDeCanciones extends ModoMP3 {

	public SeleccionDeCanciones(ReproductorMP3 mp3Ref) {
		super(mp3Ref);
	}

	@Override
	public void play() {
		this.mp3.getCancionActual().play();
		this.mp3.actualizarModo(new Reproduciendo(mp3));
	}

	@Override
	public void pause() {
		// Como puedo hacer para que tire un error?
	}

	@Override
	public void stop() {
		// En este caso no hace nada
	}

	@Override
	public String displayPantalla() {
		return "Modo Seleccion de Canciones";
	}

}
