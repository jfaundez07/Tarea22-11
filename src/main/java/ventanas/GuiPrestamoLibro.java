package ventanas;

import dominio.Biblioteca;
import manejoUsuarios.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiPrestamoLibro extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField issn;
    private JTextField isbn;
    private JCheckBox revistaCheckBox;
    private JCheckBox libroCheckBox;
    private JButton prestarButton;
    private JButton volverButton;
    private Biblioteca biblioteca;
    private Usuario usuario;

    public GuiPrestamoLibro(Biblioteca biblioteca, Usuario usuario) {
        setUpGui();
        this.biblioteca = biblioteca;
        this.usuario = usuario;
    }

    private void setUpGui() {
        setTitle("Prestamo de Libros");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        prestarButton.addActionListener(this);
        volverButton.addActionListener(this);
        revistaCheckBox.addActionListener(this);
        libroCheckBox.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prestarButton) {
            try {
                if (revistaCheckBox.isSelected()) {
                    biblioteca.buscarRevistaISSN(issn.getText()).prestar();
                    JOptionPane.showMessageDialog(null, "Revista prestada");

                } else if (libroCheckBox.isSelected()) {
                    biblioteca.buscarLibroISBN(isbn.getText()).prestar();
                    JOptionPane.showMessageDialog(null, "Libro prestado");

                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un tipo de material");
                }

            } catch (NullPointerException exception) {
                JOptionPane.showMessageDialog(null, "No se encontro el material");

            } catch (RuntimeException exception) {
                JOptionPane.showMessageDialog(null, exception.getMessage());
            }
        }

        if (e.getSource() == volverButton) {
            new GuiBiblioteca(biblioteca, usuario);
            dispose();
        }

        if (e.getSource() == revistaCheckBox) {
            libroCheckBox.setSelected(false);
        }

        if (e.getSource() == libroCheckBox) {
            revistaCheckBox.setSelected(false);
        }
    }
}