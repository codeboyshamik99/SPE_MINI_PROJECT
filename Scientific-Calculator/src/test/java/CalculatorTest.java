import org.junit.Test;
import org.example.Calculator;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Calculator.squareRoot(16.0), 0.0001); // square root of 16 is 4
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Calculator.factorial(5)); // 5! = 120
    }

    @Test
    public void testNaturalLog() {
        assertEquals(1.6094, Calculator.naturalLog(5.0), 0.0001); // ln(5) ≈ 1.6094
    }

    @Test
    public void testPower() {
        assertEquals(32.0, Calculator.power(2.0, 5.0), 0.0001); // 2^5 = 32
    }
}

