package seven.factory;

public enum BeverageFactory {
    ESPRESSO_FACTORY(new Esspresso()),
    COCA_COLA_FACTORY(new CocaCola()),
    MILK_ESPRESSO_FACTORY(new MilkDecorator(new Esspresso())),
    MILK_TEA_FACTORY(new MilkDecorator(new Tea()));

    private final Beverage beverage;

    private BeverageFactory(Beverage beverage){
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}
