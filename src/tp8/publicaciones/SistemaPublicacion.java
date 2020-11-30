package tp8.publicaciones;

import java.util.ArrayList;

public class SistemaPublicacion {
	private ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
	private ArrayList<FiltroPublicacion> filtros = new ArrayList<FiltroPublicacion>();

	public void agregarPublicacion(Publicacion nuevaPublic) {
		this.publicaciones.add(nuevaPublic);
		this.notificarPublicacion(nuevaPublic);
	}
	
	public void agregarFiltro(FiltroPublicacion filtro) {
		this.filtros.add(filtro);
	}
	
	public void notificarPublicacion(Publicacion nuevaPublic) {
		for (FiltroPublicacion filtro : this.filtros) {
			filtro.verificar(nuevaPublic);
		}
	}
	
	public ArrayList<Publicacion> getPublicaciones() {
		return this.publicaciones;
	}
	
	public ArrayList<FiltroPublicacion> getFiltros() {
		return this.filtros;
	}
}
