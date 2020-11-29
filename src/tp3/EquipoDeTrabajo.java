package tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombre;
	private ArrayList<Persona> integrantes = new ArrayList<Persona>();
	
	
	public EquipoDeTrabajo(String string) {
		nombre = string;
		integrantes = new ArrayList<Persona>();
	}


	public void add(Persona persona) {
		integrantes.add(persona);
		
	}


	public String nombre() {
		return nombre;
	}


	public Integer promedioEdades() {
		Integer sum = 0;
		if(!this.integrantes.isEmpty()) {
			for (Persona integrante : integrantes) {
				sum += integrante.edad();
			}
		return sum / integrantes.size();
		}
		return sum;
	}
	
}
	
