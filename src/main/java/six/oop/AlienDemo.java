package six.oop;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AlienDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Alien alien1 = Alien.getAlien();
        Alien alien2 = Alien.getAlien();
        Alien alien3 = Alien.getAlien();
        Alien alien4 = Alien.getAlien();
        Alien alien5 = Alien.getAlien();
        System.out.println(alien1.hashCode());
        System.out.println(alien2.hashCode());
        System.out.println(alien3.hashCode());
        System.out.println(alien4.hashCode());
        System.out.println(alien5.hashCode());
        Class classAlien = Class.forName("six.oop.Alien");
        Constructor constructor =    classAlien.getDeclaredConstructor();
        constructor.setAccessible(true);

        Alien drugiAlien =(Alien) constructor.newInstance();
        System.out.println(drugiAlien.hashCode());
    }
}
