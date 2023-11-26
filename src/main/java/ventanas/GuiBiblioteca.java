package ventanas;

import com.sun.source.doctree.SeeTree;
import dominio.Biblioteca;

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
        this.biblioteca = biblioteca;
        setUpGui();

    }

    public void setUpGui(){
        setTitle("Biblioteca");
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(bibliotecaPanel);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        prestarButton.addActionListener(this);
        agregarButton.addActionListener(this);
        buscarButton.addActionListener(this);
        devolverButton.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(prestarButton)) {
            //GuiPrestarMaterial guiPrestarMaterial = new GuiPrestarMaterial(biblioteca);
            //guiPrestarMaterial.setUpGui();
        }
        if (event.getSource().equals(agregarButton)) {
            GuiAddMaterial guiAgregarMaterial = new GuiAddMaterial(biblioteca);
            setVisible(false);
        }
        if (event.getSource().equals(buscarButton)) {
            //GuiBuscarMaterial guiBuscarMaterial = new GuiBuscarMaterial(biblioteca);
            //guiBuscarMaterial.setUpGui();
        }
        if (event.getSource().equals(devolverButton)) {
            //GuiDevolverMaterial guiDevolverMaterial = new GuiDevolverMaterial(biblioteca);
            //guiDevolverMaterial.setUpGui();
        }
    }
}