import org.junit.jupiter.api.Test;
import testUnitario.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(-1, Calculadora.sumar(-2, 1));
        assertEquals(0, Calculadora.sumar(0, 0));
        assertEquals(10, Calculadora.sumar(5, 5));
    }

    @Test
    void restar() {
        assertEquals(-1, Calculadora.restar(2, 3));
        assertEquals(-3, Calculadora.restar(-2, 1));
        assertEquals(0, Calculadora.restar(5, 5));
        assertEquals(5, Calculadora.restar(10, 5));
    }

    @Test
    void multiplicar() {
        assertEquals(6, Calculadora.multiplicar(2, 3));
        assertEquals(-2, Calculadora.multiplicar(-1, 2));
        assertEquals(0, Calculadora.multiplicar(0, 5));
        assertEquals(100, Calculadora.multiplicar(10, 10));
    }

    @Test
    void dividir() {
        assertEquals(2.5, Calculadora.dividir(5, 2));
        assertEquals(-2, Calculadora.dividir(-4, 2));
        assertEquals(Double.POSITIVE_INFINITY, Calculadora.dividir(5, 0));
        assertEquals(0, Calculadora.dividir(0, 5));
    }
}
