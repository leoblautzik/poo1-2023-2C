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
		return libros[posicion - 1].getTitulo();
	}

	public Libro libroConMasPaginas() {
		Libro libroConMasPaginas = libros[0];
				for(int i = 1; i < cantLibros; i++) {
			if(libros[i].getCantidadDePaginas() > libroConMasPaginas.getCantidadDePaginas())
				libroConMasPaginas = libros[i];
		}
		return libroConMasPaginas;
		
	}

}
