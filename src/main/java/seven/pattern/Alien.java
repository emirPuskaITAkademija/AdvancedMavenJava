package seven.pattern;

import java.io.Serializable;

public class Alien implements Serializable {

    private static Alien SINGLETON = null;

    private Alien() {
        System.out.println("Konstruiše se vanzemaljac...");
    }

    private void alienIsOnEarth(){
        System.out.println("Vanzemaljac se spustio na našu planetu....");
    }

    public static Alien getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new Alien();
        }
        return SINGLETON;
    }
}
