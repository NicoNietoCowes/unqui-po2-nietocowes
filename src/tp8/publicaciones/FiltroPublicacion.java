package tp8.publicaciones;

public abstract class FiltroPublicacion {
	protected String argumentoBusqueda;
	private Investigador suscriptor;
	
	public void verificar(Publicacion publicacion) {
		if (this.condicionFiltro(publicacion)) {
			this.notificar();
		}
	}
	
	public abstract Boolean condicionFiltro(Publicacion publicacion);
	
	public void notificar() {
		this.suscriptor.recibirNotificacion();
	}
	
	protected void setSuscriptor(Investigador investigadorInteresado) {
		this.suscriptor = investigadorInteresado;
	}
	
	protected void setArgumentoBusqueda(String arg) {
		this.argumentoBusqueda = arg;
	}
}
