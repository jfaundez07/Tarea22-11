package dominio;

import manejoUsuarios.*;

public abstract class MaterialBiblioteca implements prestable {

	protected String id;
	protected boolean prestado;
	protected String titulo;
	protected String autor;

	public MaterialBiblioteca(String id, String titulo, String autor) {
		this.prestado = false;
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getId() {
		return id;
	}

	public boolean isPrestado() {
		return prestado;
	}

	@Override
	public void prestar() {
		if (prestado) {
			throw new RuntimeException("El material ya está prestado");
		}
		prestado = true;
	}

	@Override
	public void devolver() {
		prestado = false;
	}

	@Override
	public String toString() {
		return "MaterialBiblioteca{" +
				"id=" + id +
				", prestado=" + prestado +
				", titulo='" + titulo + '\'' +
				", autor='" + autor + '\'' +
				'}';
	}
}