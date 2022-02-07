import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(5,25);
    }

    @Test
    public void canAddNumbers(){
        assertEquals(30, calculator.addNumbers(5,25));
    }

    @Test
    public void canSubtractNumbers(){
        assertEquals(20,calculator.subtractNumbers(25,5));
    }

    @Test
    public void canMutiplyNumbers(){
        assertEquals(125,calculator.multiplyNumbers(5,25));
    }

    @Test
    public void canDivideNumbers(){
        assertEquals(5.0, calculator.divideNumbers(25,5), 0.0);
    }



}
