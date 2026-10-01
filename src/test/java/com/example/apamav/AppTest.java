package com.example.apamav;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(15, App.calculate(10, '+', 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, App.calculate(10, '-', 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, App.calculate(10, '*', 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, App.calculate(10, '/', 5));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(
            ArithmeticException.class,
            () -> App.calculate(10, '/', 0)
        );
    }

    @Test
    public void testInvalidOperator() {
        assertThrows(
            IllegalArgumentException.class,
            () -> App.calculate(10, '%', 5)
        );
    }
}
