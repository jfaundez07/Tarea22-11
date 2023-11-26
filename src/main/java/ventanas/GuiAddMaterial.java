package ventanas;

import dominio.Biblioteca;
import dominio.Libro;
import dominio.Revista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

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

    private Biblioteca biblioteca;

    public GuiAddMaterial(Biblioteca biblioteca) {
        setUpGui();
        this.biblioteca = biblioteca;
    }

    private void setUpGui() {
        setTitle("Agregar Material");
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(addMaterialPanel);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarButton.addActionListener(this);
        libroCheckBox.addActionListener(this);
        revistaCheckBox.addActionListener(this);

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
                biblioteca.mostrarTodo();
            }
        }
    }

}
