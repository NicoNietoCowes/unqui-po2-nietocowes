package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.entes.Articulo;
import ar.edu.utn.frba.tadp.entes.Nombrable;

@Articulo(cardinal="un", titulo="")
public class Mundo implements Nombrable{
	public String getNombre() {
		return "Mundo";
}
}