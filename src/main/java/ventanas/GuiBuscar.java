package ventanas;

import dominio.Biblioteca;
import dominio.MaterialBiblioteca;
import manejoUsuarios.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuiBuscar extends JFrame implements ActionListener {

    private Biblioteca biblioteca;
    private JPanel buscarPanel;
    private JFormattedTextField tituloFormattedTextField;
    private JLabel tituloLabel;
    private JLabel autorLabel;
    private JFormattedTextField autorFormattedTextField;
    private JFormattedTextField isbnFormattedTextField;
    private JFormattedTextField issnFormattedTextField;
    private JLabel isbnLabel;
    private JLabel issnLabel;
    private JCheckBox tituloCheckBox;
    private JCheckBox autorCheckBox;
    private JCheckBox isbnCheckBox;
    private JCheckBox issnCheckBox;
    private JButton buscarButton;
    private JButton volverButton;
    private Usuario usuario;

    public GuiBuscar(Biblioteca biblioteca, Usuario usuario) {
        setUpGui();
        this.biblioteca = biblioteca;
        this.usuario = usuario;
    }

    private void setUpGui() {
        setTitle("Buscar Material");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buscarPanel);
        setSize(800, 600);
        setLocationRelativeTo(null);

        buscarButton.addActionListener(this);
        tituloCheckBox.addActionListener(this);
        autorCheckBox.addActionListener(this);
        isbnCheckBox.addActionListener(this);
        issnCheckBox.addActionListener(this);
        volverButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(buscarButton)) {

            if (tituloCheckBox.isSelected()) {
                String titulo = tituloFormattedTextField.getText();
                ArrayList<MaterialBiblioteca> materialesEncontrados = biblioteca.buscarTitulo(titulo);
                for (MaterialBiblioteca material : materialesEncontrados) {
                    JOptionPane.showMessageDialog(null, material.toString());
                }
                limpiarTecxfields();
            }
            if (autorCheckBox.isSelected()) {
                String autor = autorFormattedTextField.getText();
                ArrayList<MaterialBiblioteca> materialesEncontrados = biblioteca.buscarAutor(autor);
                for (MaterialBiblioteca material : materialesEncontrados) {
                    JOptionPane.showMessageDialog(null, material.toString());
                }
                limpiarTecxfields();
            }

            if (isbnCheckBox.isSelected()) {
                String isbn = isbnFormattedTextField.getText();
                JOptionPane.showMessageDialog(null, biblioteca.buscarLibroISBN(isbn));
                limpiarTecxfields();
            }

            if (issnCheckBox.isSelected()) {
                String issn = issnFormattedTextField.getText();
                JOptionPane.showMessageDialog(null, biblioteca.buscarRevistaISSN(issn));
                limpiarTecxfields();
            }
        }

        if(event.getSource().equals(volverButton)){
            GuiBiblioteca guiBiblioteca = new GuiBiblioteca(biblioteca, usuario);
            setVisible(false);
        }

    }

    private void limpiarTecxfields(){
        tituloFormattedTextField.setText("");
        autorFormattedTextField.setText("");
        isbnFormattedTextField.setText("");
        issnFormattedTextField.setText("");
    }
}