package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    void calcukater() {
        CheckDisk checkDisk = new CheckDisk("2025-11-11");
        assertEquals("Вторник", Input.calcukater(checkDisk));
    }
}