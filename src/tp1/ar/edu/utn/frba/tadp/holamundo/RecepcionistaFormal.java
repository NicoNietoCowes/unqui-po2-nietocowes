package tp1.ar.edu.utn.frba.tadp.holamundo;

import tp1.ar.edu.utn.frba.tadp.entes.Nombrable;

public class RecepcionistaFormal extends Recepcionista {

	@Override
	protected String armarSaludo(Nombrable nombrable) {
		return "Buen d�a estimado " + nombrable.getNombre();
	}

}
