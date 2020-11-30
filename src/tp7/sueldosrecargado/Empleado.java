package tp7.sueldosrecargado;

public abstract class Empleado {
	@SuppressWarnings("unused")
	private String nombre;
	
	public Empleado(String nombre) {
		this.setNombre(nombre);
	}
	
	public final double sueldo() {
		return this.condicionEmpleado() - 
				(this.condicionEmpleado() * this.descuentoPorAportesYOS()) / 100;
	}
	
	public abstract double condicionEmpleado();
	
	public double descuentoPorAportesYOS() {
		return 13d;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
