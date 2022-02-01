package six.oop;

/**
 * <li>1. Refleksija</li>
 * <li>2. Serijalizacija/Deserijalizacija</li>
 * <li>3. clone</li>
 * <li>4. multithreading</li>
 * <lI>5. class loadanja</lI>
 * <li>6. garbage collection</li>
 */
final class Alien {

    private static Alien SINGLETON = null;

    private Alien(){
        System.out.println("Poziva se konstruktor klase Alien...");
    }


    public static Alien getAlien(){
        if(SINGLETON == null){
            SINGLETON = new Alien();
        }
        return SINGLETON;
    }
}
