package seven.factory;

class Esspresso implements Beverage{
    @Override
    public void drink() {
        System.out.println("Pijem esspresso.... i košta me ");
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
