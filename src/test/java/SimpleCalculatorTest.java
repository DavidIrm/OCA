import Junit.SimpleCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusShouldEqualFor() {
        var calculator = new SimpleCalculator();
        //  assertEquals(4,calculator.add(2,2));
        assertTrue(calculator.add(2, 2) == 4);

    }

    @Test
    void twoPlusSevenShouldEqualTen() {
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3, 7));
//        assertTrue(calculator.add(2,2) == 4);
    }
}