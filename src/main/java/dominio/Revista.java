package dominio;

public class Revista extends MaterialBiblioteca{

	private String ISSN;
	private int numero;

	public String getISSN() {
		return ISSN;
	}

	public Revista(String ISSN, int numero, String titulo, String autor, int id) {
		super(id, titulo, autor);
		this.ISSN = ISSN;
		this.numero = numero;
	}

}