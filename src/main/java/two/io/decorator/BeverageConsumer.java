package two.io.decorator;

/**
 * OPEN/CLOSED
 * Closed for modification
 * Open for extension
 */
public class BeverageConsumer {
    public static void main(String[] args) {
        BosnianCaffe bosnianCaffe = new BosnianCaffe();
        consumeBeverage(bosnianCaffe);
        Esspreso esspreso = new Esspreso();
        consumeBeverage(esspreso);
        CocaCola cocaCola = new CocaCola();
        consumeBeverage(cocaCola);
        MilkDecorator milkDecorator = new MilkDecorator(esspreso);
        consumeBeverage(milkDecorator);
        MilkDecorator milkDecorator1 = new MilkDecorator(bosnianCaffe);
        consumeBeverage(milkDecorator1);
        MilkDecorator milkDecorator2 = new MilkDecorator(cocaCola);
        consumeBeverage(milkDecorator2);
    }

    private static void consumeBeverage(Beverage beverage){
        System.out.println("Pijem " + beverage.getName()+" i to košta " + beverage.cost());
    }
}
