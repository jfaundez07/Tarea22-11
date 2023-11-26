package dominio;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Biblioteca biblioteca;
    Libro libro1;
    Libro libro2;
    Libro libro3;
    Revista revista1;
    Revista revista2;
    Revista revista3;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        libro1 = new Libro("1", "El señor de los anillos", "J.R.R Tolkien", "123456789", "1");
        libro2 = new Libro("2", "El señor de los anillos", "J.R.R Tolkien", "223456789", "2");
        libro3 = new Libro("3", "El señor de los anillos", "J.R.R Tolkien", "323456789", "3");
        revista1 = new Revista("4", "El señor de los anillos", "J.R.R Tolkien", "123456789", "1");
        revista2 = new Revista("5", "El señor de los anillos", "J.R.R Tolkien", "223456789", "2");
        revista3 = new Revista("6", "El señor de los anillos", "J.R.R Tolkien", "323456789", "3");
        biblioteca.addMaterial(libro1);
        biblioteca.addMaterial(libro2);
        biblioteca.addMaterial(libro3);
        biblioteca.addMaterial(revista1);
        biblioteca.addMaterial(revista2);
        biblioteca.addMaterial(revista3);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }




    @org.junit.jupiter.api.Test
    void buscarTitulo() {
        assertEquals(6, biblioteca.buscarTitulo("El señor de los anillos").size());
    }

    @org.junit.jupiter.api.Test
    void buscarAutor() {
        assertEquals(6, biblioteca.buscarAutor("J.R.R Tolkien").size());
    }

    @org.junit.jupiter.api.Test
    void buscarLibroISBN() {
        assertEquals(libro1, biblioteca.buscarLibroISBN("123456789"));
        assertEquals(libro2, biblioteca.buscarLibroISBN("223456789"));
        assertEquals(libro3, biblioteca.buscarLibroISBN("323456789"));
    }

    @org.junit.jupiter.api.Test
    void buscarRevistaISSN() {
        assertEquals(revista1, biblioteca.buscarRevistaISSN("123456789"));
        assertEquals(revista2, biblioteca.buscarRevistaISSN("223456789"));
        assertEquals(revista3, biblioteca.buscarRevistaISSN("323456789"));
    }
}