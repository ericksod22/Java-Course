import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;

public class CoffeeSizeTest {
    @Test
    public void coffeeSizeSmall100() {
        CoffeeSize coffeeSize = new CoffeeSize("small");
        assertEquals(100, coffeeSize.price());
    }

    @Test
    public void coffeeSizeMedium150() {
        CoffeeSize coffeeSize= new CoffeeSize("medium");
        assertEquals(150, coffeeSize.price());
    }

    @Test
    public void coffeeSizeLarge200() {
        CoffeeSize coffeeSize = new CoffeeSize("large");
        assertEquals(200, coffeeSize.price());
    }
    @Test
    public void coffeeSizeSmallEnum100() {
        CoffeeSize coffeeSize = new CoffeeSize(SizeOption.SMALL);
        assertEquals(100, coffeeSize.price());
    }
    @Test
    public void coffeeSizeMediumEnum200() {
        CoffeeSize coffeeSize = new CoffeeSize(SizeOption.MEDIUM);
        assertEquals(150, coffeeSize.price());
    }
    @Test
    public void coffeeSizeLargeEnum200() {
        CoffeeSize coffeeSize = new CoffeeSize(SizeOption.LARGE);
        assertEquals(200, coffeeSize.price());
    }
}
