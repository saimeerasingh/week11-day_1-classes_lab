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
        waterBottle.drinkWater();
        assertEquals(90,waterBottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        waterBottle.emptyBottle();
        assertEquals(0,waterBottle.getVolume());
    }

    @Test
    public void canRefillBottle(){
        waterBottle.refillBottle();
        assertEquals(100,waterBottle.getVolume());
    }

}
