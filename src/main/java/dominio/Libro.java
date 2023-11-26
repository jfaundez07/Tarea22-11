package dominio;

public class Libro extends MaterialBiblioteca{

	private String ISBN;
	private String edicion;

	public String getISBN() {
		return ISBN;
	}

	public String getEdicion() {
		return edicion;
	}

	public Libro(String id,String titulo, String autor, String ISBN, String edicion) {
		super(id, titulo, autor);
		this.ISBN = ISBN;
		this.edicion = edicion;
	}



}