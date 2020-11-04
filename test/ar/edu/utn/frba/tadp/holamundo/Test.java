package ar.edu.utn.frba.tadp.holamundo;

import java.util.Collection;
import java.util.HashSet;

import ar.edu.utn.frba.tadp.entes.Direccion;
import ar.edu.utn.frba.tadp.entes.Nombrable;
import ar.edu.utn.frba.tadp.entes.Persona;


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