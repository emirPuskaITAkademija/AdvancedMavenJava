package seven.pattern;

public enum AlienEnum {

    SINGLETON;

    private AlienEnum(){
        System.out.println("Konstruiše se vanzemaljac u ENUMERIRANOM tipu...");
    }
}
