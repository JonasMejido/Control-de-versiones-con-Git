package tema4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
class TestEj2 {
	
	private Ej2_ServicioEnvio ServicioEnvio;
    private Ej2_ServicioPedido ServicioPedido;
    
	 @BeforeEach
	    void setUp() {
	        // Inicializamos la base de datos y el servicio
	        ServicioEnvio = new Ej2_ServicioEnvio();
	        ServicioPedido = new Ej2_ServicioPedido(ServicioEnvio);
	 }
	 
	 @Test
	 void Ej2_ServicioEnvio (){
		 assertNotNull (ServicioEnvio, "El envio no debería ser nulo");
	 }
	 
	 @Test
	 void Ej2_ServicioPedido() {
		 assertNotNull (ServicioPedido, "Eljj pedido no debería ser nulo");
	 }

	@Test
	void testEnviarPedido() {
		String pedido ="Pedido 123";
		boolean resultado= ServicioPedido.crearYEnviarPedido(pedido);
		assertTrue(resultado, "El pedido debería haberse entregado");
				
	}
	@Test
	void testEnviarPedidoFallido() {
		 Ej2_ServicioEnvio servicioEnvioFallo = new Ej2_ServicioEnvio() {
	            @Override
	            public boolean enviarPedido(String pedido) {
	                return false;
	            }
	        };
	        Ej2_ServicioPedido servicioPedidoFallo = new Ej2_ServicioPedido(servicioEnvioFallo);
		String pedido= "Pedido 321";
		 boolean resultado = servicioPedidoFallo.crearYEnviarPedido(pedido);
	        assertFalse(resultado, "El pedido no debería haberse enviado correctamente.");
	}

}
