package three;

import two.io.decorator.Beverage;
//import two.io.decorator.Esspreso;
import two.io.decorator.MilkDecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BeverageTester {
    public static void main(String[] args) throws FileNotFoundException {
//        Beverage beverage = new MilkDecorator(new Esspreso());
        BufferedInputStream bif = new BufferedInputStream(new FileInputStream(""));
    }
}
