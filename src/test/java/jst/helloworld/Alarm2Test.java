package jst.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Alarm2Test {

    @Test
    void main() {
    }

    @Test
    void getGuests() {
        assertEquals(10, Alarm2.getGuests());
    }

    @Test
    void isTooMuch() {
        assertFalse(Alarm2.isTooMuch(59, 1));
    }

    @Test
    void setAlarm() {
    }

    @Test
    void showCount() {
    }
}