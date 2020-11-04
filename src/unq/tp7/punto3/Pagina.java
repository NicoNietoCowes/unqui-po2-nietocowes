package unq.tp7.punto3;

import java.util.List;
import java.util.Map;

public class Pagina implements WikipediaPage {
	private String title;
	private List<WikipediaPage> links;
	private Map<String, WikipediaPage> infobox;
	
	public Pagina(String title) {
		this.setTitle(title);
	}
	
	private void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	public void addLink (WikipediaPage link) {
		this.links.add(link);
	}
	
	@Override
	public List<WikipediaPage> getLinks() {
		return this.links;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		return this.infobox;
	}
	
}
