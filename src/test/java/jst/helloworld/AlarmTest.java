package jst.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {
    Alarm alarm = new Alarm();
    @Test
    void getGuests() {

    }

    @Test
    void isTooMuch_when31_thenTrue() {
        assertTrue(alarm.isTooMuch(31));
    }
    @Test
    void isTooMuch_when30_thenFalse() {
        assertFalse(alarm.isTooMuch(30));
    }

    @Test
    void showCount() {

    }

}