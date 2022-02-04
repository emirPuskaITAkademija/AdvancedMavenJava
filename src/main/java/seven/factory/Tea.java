package seven.factory;

class Tea implements Beverage{
    @Override
    public void drink() {
        System.out.println("Pijem čaj i očajavam...");
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
