package tp8.cultivos;

import java.util.ArrayList;

public class CultivoMixto extends Cultivo {
	ArrayList<Cultivo> cultivos = new ArrayList<Cultivo>();

	/** PRECONDICIÓN: El CultivoMixto debe contener en la lista de cultivos un total de 4 cultivos, pueden ser puros o mixtos
	 *  pero si o si deben ser 4 para el funcionamiento deseado del ejercicio. */
	
	public void addCultivo(Cultivo nuevoCultivo) {
		this.cultivos.add(nuevoCultivo);
	}
	
	@Override
	public double getGananciaAnual() {
		return (cultivos.stream().mapToDouble(cultivo -> cultivo.getGananciaAnual()).sum()) / 4;
	} 
}
