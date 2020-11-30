package tp7.sueldosrecargado;

public class Pasante extends Empleado {
	private double horasTrabajadas;
	
	public Pasante(String nombre, double horas) {
		super(nombre);
		this.setHorasTrabajadas(horas);
	}
	
	public double condicionEmpleado() {
		return 40 * this.getHorasTrabajadas();
	}
	
	private void setHorasTrabajadas(double horas) {
		this.horasTrabajadas = horas;
	}
	
	private double getHorasTrabajadas() {
		return this.horasTrabajadas;
	}
	
	
}
