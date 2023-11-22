package dominio;

import manejoUsuarios.*;

public abstract class MaterialBiblioteca {

	protected int id;
	protected boolean prestado;
	protected String titulo;
	protected String autor;
	protected Usuario usuarioAsociado;

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public void setUsuarioAsociado(Usuario usuarioAsociado) {
		this.usuarioAsociado = usuarioAsociado;
	}

	public MaterialBiblioteca(int id, String titulo, String autor) {
		this.prestado = false;
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
	}

}