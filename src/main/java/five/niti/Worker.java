package five.niti;

public class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("Vozdra raja iz Runnable radnika... THREAD: " + Thread.currentThread().getName());
        System.out.println("Bla bla bla iz Runnable radnika.. THREAD: " + Thread.currentThread().getName());
    }
}
