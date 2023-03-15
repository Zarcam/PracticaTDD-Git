import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    @Test
    void alPasarUnStringVacioDevuelve0(){
        int resultadoReal = OperacionesTDD.suma("");
        int resultadoEsperado = 0;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void alPasar1ComoStringDevuelve1(){
        int resultadoReal = OperacionesTDD.suma("1");
        int resultadoEsperado = 1;

        assertEquals(resultadoEsperado, resultadoReal);
    }
}