package jst.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummeTest {

    @Test
    void summeBilden() {
        assertEquals(12, Summe.summeBilden(5, 7));
    }

    @Test
    void summeStringPOS() {
        assertEquals("234", Summe.SummeString(234));
    }

    @Test
    void summeStringNEG() {
        assertEquals("-2", Summe.SummeString(-2));
    }

    @Test
    void zahlenPruefenWF() {
        assertTrue(Summe.zahlenPruefen(102,22));
    }

    @Test
    void zahlenPruefenFW() {
        assertTrue(Summe.zahlenPruefen(22,122));
    }

    @Test
    void zahlenPruefenFF() {
        assertFalse(Summe.zahlenPruefen(52,22));
    }
}