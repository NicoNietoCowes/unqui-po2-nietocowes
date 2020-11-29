package tp6;

public abstract class SolicitudCredito {
	private Cliente cliente;
	private Double monto;
	private Integer plazo;
	
	public void setCliente(Cliente c){
		cliente = c;
	}
	
	public void setMonto(Double m){
		monto = m;
	}
	
	public void setPlazo(Integer p){
		plazo = p;
	}

	public Double getMonto() {
		return monto;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Integer getPlazo() {
		return plazo;
	}

	public Double cuota() {
		return (this.getMonto() / plazo);
	}
	
	protected abstract boolean estaAprobada();
}
