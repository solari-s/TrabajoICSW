package com.example.demo.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumaTest {

    private final Suma suma = new Suma();

    @Test
    void sumarEnterosPositivos() {
        assertEquals(14, suma.sumar(10, 4));
    }

    @Test
    void sumarConNegativo() {
        assertEquals(-3, suma.sumar(-8, 5));
    }

    @Test
    void sumarDecimales() {
        assertEquals(7.5, suma.sumar(5.0, 2.5), 1e-9);
    }
}
