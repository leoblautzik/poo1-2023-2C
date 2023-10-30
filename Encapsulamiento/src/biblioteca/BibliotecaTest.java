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
		assertEquals(null, elBiblio.libroEnLaPosicion(5));
		assertEquals(null, elBiblio.libroEnLaPosicion(15));
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

	@Test(expected = Error.class)
	public void bibliotecaLlenaTest() {
		Biblioteca elBiblio = new Biblioteca(2);
		elBiblio.agregarLibro("La metamorfosis", "Franz Kafka", Genero.CIENCIA_FICCION, 300);
		elBiblio.agregarLibro("El resplandor", "Stephen King", Genero.NOVELA, 900);
		elBiblio.agregarLibro("El principito", " Antoine de Saint-Exupéry", Genero.NOVELA, 200);

	}

	@Test
	public void cuantosLibrosDelAutorTest() {
		Biblioteca elBiblio = new Biblioteca(10);
		elBiblio.agregarLibro("La metamorfosis", "Franz Kafka", Genero.CIENCIA_FICCION, 300);
		elBiblio.agregarLibro("El resplandor", "Stephen King", Genero.NOVELA, 900);
		elBiblio.agregarLibro("Carrie", "Stephen King", Genero.NOVELA, 700);
		elBiblio.agregarLibro("It", "Stephen King", Genero.NOVELA, 1400);
		elBiblio.agregarLibro("El principito", " Antoine de Saint-Exupéry", Genero.NOVELA, 200);

		assertEquals(3, elBiblio.cuantosLibrosDelAutor("Stephen King"));
	}

	@Test
	public void librosDelAutorTest() {
		Biblioteca elBiblio = new Biblioteca(10);
		elBiblio.agregarLibro("La metamorfosis", "Franz Kafka", Genero.CIENCIA_FICCION, 300);
		elBiblio.agregarLibro("El resplandor", "Stephen King", Genero.NOVELA, 900);
		elBiblio.agregarLibro("Carrie", "Stephen King", Genero.NOVELA, 700);
		elBiblio.agregarLibro("It", "Stephen King", Genero.NOVELA, 1400);
		elBiblio.agregarLibro("El principito", " Antoine de Saint-Exupéry", Genero.NOVELA, 200);

		Libro[] esperado = new Libro[3];
		esperado[0] = new Libro("El resplandor", "Stephen King", Genero.NOVELA, 900);
		esperado[1] = new Libro("Carrie", "Stephen King", Genero.NOVELA, 700);
		esperado[2] = new Libro("It", "Stephen King", Genero.NOVELA, 1400);

		assertArrayEquals(esperado, elBiblio.librosDelAutor("Stephen King"));

	}

	@Test
	public void librosPorGeneroTest() {
		Biblioteca elBiblio = new Biblioteca(10);
		elBiblio.agregarLibro("La metamorfosis", "Franz Kafka", Genero.CIENCIA_FICCION, 300);
		elBiblio.agregarLibro("El resplandor", "Stephen King", Genero.NOVELA, 900);
		elBiblio.agregarLibro("Carrie", "Stephen King", Genero.NOVELA, 700);
		elBiblio.agregarLibro("It", "Stephen King", Genero.TERROR, 1400);
		elBiblio.agregarLibro("El principito", " Antoine de Saint-Exupéry", Genero.POESIA, 200);
		elBiblio.agregarLibro("It", "Stephen King", Genero.NOVELA, 1400);
		elBiblio.agregarLibro("El principito", " Antoine de Saint-Exupéry", Genero.NOVELA, 200);
		elBiblio.librosPorGeneroLiterario();
	}
}
