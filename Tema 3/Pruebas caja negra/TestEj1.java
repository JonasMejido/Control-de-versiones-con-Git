package tema4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
class TestEj1 {
	
	private Ej1_BaseDeDatos baseDeDatos;
    private Ej1_ServicioUsuarios servicioUsuarios;
	
	 @BeforeEach
	    void setUp() {
	        // Inicializamos la base de datos y el servicio
	        baseDeDatos = new Ej1_BaseDeDatos();
	        servicioUsuarios = new Ej1_ServicioUsuarios(baseDeDatos);
	    }

	@Test
	void testEj1_BaseDeDatos() {
		assertNotNull(baseDeDatos, "La base de datos no debe ser nula");
	}
	@Test
	void testEj1_ServicioUsuarios() {
		assertNotNull (servicioUsuarios, "el usuario no debe ser nulo");
		
	}

	@Test
	void testConectar() {
		assertTrue (baseDeDatos.conectar(), "la conexión a la base de datos debería ir bien");
	}

	@Test
	void testAgregarUsuario() {
		String usuario="Carlos";
		
		baseDeDatos.agregarUsuario(usuario);
		
		
		assertTrue (baseDeDatos.verificarUsuario(usuario), "El usuario debería de existir");
	}

	@Test
	void testVerificarUsuario() {
		
		String usuario="Maria";
		
		assertTrue (baseDeDatos.verificarUsuario(usuario),"El usuario no debería de aparecer");
		
		baseDeDatos.agregarUsuario(usuario);
		
		assertTrue (baseDeDatos.verificarUsuario(usuario),"El usuario debería de aparecer");
		
	}

}
