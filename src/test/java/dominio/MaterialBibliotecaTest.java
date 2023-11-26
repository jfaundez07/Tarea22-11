package dominio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaterialBibliotecaTest {

    Libro libro;
    Revista revista;

    @BeforeEach
    void setUp() {
        libro = new Libro("1", "titulo", "autor", "ISBN", "edicion");
        revista = new Revista("2", "titulo", "autor", "ISSN", "fecha");
    }

    @AfterEach
    void tearDown() {
    }



    @Test
    void prestar() {
        assertFalse(libro.isPrestado());
        libro.prestar();
        assertTrue(libro.isPrestado());


        assertFalse(revista.isPrestado());
        revista.prestar();
        assertTrue(revista.isPrestado());
    }

    @Test
    void devolver() {
        libro.prestar();
        assertTrue(libro.isPrestado());
        libro.devolver();
        assertFalse(libro.isPrestado());

        revista.prestar();
        assertTrue(revista.isPrestado());
        revista.devolver();
        assertFalse(revista.isPrestado());
    }
}