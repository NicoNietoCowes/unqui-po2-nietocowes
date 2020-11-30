package tp9.encriptacion;

public abstract class ModoEncriptacion {

	public String encriptar(String textoAEncriptar) {
		String textoEncriptado = "";
		for (char ch : textoAEncriptar.toCharArray()) {
			String c = this.valorAStringEncriptado(ch);
			textoEncriptado = textoEncriptado.concat(c);
		}
		return textoEncriptado;
	}
	
	public abstract String valorAStringEncriptado(char valorAEncriptar);
	// En base a un valor a encriptar de tipo char delega en los encriptadores como estos tienen que transformarlo en un string.
	
	public abstract String desencriptar(String textoADesencriptar);
	// El .desencriptar sigue siendo abstracto porque ambos encriptadores operan de forma distinta en este punto.
}
