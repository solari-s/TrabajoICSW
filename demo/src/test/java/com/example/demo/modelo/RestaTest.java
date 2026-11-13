package com.example.demo.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RestaTest {

    private final Resta resta = new Resta();

    @Test
    void restarEnterosPositivos() {
        assertEquals(6, resta.restar(10, 4));
    }

    @Test
    void restarConResultadoNegativo() {
        assertEquals(-3, resta.restar(2, 5));
    }

    @Test
    void restarNegativoMenosPositivo() {
        assertEquals(-8, resta.restar(-5, 3));
    }

    @Test
    void restarDecimales() {
        assertEquals(2.5, resta.restar(5.0, 2.5), 1e-9);
    }
}
