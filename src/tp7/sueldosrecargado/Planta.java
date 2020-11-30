package tp7.sueldosrecargado;

public class Planta extends Empleado {
	private double cantidadHijos;
	
	public Planta(String nombre, double hijos) {
		super(nombre);
		this.setCantidadHijos(hijos);
	}

	public double condicionEmpleado() {
		return 3000 + this.plusPorHijo();
	}

	public double plusPorHijo() {
		return 150 * this.getCantidadHijos();
	}
	
	private void setCantidadHijos(double hijos) {
		this.cantidadHijos = hijos;
	}
	
	private double getCantidadHijos() {
		return this.cantidadHijos;
	}
}

