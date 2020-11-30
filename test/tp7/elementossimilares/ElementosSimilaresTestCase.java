package tp7.elementossimilares;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ElementosSimilaresTestCase {
	
	/** Paginas de ejemplo */
	PaginaWiki laPlata = new PaginaWiki("La Plata");
	PaginaWiki lucasArt = new PaginaWiki("Lucas Art");
	PaginaWiki lobo = new PaginaWiki("Lobo");
	PaginaWiki gimnasia = new PaginaWiki("Gimnasia y Esgrima La Plata");
	PaginaWiki buenosAires = new PaginaWiki("Buenos Aires");
	/** PREGUNTAR SI ESTÁ BIEN EL TIPADO, COMO INSTANCIO INTERFACES? */ 
	
	/** Wikipedia */
	List<WikipediaPage> wikipedia = Arrays.asList(laPlata, lucasArt, lobo, gimnasia, buenosAires);
	
	/** Filtros */
	MismaLetraInicial filtroLetras = new MismaLetraInicial();
	LinkEnComun filtroLinks = new LinkEnComun();
	PropiedadEnComun filtroPropiedad = new PropiedadEnComun();
	
	@BeforeEach
	public void setUp() {
		gimnasia.addLink(laPlata);
		gimnasia.addLink(lucasArt);
		gimnasia.addPropiedad("club_futbol");
		
		buenosAires.addLink(laPlata);
		buenosAires.addPropiedad("ciudad");
		
		laPlata.addPropiedad("ciudad");
	}
	
	@Test
	void testFiltroMismaLetra() {
		assertEquals(Arrays.asList(laPlata, lucasArt, lobo), 
				filtroLetras.getSimilarPages(laPlata, wikipedia));
	}
	
	@Test
	void testAddLink() {
		assertEquals(2, gimnasia.getLinks().size());	
	}

	@Test
	void testFiltroMismoLink() {
		assertEquals(Arrays.asList(gimnasia, buenosAires), 
				filtroLinks.getSimilarPages(gimnasia, wikipedia));
	}
	
	@Test
	void testPropiedadEnComun() {
		assertEquals(Arrays.asList(laPlata, buenosAires),
			    filtroPropiedad.getSimilarPages(laPlata, wikipedia));
	}

}
