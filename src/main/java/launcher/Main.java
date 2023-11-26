package launcher;

import dominio.Biblioteca;
import ventanas.GuiBiblioteca;

public class Main {

    public static void main(String[] args) {

            Biblioteca biblioteca = new Biblioteca();
            GuiBiblioteca guiBiblioteca = new GuiBiblioteca(biblioteca);
    }
}
