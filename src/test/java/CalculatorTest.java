//import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
//    Calculator calculator; //Defining a new variable

//    @Before
//    public void before(){
//        calculator = new Calculator();  //creating it (new Calculator) the initialising it () but not passing anything in
//    }

    @Test
    public void canAdd(){
        Calculator calculator = new Calculator(5, 3);
        int sum = calculator.add();
        assertEquals(8, sum);
    }

    @Test
    public void canSubtract(){
        Calculator calculator = new Calculator(5, 3);
        int difference = calculator.subtract();
        assertEquals(2, difference);
    }


    @Test
    public void canMultiply(){
        Calculator calculator = new Calculator(5, 3);
        int product = calculator.multiply();
        assertEquals(15, product);
    }

    @Test
    public void canDivide(){
        Calculator calculator = new Calculator(9, 3);
        int answer = calculator.divide();
        assertEquals(3, answer);
    }


//    @Test // when dividing should use double as some number will return decimals (e.g. dividing 3/2)
//    public void canDivide(){
//        Calculator calculator = new Calculator(9, 3);
//        double answer = calculator.divide();
//        assertEquals(3, answer, 0);
//    }
}
