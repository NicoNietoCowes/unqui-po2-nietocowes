package tp1.ar.edu.utn.frba.tadp.holamundo;

import java.util.Collection;
import java.util.HashSet;

import tp1.ar.edu.utn.frba.tadp.entes.Direccion;
import tp1.ar.edu.utn.frba.tadp.entes.Nombrable;
import tp1.ar.edu.utn.frba.tadp.entes.Persona;
import tp1.ar.edu.utn.frba.tadp.holamundo.Mundo;
import tp1.ar.edu.utn.frba.tadp.holamundo.Recepcionista;
import tp1.ar.edu.utn.frba.tadp.holamundo.RecepcionistaClasico;


public class Test {
	public static void main(String[] args) {
		Recepcionista recepcionista = makeRecepcionista();
		Nombrable nombrable = new Mundo();
		recepcionista.saludar(nombrable);
		System.out.println();
		nombrable = new Persona();
		recepcionista.saludar(nombrable);
		}
	private static Recepcionista makeRecepcionista() {
		return new RecepcionistaClasico();
		}
}