import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;

public class CoffeeCreamerTest {
    @Test
    public void coffeeCreamerNone0() {
        CoffeeCreamer coffeeCreamer = new CoffeeCreamer("none");
        assertEquals(0, coffeeCreamer.price());
    }

    @Test
    public void coffeeCreamerMilk25() {
        CoffeeCreamer coffeeCreamer = new CoffeeCreamer("milk");
        assertEquals(25, coffeeCreamer.price());
    }

    @Test
    public void coffeeCreamerHalfnHalf25() {
        CoffeeCreamer coffeeCreamer = new CoffeeCreamer("half_n_half");
        assertEquals(35, coffeeCreamer.price());
    }

    @Test
    public void coffeeCreamerHalfnHalfEnum35() {
        CoffeeCreamer coffeeCreamer = new CoffeeCreamer(CreamerOption.HALF_N_HALF);
        assertEquals(35, coffeeCreamer.price());
    }

    @Test
    public void coffeeCreamerMilkQuantityTwoEnum50() {
        CoffeeCreamer coffeeCreamer = new CoffeeCreamer(CreamerOption.MILK, 2);
        assertEquals(50, coffeeCreamer.price());
    }

    @Test
    public void coffeeCreamerMilkQuantity0Enum0() {
        CoffeeCreamer coffeeCreamer = new CoffeeCreamer(CreamerOption.MILK, 0);
        assertEquals(0, coffeeCreamer.price());
    }

    @Test
    public void coffeeCreamerNoneQuantity0Enum0() {
        CoffeeCreamer coffeeCreamer = new CoffeeCreamer(CreamerOption.NONE, 0);
        assertEquals(0, coffeeCreamer.price());
    }
}
