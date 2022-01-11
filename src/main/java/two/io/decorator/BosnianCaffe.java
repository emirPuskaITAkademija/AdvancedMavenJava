package two.io.decorator;

public class BosnianCaffe extends Beverage{


    public BosnianCaffe() {
        super("Bosnian caffe");
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
