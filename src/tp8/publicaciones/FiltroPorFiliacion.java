package tp8.publicaciones;

public class FiltroPorFiliacion extends FiltroPublicacion {

	@Override
	public Boolean condicionFiltro(Publicacion publicacion) {
		return publicacion.getFiliaciones().contains(this.argumentoBusqueda);
	}

}
