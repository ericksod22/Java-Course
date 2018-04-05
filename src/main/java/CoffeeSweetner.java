public class CoffeeSweetner implements CoffeeItem{

    static String coffeeSweetner = "";

    public int quantity = 1;

    public CoffeeSweetner(String newCoffeeSweetner) {
        coffeeSweetner = newCoffeeSweetner;
    }

    public CoffeeSweetner(String newCoffeeSweetner, int quantitySweetner) {
        coffeeSweetner = newCoffeeSweetner;
        quantity = quantitySweetner;
    }


    @Override
    public int price() {
        if (coffeeSweetner.equals("none")) {
            return (0 * quantity);
        } else if (coffeeSweetner.equals("Sugar")) {
            return (10 * quantity);
        } else if (coffeeSweetner.equals("Splenda")) {
            return (15 * quantity);
        }
        return 0;
    }
}
