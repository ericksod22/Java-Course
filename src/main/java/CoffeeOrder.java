import com.sun.glass.ui.Size;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrder {

    public int price;

    List<CoffeeItem> items = new ArrayList<>();

    public void addSize(String newCoffeeSize) {
        items.add(new CoffeeSize(newCoffeeSize));
    }

    public void addCreamer(String newCreamer) {
        items.add(new CoffeeCreamer(newCreamer));
    }

    public void addSweetner(String newCoffeeSweetner) {
        items.add(new CoffeeSweetner(newCoffeeSweetner));
    }


    public CoffeeOrder(String newCoffeeSize, String newCreamer) {
        addSize(newCoffeeSize);
        addCreamer(newCreamer);
    }

    public CoffeeOrder(SizeOption newEnumCoffeeSize, String newCreamer) {
        addSize(newEnumCoffeeSize.name().toLowerCase());
        addCreamer(newCreamer);
    }

    public CoffeeOrder(CreamerOption newEnumCreamer) {
        addSize(newEnumCreamer.name().toLowerCase());
    }


    public CoffeeOrder(String newCoffeeSize, String newCreamer, String newCoffeeSweetner) {
        addSize(newCoffeeSize);
        addCreamer(newCreamer);
        addSweetner(newCoffeeSweetner);
    }

    public CoffeeOrder(SizeOption newEnumCoffeeSize, CreamerOption newEnumCreamer, String newCoffeeSweetner) {
        addSize(newEnumCoffeeSize.name().toLowerCase());
        addCreamer(newEnumCreamer.name().toLowerCase());
        addSweetner(newCoffeeSweetner);
    }

    public CoffeeOrder(SizeOption newEnumCoffeeSize, CreamerOption newEnumCreamer, int quantityCreamer, String newCoffeeSweetner, int quantitySweetner) {
        addSize(newEnumCoffeeSize.name().toLowerCase());
        addCreamer(newEnumCreamer.name().toLowerCase());
        addSweetner(newCoffeeSweetner);
    }

    public CoffeeOrder(SizeOption coffeeSize) {
        addSize(coffeeSize.name().toLowerCase());
    }

    public int price() {
        int internalPrice = 0;

        for (CoffeeItem item: items) {
            internalPrice = internalPrice + item.price();
        }
        price = internalPrice;
        display();
        return internalPrice;
    }

    public void display() {
        System.out.println("Coffee Order: ");
        System.out.println("Size: " + CoffeeSize.coffeeSize);
        System.out.println("Creamer: " + CoffeeCreamer.coffeeCreamer);
        System.out.println("Sweetner: " + CoffeeSweetner.coffeeSweetner);
        System.out.println("Price: " + price);
        System.out.println(" ");
    }
}