package tp9.reproductormp3;

public class ReproductorMP3 {
	private Song cancionActual;
	private ModoMP3 modo;
	
	public ReproductorMP3() {
		this.modo = new SeleccionDeCanciones(this);
	}
	
	public void play() {
		this.modo.play();
	}
	
	public void pause() {
		this.modo.pause();
	}
	
	public void stop() {
		this.modo.stop();
	}
	
	public Song getCancionActual() {
		return this.cancionActual;
	}
	
	public void seleccionarCancion(Song cancionSeleccionada) {
		this.cancionActual = cancionSeleccionada;
	}
	
	public void actualizarModo(ModoMP3 nuevoModo) {
		this.modo = nuevoModo;
	}
	
	public String displayPantalla() {
		return this.modo.displayPantalla();
	}
}
