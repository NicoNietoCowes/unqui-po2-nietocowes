package impuestos;

public class IngresoHorasExtra extends Ingreso {
	private int horasExtra;
	
	public IngresoHorasExtra(Integer horas, int mes, String c, int m) {
		super(horas, c, m);
		horasExtra = horas;
		esHoraExtra = true;
	}
	
	@Override
	public int getMontoImponible() {
		return 0;
	}
}
