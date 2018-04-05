import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;


public class CoffeeSweetnerTest {

@Test
public void coffeeSweetnerNone(){
    CoffeeSweetner coffeeSweetner = new CoffeeSweetner("none");
    assertEquals(0,coffeeSweetner.price());

    }
@Test
    public void coffeeSweetnerSugar10(){
        CoffeeSweetner coffeeSweetner = new CoffeeSweetner("Sugar");
        assertEquals(10,coffeeSweetner.price());

    }

    @Test
    public void coffeeSweetnerSplenda15(){
        CoffeeSweetner coffeeSweetner = new CoffeeSweetner("Splenda");
        assertEquals(15,coffeeSweetner.price());

    }

    @Test
    public void coffeeSweetnerSplendaQuantity30(){
        CoffeeSweetner coffeeSweetner = new CoffeeSweetner("Splenda", 2);
        assertEquals(30,coffeeSweetner.price());
    }

    @Test
    public void coffeeSweetnerSugarQuantityThree30(){
        CoffeeSweetner coffeeSweetner = new CoffeeSweetner("Sugar", 3);
        assertEquals(30,coffeeSweetner.price());
    }
}


