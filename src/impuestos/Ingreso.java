package impuestos;

import java.time.Month;

public class Ingreso {
	protected Month mesDePercepcion;
	protected String concepto;
	protected int montoPercibido;
	public boolean esHoraExtra; 
	
	public Ingreso(int mes, String c, int m) {
		mesDePercepcion = Month.of(mes);
		concepto = c;
		montoPercibido = m;
		esHoraExtra = false;
	}

	public int getMontoPercibido() {
		return montoPercibido;
	}
	
	public int getMontoImponible() {
		return montoPercibido;
	}
}
