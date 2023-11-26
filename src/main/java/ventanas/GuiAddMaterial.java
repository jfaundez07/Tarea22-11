package ventanas;

import dominio.Biblioteca;
import dominio.Libro;
import dominio.Revista;
import manejoUsuarios.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiAddMaterial extends JFrame implements ActionListener{
    private JPanel addMaterialPanel;
    private JLabel tituloLabel;
    private JFormattedTextField tituloTextField;
    private JLabel autorLabel;
    private JFormattedTextField autorTextField;
    private JLabel isbnLabel;
    private JFormattedTextField isbnTextField;
    private JFormattedTextField edicionTextField;
    private JLabel edicionLabel;
    private JLabel issnLabel;
    private JFormattedTextField issnFormattedTextField;
    private JLabel numeroLabel;
    private JFormattedTextField numeroTextField;
    private JButton agregarButton;
    private JCheckBox libroCheckBox;
    private JCheckBox revistaCheckBox;
    private JLabel libroLabel;
    private JLabel revistaLabel;
    private JButton volverButton;

    private Biblioteca biblioteca;
    private Usuario usuario;

    public GuiAddMaterial(Biblioteca biblioteca, Usuario usuario) {
        setUpGui();
        this.biblioteca = biblioteca;
        this.usuario = usuario;
    }

    private void setUpGui() {
        setTitle("Agregar Material");
        setVisible(true);
        setContentPane(addMaterialPanel);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        agregarButton.addActionListener(this);
        libroCheckBox.addActionListener(this);
        revistaCheckBox.addActionListener(this);
        volverButton.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent event) {

        if(event.getSource().equals(agregarButton)){

            if(libroCheckBox.isSelected()){
                String newId = String.valueOf(biblioteca.getListaMateriales().size() + 1);
                String titulo = tituloTextField.getText();
                String autor = autorTextField.getText();
                String isbn = isbnTextField.getText();
                String edicion = edicionTextField.getText();
                Libro nuevoLibro = new Libro(newId,titulo,autor,isbn,edicion);
                biblioteca.addMaterial(nuevoLibro);
                JOptionPane.showMessageDialog(null,"Libro agregado correctamente");
                limpiarTecxfields();
                biblioteca.mostrarTodo();
            }

            if(revistaCheckBox.isSelected()){
                String newId = String.valueOf(biblioteca.getListaMateriales().size() + 1);
                String titulo = tituloTextField.getText();
                String autor = autorTextField.getText();
                String issn = issnFormattedTextField.getText();
                String numero = numeroTextField.getText();
                Revista nuevaRevista = new Revista(newId,titulo,autor,issn,numero);
                biblioteca.addMaterial(nuevaRevista);
                JOptionPane.showMessageDialog(null,"Revista agregada correctamente");
                limpiarTecxfields();
                biblioteca.mostrarTodo();
            }
        }

        if(event.getSource().equals(volverButton)){
            GuiBiblioteca guiBiblioteca = new GuiBiblioteca(biblioteca, usuario);
            setVisible(false);
        }

        if(event.getSource().equals(libroCheckBox)){
            revistaCheckBox.setSelected(false);
        }

        if(event.getSource().equals(revistaCheckBox)){
            libroCheckBox.setSelected(false);
        }
    }

    private void limpiarTecxfields(){
        tituloTextField.setText("");
        autorTextField.setText("");
        isbnTextField.setText("");
        edicionTextField.setText("");
        issnFormattedTextField.setText("");
        numeroTextField.setText("");
    }

}
