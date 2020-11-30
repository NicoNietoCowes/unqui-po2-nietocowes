package tp9.encriptacion;

public class EncriptacionVocal extends ModoEncriptacion {

	/** Por el momento esta es la primera solución posible que se me ocurre, si bien 
	 * funciona no hace uso de estrategias "objetosas". */
	
	private char encriptarChar(char ch) {
		// se puede cambiar por un map
		char r;
		switch (ch) {
		case 'a' : r = 'e'; break;
		case 'e' : r = 'i'; break;
		case 'i' : r = 'o'; break;
		case 'o' : r = 'u'; break;
		case 'u' : r = 'a'; break;
		default  : r = ch; 
		}
		return r;
	}

	@Override
	public String desencriptar(String textoADesencriptar) {
		String textoEncriptado = "";
		for (char ch : textoADesencriptar.toCharArray()) {
			String c = String.valueOf(this.desencriptarChar(ch));
			textoEncriptado = textoEncriptado.concat(c);
		}
		return textoEncriptado;
	}
	
	private char desencriptarChar(char ch) {
		char r;
		switch (ch) {
		case 'a' : r = 'u'; break;
		case 'e' : r = 'a'; break;
		case 'i' : r = 'e'; break;
		case 'o' : r = 'i'; break;
		case 'u' : r = 'o'; break;
		default  : r = ch; 
		}
		return r;
	}

	@Override
	public String valorAStringEncriptado(char valorAEncriptar) {
		return String.valueOf(this.encriptarChar(valorAEncriptar));
	}

}
