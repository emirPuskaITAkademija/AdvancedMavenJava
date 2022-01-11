package two.io.decorator;

import java.io.Closeable;

public class Esspreso extends Beverage implements Closeable {
    public Esspreso() {
        super("Espresso");
    }

    @Override
    public double cost() {
        return 1.5;
    }

    @Override
    public void close() {
        System.out.println("Zatvaram KAFANU....");
    }
}
