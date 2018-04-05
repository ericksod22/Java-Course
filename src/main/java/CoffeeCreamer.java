public class CoffeeCreamer implements CoffeeItem{

    static String coffeeCreamer = "";

    public int quantity = 1;

    public CoffeeCreamer(String newCreamer) {
     coffeeCreamer = newCreamer;
    }

    public CoffeeCreamer(CreamerOption newEnumCreamer) {
        coffeeCreamer = newEnumCreamer.name().toLowerCase();
    }

    public CoffeeCreamer(CreamerOption newEnumCreamer, int quantityCreamer) {
        coffeeCreamer = newEnumCreamer.name().toLowerCase();
        quantity = quantityCreamer;
    }

    @Override
    public int price() {
        if (coffeeCreamer.equals("none")) {
            return (0 * quantity);
        } else if (coffeeCreamer.equals("milk")) {
            return (25 * quantity);
        } else if (coffeeCreamer.equals("half_n_half")) {
            return (35 * quantity);
        }
        return 0;
    }
}
