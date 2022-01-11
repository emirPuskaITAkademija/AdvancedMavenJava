package two.io.decorator;

public class CocaCola extends Beverage{
    public CocaCola() {
        super("Coca Cola");
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
