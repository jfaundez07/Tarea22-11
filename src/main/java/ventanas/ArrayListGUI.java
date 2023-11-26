package ventanas;

import dominio.MaterialBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ArrayListGUI extends JFrame implements ActionListener{

    private JButton volverButton;

    public ArrayListGUI(ArrayList<MaterialBiblioteca> materialesEncontrados) {
        setUpGui();
        JPanel panel = new JPanel(new BorderLayout());

        DefaultListModel<String> listaModelo = new DefaultListModel<>();

        for (MaterialBiblioteca material : materialesEncontrados) {
            listaModelo.addElement(material.getTitulo() + " - " + material.getAutor() + "|Prestado: " +material.isPrestado());
        }

        JList<String> listaMostrar = new JList<>(listaModelo);

        panel.add(new JScrollPane(listaMostrar), BorderLayout.CENTER);
        panel.add(volverButton, BorderLayout.SOUTH);

        add(panel);

        setVisible(true);
    }

    private void setUpGui(){
        setTitle("Materiales encontrados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        añadirVolverButton();
    }

    private void añadirVolverButton(){
        volverButton= new JButton("Volver");
        volverButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(volverButton)){
            this.dispose();
        }
    }
}
