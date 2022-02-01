package six;

public class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("Vozdra kaže i worker sa imenom: " + Thread.currentThread().getName());
    }
}
