package seven.pattern;

public class AlienEnumDemo {
    public static void main(String[] args) {
        AlienEnum alien1 = AlienEnum.SINGLETON;
        AlienEnum alien2 = AlienEnum.SINGLETON;
        System.out.println(alien1.hashCode());
        System.out.println(alien2.hashCode());
    }
}
