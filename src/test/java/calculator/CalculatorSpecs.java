package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorSpecs {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void addsTwoNumbers(){
        assertEquals(5, calculator.add(2.0f, 3.0f), 0f);
        assertEquals(6, calculator.add(3.0f, 3.0f), 0f);
    }

    @Test
    public void dividesTwoNumbers(){
        assertEquals(0.666666, calculator.divide(2.0f, 3.0f), 0.0000007f);
        assertEquals(1, calculator.divide(3.0f,3.0f), 0f);
    }

    @Test
    public void replayAddOperation(){
        //given
        calculator.add(2.0f, 3.0f);

        String result = calculator.replay();

        assertEquals("2.0 + 3.0 = 5.0", result);
    }

    @Test
    public void replayDivideOperation(){
        //given
        calculator.divide(5.0f, 2.0f);

        String result = calculator.replay();

        assertEquals("5.0 / 2.0 = 2.5", result);
    }

    @Test
    public void replayAllOperations(){
        //given
        calculator.divide(5.0f, 2.0f);
        calculator.add(2.0f, 3.0f);

        String result = calculator.replay();

        assertEquals("5.0 / 2.0 = 2.5; 2.0 + 3.0 = 5.0", result);
    }

    @Test
    public void replaysNoOps(){
        //given
        String result = calculator.replay();

        assertEquals("No Operations Performed", result);
    }

    @Test
    public void replayLastOp(){
        calculator.divide(5.0f, 2.0f);
        calculator.add(3.0f, 3.0f);
        calculator.add(2.0f, 5.0f);

        String result = calculator.replayLast(1);

        assertEquals("2.0 + 5.0 = 7.0", result);

    }

    @Test
    public void replayLastTwoOp(){
        calculator.divide(5.0f, 2.0f);
        calculator.add(2.0f, 3.0f);
        calculator.add(2.0f, 5.0f);

        String result = calculator.replayLast(2);

        assertEquals("2.0 + 5.0 = 7.0; 2.0 + 3.0 = 5.0", result);

    }
}
