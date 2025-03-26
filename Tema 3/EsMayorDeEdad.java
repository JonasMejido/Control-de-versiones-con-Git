package tema3_cajaNegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EsMayorDeEdad {
    @Test
    void testEsMayorDeEdadConEdad18() {
        boolean resultado = Edad.esMayorDeEdad(18);
        assertEquals(true, resultado, "Error: 18 años debe ser considerado mayor de edad");
    }

    @Test
    void testEsMayorDeEdadConEdad100() {
        boolean resultado = Edad.esMayorDeEdad(100);
        assertEquals(true, resultado, "Error: 100 años debe ser considerado mayor de edad");
    }

    @Test
    void testEsMayorDeEdadConEdadMenor18() {
        boolean resultado = Edad.esMayorDeEdad(17);
        assertEquals(false, resultado, "Error: 17 años no debe ser considerado mayor de edad");
    }

    @Test
    void testEsMayorDeEdadConEdadNegativa() {
        boolean resultado = Edad.esMayorDeEdad(-5);
        assertEquals(false, resultado, "Error: Edad negativa no debe ser mayor de edad");
    }

    @Test
    void testEsMayorDeEdadConEdadMayor100() {
        boolean resultado = Edad.esMayorDeEdad(101);
        assertEquals(false, resultado, "Error: 101 años no debe ser considerado mayor de edad");
    }
}
