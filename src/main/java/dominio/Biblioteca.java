package dominio;

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

}