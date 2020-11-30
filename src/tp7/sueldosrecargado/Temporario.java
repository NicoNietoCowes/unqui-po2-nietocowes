package tp7.sueldosrecargado;

public class Temporario extends Empleado {
	private double horasTrabajadas;
	private boolean tieneFamilia;
	
	public Temporario(String nombre, double horas, boolean tieneFlia) {
		super(nombre);
		this.setHorasTrabajadas(horas);
		this.setTieneFamilia(tieneFlia);
	}
	
	public double condicionEmpleado() {
		return 1000d + (5 * this.getHorasTrabajadas()) + this.plusFamilia();
	}
	
	public double plusFamilia() {
		return (this.isTieneFamilia()) ? 100d : 0d;
	}

	private void setHorasTrabajadas(Double horas) {
		this.horasTrabajadas = horas;
	}
	
	private double getHorasTrabajadas() {
		return this.horasTrabajadas;
	}
	
	private boolean isTieneFamilia() {
		return tieneFamilia;
	}

	private void setTieneFamilia(boolean tieneFamilia) {
		this.tieneFamilia = tieneFamilia;
	}
}
