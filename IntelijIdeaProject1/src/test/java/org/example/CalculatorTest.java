package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

@ClassPreamble(
        author = "Mauricio Bedoya",
        date = "01/01/2024",
        currentRevision = 3,
        lastModified = "17/01/2024",
        lastModifiedBy = "Mauricio Bedoya"
)
class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator(12,13);
    }
    @Test
    void addition() {
        assertEquals(25.0, calculator.addition());
    }

    @Test
    void subtraction() {
        assertEquals(-1.0, calculator.subtraction());
    }

    @Test
    void multiplication(){
        assertEquals(156.0,calculator.multiplication());
    }

    @Test
    void division(){
        assertEquals(12.0/13, calculator.division());
    }

    @Test
    void divisionByZero(){
        Calculator calculator1 = new Calculator(12,0);
        ArithmeticException exception = assertThrows(ArithmeticException.class, calculator1::division);
        String expectedMsg = calculator1.get_val1() + " / "+ calculator1.get_val2() + " = Error: Division by zero";

        assertEquals(expectedMsg, exception.getMessage());
    }


}