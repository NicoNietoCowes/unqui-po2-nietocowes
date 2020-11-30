package tp7.elementossimilares;

import java.util.List;
import java.util.stream.Collectors;

public class MismaLetraInicial extends FiltroWiki {

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		return (wikipedia.stream().filter(
				pagina -> pagina.getTitle().charAt(0) == page.getTitle().charAt(0)))
				.collect(Collectors.toList());
	}
	
}
