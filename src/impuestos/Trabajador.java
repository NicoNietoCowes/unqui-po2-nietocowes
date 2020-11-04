package impuestos;

import java.util.ArrayList;


public class Trabajador {
	private ArrayList<Ingreso> ingresos = new ArrayList<Ingreso>();

	public void addIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
		
	}

	public int getTotalPercibido() {
		return ingresos.stream().mapToInt(Ingreso::getMontoPercibido).sum();
	}

	public Integer getMontoImponible() {
		return ingresos.stream().mapToInt(Ingreso::getMontoImponible).sum();
	}

	public int getImpuestoAPagar() {
		return (int) (this.getMontoImponible() * 0.02);
	}
	
	
	
}
