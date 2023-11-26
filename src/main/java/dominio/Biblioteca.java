package dominio;

import manejoUsuarios.Usuario;

import java.util.ArrayList;

public class Biblioteca{

	private ArrayList<MaterialBiblioteca> listaMateriales;

	public Biblioteca() {
		this.listaMateriales = new ArrayList<MaterialBiblioteca>();
	}

	public ArrayList<MaterialBiblioteca> getListaMateriales() {
		return this.listaMateriales;
	}

	public void addMaterial(MaterialBiblioteca nuevoMaterial) {
		this.listaMateriales.add(nuevoMaterial);
	}

	public void mostrarTodo(){
		for (MaterialBiblioteca material : this.listaMateriales) {
			System.out.println(material.toString());
		}
	}

	//------------------Exigencias Instrucciones------------------

	public ArrayList<MaterialBiblioteca> buscarTitulo(String titulo) {

		ArrayList<MaterialBiblioteca> temporal = new ArrayList<MaterialBiblioteca>();

		for (MaterialBiblioteca material : this.listaMateriales) {
			if (material.getTitulo().equals(titulo)) {
				temporal.add(material);
			}
		}

		return temporal;
	}

	public ArrayList<MaterialBiblioteca> buscarAutor(String autor) {

		ArrayList<MaterialBiblioteca> temporal = new ArrayList<MaterialBiblioteca>();

		for (MaterialBiblioteca material : this.listaMateriales) {
			if (material.getAutor().equals(autor)) {
				temporal.add(material);
			}
		}

		return temporal;
	}

	public Libro buscarLibroISBN(String ISBN) {

		for (MaterialBiblioteca material : this.listaMateriales) {
			if (material.getClass().equals(Libro.class)) {
				Libro libro = (Libro) material;
				if (libro.getISBN().equals(ISBN)) {
					return libro;
				}

			}
		}
		return null;

	}
	public Revista buscarRevistaISSN(String ISNN) {

		for (MaterialBiblioteca material : this.listaMateriales) {
			if (material.getClass().equals(Revista.class)) {
				Revista revista = (Revista) material;
				if (revista.getISSN().equals(ISNN)) {
					return revista;
				}

			}
		}
		return null;
	}
}