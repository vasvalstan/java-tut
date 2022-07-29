package chapter8;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void integerDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.integerDivision(4, 2);
        assertEquals(2, result);
    }
}