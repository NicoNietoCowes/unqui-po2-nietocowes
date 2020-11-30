package tp10.cuenta;

public abstract class CuentaBancaria {
	protected HistorialMovimientos historialDeMovimientos;
	protected Notificador notificador;
	protected int saldo;
	
	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}
	
	// public abstract void extraer(Integer monto);
	/** Al hacer este método abstracto se genera una duplicación de código en las subclases
	 * (CajaAhorro y CuentaCorriente solo difieren en la condición para la extracción, pero
	 * luego se comportan de la misma forma: extraen del saldo y notifican) */
	
	/** Una solución es hacer del método .extraer() un Template Method y que
	 * cada sublcase se encargue de identificar como responder el .puedeExtraer(montoDado) */
	public final void extraer(Integer monto) {
		if(this.puedeExtraer(monto)) {
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("ExtracciÃ³n", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	}

	// Ahora el .puedeExtraer(monto) es el método abstracto que las subclases deben implementar.
	protected abstract boolean puedeExtraer(Integer montoAExtraer);
}
