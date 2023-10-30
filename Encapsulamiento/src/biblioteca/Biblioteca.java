package biblioteca;

public class Biblioteca {

	private Libro[] libros;
	private int cantLibros = 0;

	public Biblioteca(int maxCantidadDeLibros) {
		this.libros = new Libro[maxCantidadDeLibros];
	}

	public int cuantosLibros() {
		return this.cantLibros;
	}

	public void agregarLibro(String titulo, String autor, Genero genero, int paginas) {
		if (cantLibros >= libros.length)
			throw new Error("Biblioteca completa");

		Libro libroNuevo = new Libro(titulo, autor, genero, paginas);
		libros[cantLibros] = libroNuevo;
		cantLibros++;
	}

	public String libroEnLaPosicion(int posicion) {
		try {
			if (posicion < 1 || posicion > cantLibros)
				throw new PosicionIncorrectaException("Posicion Invalida");
			return libros[posicion - 1].getTitulo();
		} catch (PosicionIncorrectaException pie) {
			System.err.println(pie.getMessage());
			return null;
		}
	}

	public Libro libroConMasPaginas() {
		Libro libroConMasPaginas = libros[0];
		for (int i = 1; i < cantLibros; i++) {
			if (libros[i].getCantidadDePaginas() > libroConMasPaginas.getCantidadDePaginas())
				libroConMasPaginas = libros[i];
		}
		return libroConMasPaginas;

	}

	public int cuantosLibrosDelAutor(String autor) {
		int contador = 0;
		for (int i = 1; i < cantLibros; i++) {
			if (libros[i].getAutor().equals(autor)) {
				contador++;
			}
		}
		return contador;
	}

	public Libro[] librosDelAutor(String autor) {
		Libro[] aux = null;
		int j = 0;
		int cuantosLibrosDelAutor = this.cuantosLibrosDelAutor(autor);
		if (cuantosLibrosDelAutor != 0) {
			aux = new Libro[cuantosLibrosDelAutor];
			for (int i = 0; i < cantLibros; i++)
				if (libros[i].getAutor().equals(autor)) {
					aux[j] = libros[i];
					j++;
				}
		}
		return aux;
	}

	public int tiempoEnLeerTodosLosLibros() {
		int acumulador = 0;
		for (int i = 0; i < cantLibros; i++)
			acumulador += libros[i].getCantidadDePaginas();
		return acumulador;

	}

	public void librosPorGeneroLiterario() {
		Genero[] generos = Genero.values();
		int[] acumuladores = new int[generos.length];
		// Genero.CIENCIA_FICCION.ordinal()
		for (int i = 0; i < cantLibros; i++) {
			acumuladores[libros[i].getGenero().ordinal()]++;
		}
		// Imprimo el listado:
		System.out.println("Genero\tCantidad");
		for (int i = 0; i < generos.length; i++)
			System.out.println(generos[i] + "\t" + acumuladores[i]);
	}

}
