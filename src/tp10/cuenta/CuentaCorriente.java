package tp10.cuenta;

public class CuentaCorriente extends CuentaBancaria{
	private Integer limiteDescubierto;
	
	public CuentaCorriente(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo, Integer limiteDescubierto) {
		super(historialDeMovimientos, notificador, saldo);
		this.limiteDescubierto = limiteDescubierto;
	}
	
	/** @Override
	public void extraer(Integer monto) {
		if(this.saldo + this.limiteDescubierto >= monto)
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
	} */

	/** Esta clase ahora solo tiene que indicar cual es la condici�n para extraer: */
	@Override
	public boolean puedeExtraer(Integer montoAExtraer) {
		return this.saldo + this.limiteDescubierto >= montoAExtraer;
	}
}
