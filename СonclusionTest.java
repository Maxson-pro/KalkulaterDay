package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class СonclusionTest {

    @Test
    void isDate() {
        assertTrue(Сonclusion.isDate("2025-11-11"));

        assertFalse(Сonclusion.isDate("2025-13-13"));
    }

    @Test
    void isLeapYear() {
        assertTrue(Сonclusion.isLeapYear(2024));
        assertTrue(Сonclusion.isLeapYear(2000));

        assertFalse(Сonclusion.isLeapYear(2025));

    }
}