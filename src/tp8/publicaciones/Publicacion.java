package tp8.publicaciones;

import java.util.List;

public class Publicacion {
	private String titulo;
	private List<String> autores;
	private List<String> filiaciones;
	private String tipoArticulo;
	private String lugarPublicacion;
	private List<String> palabrasClave;
	
	public Publicacion(String titulo, List<String> autores, 
			List<String> filiaciones, String tipoArticulo,
			String lugarPublicacion, List<String> palabrasClave) {
		this.titulo = titulo;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.tipoArticulo = tipoArticulo;
		this.lugarPublicacion = lugarPublicacion;
		this.palabrasClave = palabrasClave;
	}

	public String getTitulo() {
		return titulo;
	}

	public List<String> getAutores() {
		return autores;
	}

	public List<String> getFiliaciones() {
		return filiaciones;
	}

	public String getTipoArticulo() {
		return tipoArticulo;
	}

	public String getLugarPublicacion() {
		return lugarPublicacion;
	}

	public List<String> getPalabrasClave() {
		return palabrasClave;
	}
}
