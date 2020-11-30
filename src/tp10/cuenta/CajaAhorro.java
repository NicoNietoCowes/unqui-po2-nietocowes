package tp10.cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	/** @Override
	public void extraer(Integer monto) {
		if(this.saldo >= monto) {
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	} */
	
	/** Esta clase ahora solo tiene que indicar cual es la condici�n para extraer: */
	@Override
	public boolean puedeExtraer(Integer montoAExtraer) {
		return this.saldo >= montoAExtraer;
	}
}
