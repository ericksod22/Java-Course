import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;

public class CoffeeOrderTest {
    @Test
    public void coffeeSizeSmall100() {
        CoffeeOrder coffeeOrder = new CoffeeOrder("small","none");
        assertEquals(100, coffeeOrder.price());
    }
    @Test
    public void coffeeSizeLargeAndMilkCreamer() {
        CoffeeOrder coffeeOrder = new CoffeeOrder("large","milk");
        assertEquals(225,coffeeOrder.price());
    }

    @Test
    public void coffeeSizeMediumHalfnHalfCreamerAndSplenda200() {
        CoffeeOrder coffeeOrder = new CoffeeOrder("medium","half_n_half","Splenda");
        assertEquals(200,coffeeOrder.price());
    }
    @Test
    public void coffeeSizeLargeNoCreamerSugar210() {
        CoffeeOrder coffeeOrder = new CoffeeOrder("large","none","Sugar");
        assertEquals(210,coffeeOrder.price());
    }
    @Test
    public void coffeeSizeSmallMilkCreamerSugar135() {
        CoffeeOrder coffeeOrder = new CoffeeOrder("small","milk","Sugar");
        assertEquals(135,coffeeOrder.price());
    }
    @Test
    public void coffeeSizeXLNoCreamerSplenda() {
        CoffeeOrder coffeeOrder = new CoffeeOrder("xl","none", "Splenda");
        assertEquals(315,coffeeOrder.price());
    }
    @Test
    public void coffeeSmallCreamerHalfNHalfNone135() {
        CoffeeOrder coffeeOrder = new CoffeeOrder("small","half_n_half","none");
        assertEquals(135,coffeeOrder.price());
    }

    @Test
    public void coffeeSmallCreamerHalfNHalfNoneEnum135() {
        CoffeeOrder coffeeOrder = new CoffeeOrder(SizeOption.SMALL,"half_n_half");
        assertEquals(135,coffeeOrder.price());
    }
}
