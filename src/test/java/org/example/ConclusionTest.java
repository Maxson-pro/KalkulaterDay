package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConclusionTest {

   @Test
    void testReturn1_WrongFormat(){
       assertFalse(Сonclusion.isDate("2025-11"));
   }
   @Test
    void testReturn2_WrongMonth() {
       assertFalse(Сonclusion.isDate("2025-13-11"));
   }
   @Test
    void testReturn3_WrongDay() {
       assertFalse(Сonclusion.isDate("2025-04-31"));
   }
   @Test
    void testReturn4_NotNumbers() {
       assertFalse(Сonclusion.isDate("год-месяц-день"));
   }
   @Test
    void testReturn5_Sussess() {
       assertTrue(Сonclusion.isDate("2025-11-11"));
   }
   @Test
    void isLeapYear_test1() {
       assertTrue(Сonclusion.isLeapYear(2024));
   }
   @Test
    void isLeapYear_test2() {
       assertTrue(Сonclusion.isLeapYear(2000));
   }
    @Test
    void isLeapYear_test3() {
        assertFalse(Сonclusion.isLeapYear(2025));
    }
    @Test
    void isLeapYear_test4() {
        assertFalse(Сonclusion.isLeapYear(1900));
    }


}