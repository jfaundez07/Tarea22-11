package manejoUsuarios;

import dominio.MaterialBiblioteca;

import java.util.ArrayList;

public class Usuario {
	private int idUsuario;
	private String nombre;
	private String email;
	private String password;
	private ArrayList<MaterialBiblioteca> librosPedidos;

	public Usuario(int id, String nombre, String email, String password) {
		this.idUsuario = id;
		this.nombre = nombre;
		this.email = email;
		this.password = password;
	}

	//getters y setters
	public int getIdUsuario() {
		return idUsuario;
	}
	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}

}