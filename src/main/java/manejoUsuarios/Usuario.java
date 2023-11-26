package manejoUsuarios;

import dominio.MaterialBiblioteca;

import java.util.ArrayList;

public class Usuario {

	private int idUsuario;
	private String nombre;
	private String email;

	private ArrayList<MaterialBiblioteca> librosPedidos;

	public String getNombre() {
		return nombre;
	}

	public Usuario(int id, String nombre, String email) {
		this.idUsuario = id;
		this.nombre = nombre;
		this.email = email;
		librosPedidos = new ArrayList<>();
	}


}