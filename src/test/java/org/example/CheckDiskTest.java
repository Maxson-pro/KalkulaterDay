package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class CheckDiskTest {

    @Test
    void getYear() {
        CheckDisk d = new CheckDisk("2025-11-11");
        assertEquals(2025, d.getYear());
    }

    @Test
    void getMonth() {
        CheckDisk d = new CheckDisk("2025-11-11");
        assertEquals(11, d.getMonth());
    }

    @Test
    void getDay() {
        CheckDisk d = new CheckDisk("2025-11-11");
        assertEquals(11, d.getDay());
    }
}