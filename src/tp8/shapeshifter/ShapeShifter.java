package tp8.shapeshifter;

import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeShifter implements IShapeShifter {
	private ArrayList<IShapeShifter> componentes;
	protected int profundidad; 
	
	public ShapeShifter(IShapeShifter componente1, IShapeShifter componente2) {
		componentes.add(componente1);
		componentes.add(componente2);
	}

	@Override
	public IShapeShifter compose(IShapeShifter otroShifter) {
		this.incrementarProfundidad();
		otroShifter.incrementarProfundidad();
		IShapeShifter nuevoShifter = new ShapeShifter(this, otroShifter);
		return nuevoShifter;
	}

	@Override
	public int deepest() {
		return 0;
		//return componentes.stream().mapToInt(componente -> componente.profundidad);
	}

	@Override
	public IShapeShifter flat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> values() {
		List<Integer> lista = new ArrayList<Integer>();
		for (IShapeShifter componente : this.componentes) {
			lista.addAll(componente.values());
		}
		return lista;
	}
	
	public void incrementarProfundidad() {
		this.profundidad++;
	}

}
