package tp7.elementossimilares;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaginaWiki implements WikipediaPage {
	private String title;
	private List<WikipediaPage> links = new ArrayList<WikipediaPage>();
	private Map<String, WikipediaPage> infobox = new HashMap<String, WikipediaPage>();
	
	public PaginaWiki(String title) {
		this.setTitle(title);
	}
	
	private void setTitle(String title) {
		this.title = title;	
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}

	public void addLink(WikipediaPage link) {
		this.links.add(link);
	}
	
	@Override
	public List<WikipediaPage> getLinks() {
		return this.links;
	}
	
	/** Interpreto el infobox como un map de Strings correspondientes a propiedades de una misma pagina, el getInfobox va a devolver diferentes keys
	 * de tipo String para siempre el mismo valor PaginaWiki (ella misma). */
	public void addPropiedad(String propiedad) {
		this.infobox.put(propiedad, this);
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		return this.infobox;
	}

}
