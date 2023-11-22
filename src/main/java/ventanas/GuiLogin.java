package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLogin extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField usuarioField;
    private JPasswordField passwordField;
    private JLabel usuarioLabel;
    private JLabel contraseñaLabel;
    private JLabel titutoLabel;
    private JButton limpiarBtn;
    private JButton entrarBtn;

    public GuiLogin(){
        this.add(panel);
        setContentPane(panel);
        asignarEventos();
        setTitle("LOGIN");
        setSize(300,500);
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
            //
        }else if(event.getSource() == limpiarBtn){
            usuarioField.setText("");
            passwordField.setText("");
        }
    }
}