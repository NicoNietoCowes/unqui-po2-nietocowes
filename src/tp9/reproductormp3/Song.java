package tp9.reproductormp3;

public class Song {
	private String nombre;
	
	public Song(String nombreCancion) {
		this.nombre = nombreCancion;
	}
	
	/** M�todos que no tienen importancia, solo est�n para probar. */
	public void play() {}
	public void pause() {}
	public void stop() {}
	
	public String getName() {
		return this.nombre;
	}
}
