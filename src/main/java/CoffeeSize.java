public class CoffeeSize implements CoffeeItem {

    static String coffeeSize = "";

    public CoffeeSize(String newCoffeeSize) {

       coffeeSize = newCoffeeSize;
    }

    public CoffeeSize(SizeOption newEnumCoffeeSize) {
        coffeeSize = newEnumCoffeeSize.name().toLowerCase();
    }

    @Override
    public int price() {
        switch (coffeeSize) {
            case ("small"):
                return 100;
            case ("medium"):
                return 150;
            case ("large"):
                return 200;
            case ("xl"):
                return 300;
            default:
                return 0;
        }
    }
}