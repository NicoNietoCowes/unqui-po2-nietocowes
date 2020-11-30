package tp8.publicaciones;

public class FiltroPorAutor extends FiltroPublicacion {

	@Override
	public Boolean condicionFiltro(Publicacion publicacion) {
		return publicacion.getAutores().contains(this.argumentoBusqueda);
	}

}
