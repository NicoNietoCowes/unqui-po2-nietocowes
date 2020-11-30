package tp8.shapeshifter;

import java.util.Arrays;
import java.util.List;

public class Value implements IShapeShifter {
	private Integer valor;
	protected int profundidad = 0;
	
	public Value(Integer valor) {
		this.valor = valor;
	}
	
	@Override
	public IShapeShifter compose(IShapeShifter shifter) {
		this.incrementarProfundidad();
		shifter.incrementarProfundidad();
		IShapeShifter nuevoShifter = new ShapeShifter(this, shifter);
		return nuevoShifter;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		return Arrays.asList(this.valor);
	}

	public void incrementarProfundidad() {
		this.profundidad++;
	}
}
