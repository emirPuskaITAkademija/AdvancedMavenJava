package five.niti;

/**
 *  Thread 2
 */
public class ThreadDemo extends Thread{
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("Vozdra kaže: " + currentThread.getName());
        //drugi radnici kroz extends Thread
        new ThreadDemo().start();
        new ThreadDemo().start();
        //drugi radnici kroz implements Runnable
        new Thread(new Worker()).start();

    }

    @Override
    public void run() {
        System.out.println("Vozdra raja... THREAD: " + Thread.currentThread().getName());
        System.out.println("Bla bla bla.. THREAD: " + Thread.currentThread().getName());
    }
}
