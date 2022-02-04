package seven.factory;

class CocaCola implements Beverage{
    @Override
    public void drink() {
        System.out.println("Pijem Coca Cola...i košta me " + cost());
    }

    @Override
    public double cost() {
        return 3;
    }
}
