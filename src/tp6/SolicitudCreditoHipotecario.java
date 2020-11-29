package tp6;


public class SolicitudCreditoHipotecario extends SolicitudCredito {	
	private Propiedad garantia;
	
	public SolicitudCreditoHipotecario(Cliente c, double d, int i, Propiedad p) {
		this.setCliente(c);
		this.setMonto(d);
		this.setPlazo(i);
		garantia = p;
		
	}

	@Override
	protected boolean estaAprobada() {
		return ((this.cuota() <= (this.getCliente().getSueldoNeto() * 0.5)) 
				& this.getMonto() <= (garantia.getValorFiscal() * 0.7)
				& (this.getCliente().getEdad() + this.getPlazo() / 12) <= 65);
	}

}
