package manejoUsuarios;

import java.util.ArrayList;

public class LogIn {
    private ArrayList<Usuario> listaUsuarios;

    public LogIn() {
        this.listaUsuarios = new ArrayList<Usuario>();
        addUsuario(new Usuario(1, "admin", "admin@biblioteca.cl", "1234"));
    }


    //Métodos
    public void addUsuario(Usuario nuevoUsuario) {
        this.listaUsuarios.add(nuevoUsuario);
    }

    public Usuario buscarUsuario(String email) {
        for (Usuario usuario : this.listaUsuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }
    public boolean verificarUsuario(String email, String password) {
        Usuario usuario = buscarUsuario(email);
        if (usuario != null) {
            if (usuario.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
