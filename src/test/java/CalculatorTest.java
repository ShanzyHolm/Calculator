//import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
//    Calculator calculator;

//    @Before
//    public void before(){
//        calculator = new Calculator();
//    }

    @Test
    public void canAdd(){
        Calculator calculator = new Calculator(5, 3);
        int sum = calculator.add();
        assertEquals(8, sum);
    }

}
