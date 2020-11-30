package tp8.publicaciones;

public class FiltroPorLugar extends FiltroPublicacion {

	@Override
	public Boolean condicionFiltro(Publicacion publicacion) {
		return publicacion.getLugarPublicacion().equals(this.argumentoBusqueda);
	}

}
