package dominio;

import manejoUsuarios.Usuario;

import java.util.Scanner;

public enum BibliotecaControlador {

	INSTANCE;

	public MaterialBiblioteca buscarTitulo(String titulo, Biblioteca biblioteca) {

		for (MaterialBiblioteca material : biblioteca.getListaMateriales()) {
			if (material.getTitulo().equals(titulo)) {
				return material;
			}
		}

		return null;
	}

	public MaterialBiblioteca buscarAutor(String autor, Biblioteca biblioteca) {

		for (MaterialBiblioteca material : biblioteca.getListaMateriales()) {
			if (material.getAutor().equals(autor)) {
				return material;
			}
		}

		return null;
	}

	public Libro buscarLibroISBN(String ISBN, Biblioteca biblioteca) {

		for (MaterialBiblioteca material : biblioteca.getListaMateriales()) {
			if (material.getClass().equals(Libro.class)) {
				Libro libro = (Libro) material;
				if (libro.getISBN().equals(ISBN)) {
					return libro;
				}

			}
		}

		return null;

	}

	public Revista buscarRevistaISSN(String ISNN, Biblioteca biblioteca) {

		for (MaterialBiblioteca material : biblioteca.getListaMateriales()) {
			if (material.getClass().equals(Revista.class)) {
				Revista revista = (Revista) material;
				if (revista.getISSN().equals(ISNN)) {
					return revista;
				}

			}
		}

		return null;
	}

	public void prestarMaterial(MaterialBiblioteca materialPrestado, Usuario usuario) {
		materialPrestado.setPrestado(true);
		materialPrestado.setUsuarioAsociado(usuario);
	}

	public void devolverMaterial(MaterialBiblioteca materialDevuelto) {
		materialDevuelto.setPrestado(false);
		materialDevuelto.setUsuarioAsociado(null);
	}

	public void crearLibro(Biblioteca biblioteca) {

		String titulo = leer().nextLine();
		String autor = leer().nextLine();
		String ISBN = leer().nextLine();
		String edicion = leer().nextLine();
		int id = leer().nextInt();

		Libro libro = new Libro(ISBN, edicion, titulo, autor, id);
		biblioteca.addMaterial(libro);
	}

	public void crearRevista(Biblioteca biblioteca) {
		String titulo = leer().nextLine();
		String autor = leer().nextLine();
		String ISNN = leer().nextLine();
		int numero = leer().nextInt();
		int id = leer().nextInt();

		Revista revista = new Revista(ISNN, numero, titulo, autor, id);
		biblioteca.addMaterial(revista);
	}

	public Scanner leer() {
		Scanner leer = new Scanner(System.in);
		return leer;
	}

}