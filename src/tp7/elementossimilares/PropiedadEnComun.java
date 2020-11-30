package tp7.elementossimilares;

import java.util.List;
import java.util.stream.Collectors;

public class PropiedadEnComun extends FiltroWiki {

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		return wikipedia.stream().filter(pagina -> compartenPropiedades(page, pagina)).collect(Collectors.toList());
	}

	private boolean compartenPropiedades(WikipediaPage paginaOriginal, WikipediaPage paginaAComparar) {
		return paginaOriginal.getInfobox().keySet().stream().anyMatch(propiedad -> paginaAComparar.getInfobox().keySet().contains(propiedad));
	}
}
