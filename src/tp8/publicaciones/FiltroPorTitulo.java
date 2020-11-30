package tp8.publicaciones;

public class FiltroPorTitulo extends FiltroPublicacion {

	@Override
	public Boolean condicionFiltro(Publicacion publicacion) {
		return publicacion.getTitulo().equals(this.argumentoBusqueda);
	}

}
