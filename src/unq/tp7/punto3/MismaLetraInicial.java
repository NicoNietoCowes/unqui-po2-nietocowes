package unq.tp7.punto3;

import java.util.List;
import java.util.stream.Collectors;

public class MismaLetraInicial extends Filtro{

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		return (wikipedia.stream().filter(pagina -> pagina.getTitle().charAt(0) == page.getTitle().charAt(0)).collect(Collectors.toList()));
	}
	
}