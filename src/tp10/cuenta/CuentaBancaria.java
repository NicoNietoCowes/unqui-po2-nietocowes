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
	/** Al hacer este m�todo abstracto se genera una duplicaci�n de c�digo en las subclases
	 * (CajaAhorro y CuentaCorriente solo difieren en la condici�n para la extracci�n, pero
	 * luego se comportan de la misma forma: extraen del saldo y notifican) */
	
	/** Una soluci�n es hacer del m�todo .extraer() un Template Method y que
	 * cada sublcase se encargue de identificar como responder el .puedeExtraer(montoDado) */
	public final void extraer(Integer monto) {
		if(this.puedeExtraer(monto)) {
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	}

	// Ahora el .puedeExtraer(monto) es el m�todo abstracto que las subclases deben implementar.
	protected abstract boolean puedeExtraer(Integer montoAExtraer);
}
