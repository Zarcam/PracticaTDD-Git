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

    @Test
    void alPasar1y2ComoStringDevuelve3(){
        int resultadoReal = OperacionesTDD.suma("1,2");
        int resultadoEsperado = 3;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void alPasar1y1y2ComoStringDevuelve4(){
        int resultadoReal = OperacionesTDD.suma("1,1,2");
        int resultadoEsperado = 4;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void alPasar1y2yUnaComaComoStringDevuelve1Negativo(){
        int resultadoReal = OperacionesTDD.suma("1,2,");
        int resultadoEsperado = -1;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void alPasar1y2y2NegativoComoStringDevuelve1NegativoYMuestraUnMensajeDeError(){
        int resultadoReal = OperacionesTDD.suma("1,2,-2");
        int resultadoEsperado = -1;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void alPasar5y1002ComoStringDevuelve5MuestraUnMensajeDeError(){
        int resultadoReal = OperacionesTDD.suma("5,1002");
        int resultadoEsperado = 5;

        assertEquals(resultadoEsperado, resultadoReal);
    }
}