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

    @Test
    void alPasarElEntero4Devuelve4ComoString(){
        String salidaReal = FizzBuzz.jugar(4);
        String salidaEsperada = "4";

        assertEquals(salidaEsperada, salidaReal);
    }

    @Test
    void alPasarElEntero5DevuelveBuzzComoString(){
        String salidaReal = FizzBuzz.jugar(5);
        String salidaEsperada = "Buzz";

        assertEquals(salidaEsperada, salidaReal);
    }

    @Test
    void alPasarElEntero6DevuelveFizzComoString(){
        String salidaReal = FizzBuzz.jugar(6);
        String salidaEsperada = "Fizz";

        assertEquals(salidaEsperada, salidaReal);
    }

    @Test
    void alPasarElEntero7Devuelve7ComoString(){
        String salidaReal = FizzBuzz.jugar(7);
        String salidaEsperada = "7";

        assertEquals(salidaEsperada, salidaReal);
    }

    @Test
    void alPasarElEntero8Devuelve8ComoString(){
        String salidaReal = FizzBuzz.jugar(8);
        String salidaEsperada = "8";

        assertEquals(salidaEsperada, salidaReal);
    }

    @Test
    void alPasarElEntero9DevuelveFizzComoString(){
        String salidaReal = FizzBuzz.jugar(9);
        String salidaEsperada = "Fizz";

        assertEquals(salidaEsperada, salidaReal);
    }

    @Test
    void alPasarElEntero10DevuelveBuzzComoString(){
        String salidaReal = FizzBuzz.jugar(10);
        String salidaEsperada = "Buzz";

        assertEquals(salidaEsperada, salidaReal);
    }
}