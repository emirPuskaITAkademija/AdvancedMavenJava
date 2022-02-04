package seven.pattern;

import four.person.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 1. Field
 * 2. Constructor
 * 3. Method
 */
public class AlienDemo {
    public static void main(String[] args) throws Exception {
        Alien alien1 = Alien.getInstance();
        Alien alien2 = Alien.getInstance();

        System.out.println(alien1.hashCode());
        System.out.println(alien2.hashCode());

        //više načina da se dođe do anđela čuvara objekat alien1 ili alien2
        Class andeo = alien1.getClass();
        Constructor constructor =  andeo.getDeclaredConstructor();
        constructor.setAccessible(true);
        Alien alien3 =(Alien) constructor.newInstance();
        System.out.println(alien3.hashCode());


        //Serijalizacija/Deserijalizacija
        //serijalizacija alien1
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("s2.ser"));
        ous.writeObject(alien1);
        //deserijalizaciju alien1
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("s2.ser"));
        Alien alien4 = (Alien) ois.readObject();
        System.out.println(alien4.hashCode());


        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("person.ser"));
        Person person1 = (Person)  ois2.readObject();
        System.out.println("PROČITANI person: " + person1.getName()+" " + person1.getSurname());
    }
}
