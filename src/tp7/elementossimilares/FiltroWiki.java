package tp7.elementossimilares;

import java.util.List;

public abstract class FiltroWiki {
	
	public FiltroWiki() {}
	
	public abstract List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia);
}
