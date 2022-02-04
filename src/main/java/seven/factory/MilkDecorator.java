package seven.factory;

class MilkDecorator implements Beverage {

    private final Beverage esspresso;

    public MilkDecorator(Beverage esspresso) {
        this.esspresso = esspresso;
    }

    @Override
    public void drink() {
        esspresso.drink();
        System.out.println(" s mlijekom");
    }

    @Override
    public double cost() {
        return esspresso.cost() + 0.5;
    }
}
