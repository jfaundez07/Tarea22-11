package dominio;

import manejoUsuarios.Usuario;

import java.util.ArrayList;

public class Biblioteca{

	private Usuario usuarioIngresado;

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

	public void setUsuarioIngresado(Usuario usuario){
		this.usuarioIngresado = usuario;
	}

	public Usuario getUsuarioIngresado() {
		return usuarioIngresado;
	}
}