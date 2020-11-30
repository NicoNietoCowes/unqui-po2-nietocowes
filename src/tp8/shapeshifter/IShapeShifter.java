package tp8.shapeshifter;

import java.util.List;

public interface IShapeShifter { 
	
	public IShapeShifter compose(IShapeShifter nuevoShifter); 
	public int deepest(); 
	public IShapeShifter flat(); 
	public List<Integer> values();
	
	// método agregado para simplificar la solucion.
	public void incrementarProfundidad();
	
}