package tp9.reproductormp3;

public class Song {
	private String nombre;
	
	public Song(String nombreCancion) {
		this.nombre = nombreCancion;
	}
	
	/** Métodos que no tienen importancia, solo están para probar. */
	public void play() {}
	public void pause() {}
	public void stop() {}
	
	public String getName() {
		return this.nombre;
	}
}
