package tp7.elementossimilares;

import java.util.List;
import java.util.stream.Collectors;

public class LinkEnComun extends FiltroWiki {

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> linksDeLaPag = page.getLinks();
		return wikipedia.stream().filter(pagina -> this.tienenLinksCoincidentes(linksDeLaPag, pagina.getLinks())).collect(Collectors.toList());
	}

	/** Corrobora si al menos un link de la lista de links WikipediaPage está incluido dentro de la otra lista de links WikipediaPage */
	private boolean tienenLinksCoincidentes(List<WikipediaPage> linksDeLaPag, List<WikipediaPage> links) {
		return linksDeLaPag.stream().anyMatch(link -> links.contains(link));
	}

}
