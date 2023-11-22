package dominio;

import manejoUsuarios.*;

public abstract class MaterialBiblioteca extends Libro {

	protected int id;
	protected boolean prestado;
	protected String titulo;
	protected String autor;
	protected Usuario usuarioAsociado;

}