package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void testAdd() {
        assertEquals(11, c.add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, c.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(25, c.multiply(5, 5));
    }

    @Test
    void testDivide() {
        assertEquals(5, c.divide(25, 5));
    }

    @Test
    void testSquare() {
        assertEquals(25, c.square(5));
    }
}