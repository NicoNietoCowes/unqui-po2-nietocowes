package tp6;

public class SolicitudCreditoPersonal extends SolicitudCredito {

	public SolicitudCreditoPersonal(Cliente c, double d, int i) {
		this.setCliente(c);
		this.setMonto(d);
		this.setPlazo(i);
	}

	@Override
	protected boolean estaAprobada() {
		return ((this.getCliente().getIngresoAnual() >= 15000.00) 
				& (this.cuota() <= (this.getCliente().getSueldoNeto() * 0.7)));
	}
	
}
