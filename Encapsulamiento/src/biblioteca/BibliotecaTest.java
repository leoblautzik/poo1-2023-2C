package biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void bibliotecaNuevaTest() {
		Biblioteca elBiblio = new Biblioteca(10);
		int esperado = 0;
		int obtenido = elBiblio.cuantosLibros();
		assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void agregoUnLibroTest() {
		Biblioteca elBiblio = new Biblioteca(10);
		elBiblio.agregarLibro("La metamorfosis", "Franz Kafka", Genero.CIENCIA_FICCION, 300);
		int esperado = 1;
		int obtenido = elBiblio.cuantosLibros();
		assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void libroEnPosicionTest() {
		Biblioteca elBiblio = new Biblioteca(10);
		elBiblio.agregarLibro("La metamorfosis", "Franz Kafka", Genero.CIENCIA_FICCION, 300);
		elBiblio.agregarLibro("El resplandor", "Stephen King", Genero.NOVELA, 900);
		assertEquals("La metamorfosis", elBiblio.libroEnLaPosicion(1));
		assertEquals("El resplandor", elBiblio.libroEnLaPosicion(2));

	}
	
	@Test
	public void libroConMasPaginasTest() {
		Biblioteca elBiblio = new Biblioteca(10);
		elBiblio.agregarLibro("La metamorfosis", "Franz Kafka", Genero.CIENCIA_FICCION, 300);
		elBiblio.agregarLibro("El resplandor", "Stephen King", Genero.NOVELA, 900);
		elBiblio.agregarLibro("El principito", " Antoine de Saint-Exupéry", Genero.NOVELA, 200);
		Libro esperado = new Libro("El resplandor", "Stephen King", Genero.NOVELA, 900);
		Libro obtenido = elBiblio.libroConMasPaginas();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void libroConMasPaginasEnBiblioNuevaTest() {
		Biblioteca elBiblio = new Biblioteca(10);
		assertEquals(null, elBiblio.libroConMasPaginas());
	}
	
	@Test(expected=Error.class)
	public void bibliotecaLlenaTest() {
		Biblioteca elBiblio = new Biblioteca(2);
		elBiblio.agregarLibro("La metamorfosis", "Franz Kafka", Genero.CIENCIA_FICCION, 300);
		elBiblio.agregarLibro("El resplandor", "Stephen King", Genero.NOVELA, 900);
		elBiblio.agregarLibro("El principito", " Antoine de Saint-Exupéry", Genero.NOVELA, 200);
		
	}

}
