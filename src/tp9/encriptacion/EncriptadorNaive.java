package tp9.encriptacion;

public class EncriptadorNaive {
	private ModoEncriptacion modoEncriptacion;
	
	public String encriptar(String textoAEncriptar) {
		return this.modoEncriptacion.encriptar(textoAEncriptar);
	}
	
	public String desencriptar(String textoADesencriptar) {
		return this.modoEncriptacion.desencriptar(textoADesencriptar);
	}
	
	public void seleccionarModo(ModoEncriptacion modoNuevo) {
		this.modoEncriptacion = modoNuevo;
	}
}
