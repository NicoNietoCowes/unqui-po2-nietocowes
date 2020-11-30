package tp8.publicaciones;

public class Investigador {
	private Boolean estaNotificado = false;
	private String apellido;
	private SistemaPublicacion sistema;
	
	public Investigador(String apellido, SistemaPublicacion sistema) {
		this.apellido = apellido;
		this.sistema = sistema;
	}
	
	public void cargarPublicacion(Publicacion publicacion) {
		this.sistema.agregarPublicacion(publicacion);
	}
	
	public void suscribirse(FiltroPublicacion filtro, String argumento) {
		filtro.setSuscriptor(this);
		filtro.setArgumentoBusqueda(argumento);
		this.sistema.agregarFiltro(filtro);
	}
	
	public void recibirNotificacion() {
		this.estaNotificado = true;
	}
	
	public Boolean estaNotificado() {
		return this.estaNotificado;
	}
}
