package tp7.palabrasordenadas;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListaDePalabrasOrdenadas {
	private List<String> palabras ;
	@SuppressWarnings("rawtypes")
	private final Comparator comparador;

	@SuppressWarnings("rawtypes")
	public ListaDePalabrasOrdenadas() {
		this.palabras= new LinkedList<String>();
		this.comparador= new Comparator(){

			@Override

			public int compare(Object palabraA , Object palabraB ) {
				String a =((String) palabraA );
				String b =((String) palabraB );
				return a .compareToIgnoreCase( b );
			}
		};
	}
	
	@SuppressWarnings("unchecked")
	public void agregarPalabra(Object palabra ){
		this.palabras.add((String) palabra);
		Collections.sort( this . palabras , this .comparador);
	}
	
	public Integer cantidadDePalabras(){
		return this.palabras.size();
	}

	public String getPalabraDePosicion( int posicion ){
		return this.palabras.get( posicion );
	}
	
	public List<String> getPalabras() {
		return this.palabras;
	}
}