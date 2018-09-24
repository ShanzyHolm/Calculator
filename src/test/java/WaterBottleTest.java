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



}
