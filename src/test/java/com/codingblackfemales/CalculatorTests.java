package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("multiply two numbers")
    public void testMultiplication() {
        final Integer multiplication = Calculator.multiply(2, 4);

        assertEquals(8, multiplication);
    }

    @Test
    @DisplayName("multiply three numbers")
    public void testMultiplication2() {
        final Integer multiplication = Calculator.multiply2(3, 4, 1);

        assertEquals(12, multiplication);
    }

    @Test
    @DisplayName("multiply two negative numbers")
    public void testMultiplicationNegative() {
        final Integer multiplication = Calculator.multiply(-2, 4);

        assertEquals(-8, multiplication);
    }

    @Test
    @DisplayName("dividing two numbers")
    public void testDivision() {
        final Integer division = Calculator.divide(4, 2);

        assertEquals(2, division);
    }

    @Test
    @DisplayName("dividing by zero")
    public void testDivisionByZero() {
        final Integer division = Calculator.divide(0, 0);
        assertThrows(ArithmeticException.class, ());
    }

    @Test

    @DisplayName("divide two numbers to return a Float")

    public void testDivisionFloat() {

        final Integer division = Calculator.divide(2, 4);

        assertEquals(0.5, division);

    }
}
