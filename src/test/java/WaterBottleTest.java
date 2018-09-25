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
    public void volumeStartsAt100(){
        assertEquals(100, waterBottle.getVolume());
    }

//    @Test
//    public void canTakeOneDrink(){
//        int oneDrink = waterBottle.drink();
//        assertEquals(90, oneDrink);
//    }

    @Test
    public void canTakeOneDrink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.drink());
    }

//    @Test
//    public void canEmptyWaterBottle(){
//        int emptyBottle = waterBottle.empty();
//        assertEquals(0, emptyBottle);
//    }

    @Test
    public void canEmptyWaterBottle(){
        waterBottle.empty();
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void canFillWaterBottle(){
        int fillBottle = waterBottle.empty() + waterBottle.fill();
        assertEquals(100, fillBottle);
    }


//    @Test
//    public void canTakeTwoDrinks(){
//        int twoDrinks = waterBottle.drink().drink();
//        assertEquals(80, twoDrinks);
//    }
//    @Test
//    public void canTakeTwoDrinks(){
//        int twoDrinks = waterBottle.drink() - waterBottle.drink();
//        assertEquals(80, twoDrinks);
//    }



}
