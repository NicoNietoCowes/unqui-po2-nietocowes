package tp9.videojuego;

public class MaquinaVideoJuego {
	private String nombreVideoJuego;
	private ModoMaquina modo;
	
	public MaquinaVideoJuego(String nombreVideoJuego) {
		this.nombreVideoJuego = nombreVideoJuego;
		this.modo = new ModoInicio(this);
	}
	
	public void actualizarModo(ModoMaquina nuevoModo) {
		this.modo = nuevoModo;
	}
	
	public void iniciarJuego() {
		this.modo.iniciarJuego();
	}
	
	public void terminarJuego() {
		this.modo.terminarJuego();
	}
	
	public void ingresarFicha() {
		this.modo.ingresarFicha();
	}
	
	/** Este m�todo simula lo que se estar�a
	 * constantemente mostrando por la pantalla de la maquina.
	 * (Salvo cuando se est� jugando) */
	public String displayPantalla() {
		return this.modo.displayPantalla();
	}
}
