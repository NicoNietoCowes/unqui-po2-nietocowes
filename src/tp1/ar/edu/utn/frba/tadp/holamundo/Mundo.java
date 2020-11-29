package tp1.ar.edu.utn.frba.tadp.holamundo;

import tp1.ar.edu.utn.frba.tadp.entes.Articulo;
import tp1.ar.edu.utn.frba.tadp.entes.Nombrable;

@Articulo(cardinal="un", titulo="")
public class Mundo implements Nombrable{
	public String getNombre() {
		return "Mundo";
}
}