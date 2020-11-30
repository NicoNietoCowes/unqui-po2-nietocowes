package tp7.palabrasordenadas;

import java.util.Collections;
import java.util.Enumeration;

import javax.swing.DefaultListModel;

@SuppressWarnings("serial")
public class PalabrasOrdenadasAdapter extends DefaultListModel<String> {
	private ListaDePalabrasOrdenadas lista = new ListaDePalabrasOrdenadas();
	
	@Override
	public void addElement(String elemento) {
		lista.agregarPalabra(elemento);
	}
	
	@Override
	public String get(int index) {
		return lista.getPalabraDePosicion(index);
	}
	
	@Override
	public int size() {
		return lista.cantidadDePalabras();
	}
	
	@Override
	public Enumeration<String> elements() {
		return Collections.enumeration(lista.getPalabras());
	}
}
