package unq.tp7.punto3;

import java.util.List;

public abstract class Filtro {
	
	public Filtro() {}
	
	public abstract List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia);
}

