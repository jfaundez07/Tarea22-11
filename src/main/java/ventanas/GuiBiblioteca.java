package ventanas;

import com.sun.source.doctree.SeeTree;
import dominio.Biblioteca;
import manejoUsuarios.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiBiblioteca extends JFrame implements ActionListener {
    private JPanel bibliotecaPanel;
    private JButton prestarButton;
    private JButton devolverButton;
    private JButton buscarButton;
    private JButton agregarButton;
    private JLabel tituloLabel;
    private Biblioteca biblioteca;

    public GuiBiblioteca(Biblioteca biblioteca) {
        setUpGui();
        this.biblioteca = biblioteca;
    }

    public void setUpGui(){
        setTitle("Biblioteca");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setContentPane(bibliotecaPanel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        prestarButton.addActionListener(this);
        agregarButton.addActionListener(this);
        buscarButton.addActionListener(this);
        devolverButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(prestarButton)) {
            GuiPrestamoLibro guiPrestamoLibro = new GuiPrestamoLibro(biblioteca);
            setVisible(false);
        }
        if (event.getSource().equals(agregarButton)) {
            GuiAddMaterial guiAgregarMaterial = new GuiAddMaterial(biblioteca);
            setVisible(false);
        }
        if (event.getSource().equals(buscarButton)) {
            GuiBuscar guiBuscar = new GuiBuscar(biblioteca);
            setVisible(false);
        }
        if (event.getSource().equals(devolverButton)) {
            GuiDevolucionLibro guiDevolver = new GuiDevolucionLibro(biblioteca);
            setVisible(false);
        }
    }
}