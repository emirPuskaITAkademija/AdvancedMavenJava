package seven.trebevic;

import seven.factory.Beverage;
import seven.factory.BeverageFactory;

public class DemoBeverage {
    public static void main(String[] args) {
        Beverage espresso = BeverageFactory.ESPRESSO_FACTORY.getBeverage();
        espresso.drink();
        espresso.cost();

        Beverage beverage = BeverageFactory.COCA_COLA_FACTORY.getBeverage();
        beverage.drink();

        Beverage kafuSMlijekom = BeverageFactory.MILK_ESPRESSO_FACTORY.getBeverage();
        kafuSMlijekom.drink();
        System.out.println("Košta kafa s mllijekom : " + kafuSMlijekom.cost());
    }
}
