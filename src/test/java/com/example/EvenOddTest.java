
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void testEvenNumber() {
        assertTrue(EvenOdd.isEven(8));
    }

    @Test
    void testOddNumber() {
        assertFalse(EvenOdd.isEven(7));
    }

    @Test
    void testZeroIsEven() {
        assertTrue(EvenOdd.isEven(0));
    }

    @Test
    void testNegativeOddNumber() {
        assertFalse(EvenOdd.isEven(-3));
    }

    @Test
    void testNegativeEvenNumber() {
        assertTrue(EvenOdd.isEven(-4));
    }
}
