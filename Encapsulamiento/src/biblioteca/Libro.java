package biblioteca;

import java.util.Objects;

public class Libro {
	private String titulo;
	private String autor;
	private Genero genero;
	private int cantidadDePaginas;
	
	
	public Libro(String titulo, String autor, Genero genero, int cantidadDePaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.cantidadDePaginas = cantidadDePaginas;
	}


	public String getTitulo() {
		return titulo;
	}


	public int getCantidadDePaginas() {
		return cantidadDePaginas;
	}


	@Override
	public int hashCode() {
		return Objects.hash(autor, cantidadDePaginas, genero, titulo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && cantidadDePaginas == other.cantidadDePaginas
				&& genero == other.genero && Objects.equals(titulo, other.titulo);
	}
	
	
	
	
	
	

}
