import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void alPasarElEntero1Devuelve1ComoString(){
        String salidaReal = FizzBuzz.jugar(1);
        String salidaEsperada = "1";

        assertEquals(salidaEsperada, salidaReal);
    }

    @Test
    void alPasarElEntero2Devuelve2ComoString(){
        String salidaReal = FizzBuzz.jugar(2);
        String salidaEsperada = "2";

        assertEquals(salidaEsperada, salidaReal);
    }

    @Test
    void alPasarElEntero3DevuelveFizzComoString(){
        String salidaReal = FizzBuzz.jugar(3);
        String salidaEsperada = "Fizz";

        assertEquals(salidaEsperada, salidaReal);
    }
}