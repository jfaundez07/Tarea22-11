package dominio;

import manejoUsuarios.Usuario;

public interface Prestable {

	void prestarMaterial(MaterialBiblioteca materialPrestado, Usuario usuario);

	void devolverMaterial(MaterialBiblioteca materialDevuelto);

}