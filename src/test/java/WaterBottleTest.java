import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void canTakeOneDrink(){
        int oneDrink = waterBottle.drink();
        assertEquals(90, oneDrink);
    }

    @Test
    public void canEmptyWaterBottle(){
        int emptyBottle = waterBottle.empty();
        assertEquals(0, emptyBottle);
    }


//    @Test
//    public void canTakeTwoDrinks(){
//        int twoDrinks ....? ;
//        assertEquals(80, twoDrinks);
//    }



}
