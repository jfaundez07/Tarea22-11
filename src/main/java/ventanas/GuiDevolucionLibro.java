package ventanas;

import dominio.Biblioteca;
import manejoUsuarios.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiDevolucionLibro extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField issn;
    private JButton devolverButton;
    private JButton Volver;
    private JTextField isbn;
    private JCheckBox revistaCheckBox;
    private JCheckBox libroCheckBox;
    private Biblioteca biblioteca;
    private Usuario usuario;

    public GuiDevolucionLibro(Biblioteca biblioteca) {
        setUpGui();
        this.biblioteca = biblioteca;
    }

    public void setUpGui(){
        setTitle("Devolucion de Libro");
        setVisible(true);
        setContentPane(panel);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        devolverButton.addActionListener(this);
        Volver.addActionListener(this);
        revistaCheckBox.addActionListener(this);
        libroCheckBox.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == devolverButton) {
            try {
                if (revistaCheckBox.isSelected()) {
                    biblioteca.buscarRevistaISSN(issn.getText()).devolver();
                    JOptionPane.showMessageDialog(null, "Revista devuelta");

                } else if (libroCheckBox.isSelected()) {
                    biblioteca.buscarLibroISBN(isbn.getText()).devolver();
                    JOptionPane.showMessageDialog(null, "Libro devuelto");

                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un tipo de material");
                }

            } catch (NullPointerException exception) {
                JOptionPane.showMessageDialog(null, "No se encontro el material");
            }
        }

        if (e.getSource() == Volver) {
            GuiBiblioteca guiBiblioteca = new GuiBiblioteca(biblioteca);
            setVisible(false);
        }

        if (e.getSource() == revistaCheckBox) {
            libroCheckBox.setSelected(false);
        }

        if (e.getSource() == libroCheckBox) {
            revistaCheckBox.setSelected(false);
        }
    }

}