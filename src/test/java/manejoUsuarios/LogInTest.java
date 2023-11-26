package manejoUsuarios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogInTest {

    LogIn logIn = new LogIn();
    Usuario usuario1;
    Usuario usuario2;

    @BeforeEach
    void setUp() {
        usuario1 = new Usuario(1, "admin1", "test1@gmail.com", "1234");
        usuario2 = new Usuario(2, "admin2", "test2@gmail.com", "1234");
        logIn.addUsuario(usuario1);
        logIn.addUsuario(usuario2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void buscarUsuario() {
        assertEquals(usuario1, logIn.buscarUsuario("test1@gmail.com"));
        assertEquals(usuario2, logIn.buscarUsuario("test2@gmail.com"));
    }

    @Test
    void verificarUsuario() {
        assertTrue(logIn.verificarUsuario("test1@gmail.com", "1234"));
        assertTrue(logIn.verificarUsuario("test2@gmail.com", "1234"));

        assertFalse(logIn.verificarUsuario("test1@gmail.com", "12345"));
        assertFalse(logIn.verificarUsuario("test2@gmail.com", "12345"));
    }
}