package tp8.publicaciones;

public class FiltroPorPalabraClave extends FiltroPublicacion {

	@Override
	public Boolean condicionFiltro(Publicacion publicacion) {
		return publicacion.getPalabrasClave().contains(this.argumentoBusqueda);
	}

}
