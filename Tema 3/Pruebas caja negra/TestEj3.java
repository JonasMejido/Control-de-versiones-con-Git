package tema4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEj3 {
	
	private Ej3_BaseDeDatosProductos BasesDeDatosProductos;
    private Ej3_GestorProductos GestorProductos;
    
	 @BeforeEach
	    void setUp() {
	        // Inicializamos la base de datos y el servicio
	        BasesDeDatosProductos = new Ej3_BaseDeDatosProductos();
	        GestorProductos = new Ej3_GestorProductos(BasesDeDatosProductos);
	 }

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
