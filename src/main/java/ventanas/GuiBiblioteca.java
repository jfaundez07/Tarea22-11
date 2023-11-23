package ventanas;

import dominio.Biblioteca;
import dominio.BibliotecaControlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiBiblioteca extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton prestarBtn;
    private JButton devolverBtn;

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(prestarBtn)){
            //BibliotecaControlador.
        }
    }
}