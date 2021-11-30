package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntToRomanTest {

    @Test
    void numberOfDuplicatesEmptyList() {
        IntToRoman.intToRoman(12);
        assertEquals(IntToRoman.intToRoman(12), "XII");
    }
}