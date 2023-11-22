package dominio;

public class Libro extends MaterialBiblioteca{

	private String ISBN;
	private String edicion;

	public String getISBN() {
		return ISBN;
	}

	public Libro(String ISBN, String edicion, String titulo, String autor, int id) {
		super(id, titulo, autor);
		this.ISBN = ISBN;
		this.edicion = edicion;
	}

}