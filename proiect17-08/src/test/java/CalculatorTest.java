import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception{
        calculator = new Calculator();
    }

    @Test
    @DisplayName("test the addition")
    public void testAdd(){
        assertEquals(20, calculator.add(10,10), 0);
    }
    @Test
    @DisplayName("test the addition")
    public void testSubstract(){
        assertEquals(5, calculator.substract(15,10), 0);
    }
    @Test
    @DisplayName("test the addition")
    public void testMultiplication(){
        assertEquals(100, calculator.multiply(10,10), 0);
    }
    @Test
    @DisplayName("test the addition")
    public void testDivision(){
        assertEquals(2, calculator.devide(20,10), 0);
    }
    @Test
    @DisplayName("test the addition")
    public void testDivisionByZero(){
        assertThrows(ArithmeticException.class, ()->{calculator.devide(20,0);});
    }
}
