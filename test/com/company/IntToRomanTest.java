package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class IntToRomanTest {

    @Test
    void basicTest() {
        assertEquals(IntToRoman.intToRoman(12), "XII");
    }

    @Test
    void emptyTest() {
        assertEquals(IntToRoman.intToRoman(0), "");
    }

    @Test
    void largeTest() {
        assertEquals(IntToRoman.intToRoman(2493), "MMCDXCIII");
    }
}