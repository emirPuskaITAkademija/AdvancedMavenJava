package flying;

public class FlyableFactory {



    public static Flyable flyingObject(){
        return new Plane();
    }

    //postojanje objekta tipa Plane
    private static class Plane implements Flyable {

        @Override
        public void fly() {
            System.out.println("Avion leti leti....dok ima goriva");
        }
    }
}
