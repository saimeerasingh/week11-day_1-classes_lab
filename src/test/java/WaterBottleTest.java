import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canReduceVolumeWhenDrunk(){
        assertEquals(90,waterBottle.drinkWater(100));
    }

    @Test
    public void canEmptyBottle(){
        assertEquals(0,waterBottle.emptyBottle(100));
    }

    @Test
    public void canRefillBottle(){
        assertEquals(100,waterBottle.refillBottle(100));
    }

}
