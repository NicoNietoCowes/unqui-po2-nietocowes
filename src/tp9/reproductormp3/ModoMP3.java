package tp9.reproductormp3;

public abstract class ModoMP3 {
	protected ReproductorMP3 mp3;
	
	public ModoMP3(ReproductorMP3 mp3Ref) {
		this.mp3 = mp3Ref;
	}
	
	public abstract void play();
	public abstract void pause();
	public abstract void stop();
	public abstract String displayPantalla();
}
