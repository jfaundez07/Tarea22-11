package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dominio.Biblioteca;
import manejoUsuarios.LogIn;
import manejoUsuarios.Usuario;

public class GuiLogin extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField usuarioField;
    private JPasswordField passwordField;
    private JLabel usuarioLabel;
    private JLabel contraseñaLabel;
    private JLabel titutoLabel;
    private JButton limpiarBtn;
    private JButton entrarBtn;

    public static void main(String[] args) {
        GuiLogin guiLogin = new GuiLogin();
    }

    public GuiLogin(){
        this.add(panel);
        setContentPane(panel);
        asignarEventos();
        setTitle("LOGIN");
        setSize(400,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void asignarEventos(){
        limpiarBtn.addActionListener(this);
        entrarBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == entrarBtn){
            LogIn login = new LogIn();
            Usuario usuario = login.buscarUsuario(usuarioField.getText());

            if (login.verificarUsuario(usuarioField.getText(), passwordField.getText())) {
                Biblioteca biblioteca = new Biblioteca();
                GuiBiblioteca guiBiblioteca = new GuiBiblioteca(biblioteca, usuario);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }


        }else if(event.getSource() == limpiarBtn){
            usuarioField.setText("");
            passwordField.setText("");
        }
    }
}