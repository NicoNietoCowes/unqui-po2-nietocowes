package tp9.encriptacion;

public class EncriptacionNumero extends ModoEncriptacion {

	/** Sucede lo mismo que con el EncriptacionVocal, solo que es peor porque se extienden 
	 * mucho los casos. */
	
	@Override
	public String encriptar(String textoAEncriptar) {
		String textoEncriptado = super.encriptar(textoAEncriptar);
		// Solo varían el método abstracto y la operación final del return.
		return textoEncriptado.substring(0, textoEncriptado.length() -1);
	}

	private String encriptarCharAStr(char ch) {
		String r = "";
		switch (ch) {
		case 'a' : r = "1,"; break;
		case 'b' : r = "2,"; break;
		case 'c' : r = "3,"; break;
		case 'd' : r = "4,"; break;
		case 'e' : r = "5,"; break;
		case 'f' : r = "6,"; break;
		case 'g' : r = "7,"; break;
		case 'h' : r = "8,"; break;
		case 'i' : r = "9,"; break;
		case 'j' : r = "10,"; break;
		case 'k' : r = "11,"; break;
		case 'l' : r = "12,"; break;
		case 'm' : r = "13,"; break;
		case 'n' : r = "14,"; break;
		case 'o' : r = "15,"; break;
		case 'p' : r = "16,"; break;
		case 'q' : r = "17,"; break;
		case 'r' : r = "18,"; break;
		case 's' : r = "19,"; break;
		case 't' : r = "20,"; break;
		case 'u' : r = "21,"; break;
		case 'v' : r = "22,"; break;
		case 'w' : r = "23,"; break;
		case 'x' : r = "24,"; break;
		case 'y' : r = "25,"; break;
		case 'z' : r = "26,"; break;
		}
		return r;
	}
	
	@Override
	public String desencriptar(String textoADesencriptar) {
		String[] textoSpliteado = textoADesencriptar.split(",");
		String textoDesencriptado = "";
		for (String str : textoSpliteado) {
			String strD = this.desencriptarStr(str);
			textoDesencriptado = textoDesencriptado.concat(strD);
		}
		return textoDesencriptado;
	}

	private String desencriptarStr(String str) {
		String r = "";
		switch (str) {
		case "1" : r = "a"; break;
		case "2" : r = "b"; break;
		case "3" : r = "c"; break;
		case "4" : r = "d"; break;
		case "5" : r = "e"; break;
		case "6" : r = "f"; break;
		case "7" : r = "g"; break;
		case "8" : r = "h"; break;
		case "9" : r = "i"; break;
		case "10" : r = "j"; break;
		case "11" : r = "k"; break;
		case "12" : r = "l"; break;
		case "13" : r = "m"; break;
		case "14" : r = "n"; break;
		case "15" : r = "o"; break;
		case "16" : r = "p"; break;
		case "17" : r = "q"; break;
		case "18" : r = "r"; break;
		case "19" : r = "s"; break;
		case "20" : r = "t"; break;
		case "21" : r = "u"; break;
		case "22" : r = "v"; break;
		case "23" : r = "w"; break;
		case "24" : r = "x"; break;
		case "25" : r = "y"; break;
		case "26" : r = "z"; break;
		}
		return r;
	}

	@Override
	public String valorAStringEncriptado(char valorAEncriptar) {
		return String.valueOf(this.encriptarCharAStr(valorAEncriptar));
	}
	

}
