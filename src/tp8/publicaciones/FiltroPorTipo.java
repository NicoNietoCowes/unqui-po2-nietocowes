package tp8.publicaciones;

public class FiltroPorTipo extends FiltroPublicacion {

	@Override
	public Boolean condicionFiltro(Publicacion publicacion) {
		return publicacion.getTipoArticulo().equals(this.argumentoBusqueda);
	}

}
