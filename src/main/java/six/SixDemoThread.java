package six;

public class SixDemoThread extends Thread {
    public static void main(String[] args) {
        System.out.println("Vozdra raja...Petak je a vi ste i dalje tu.. kaže thread: " + Thread.currentThread().getName());
        SixDemoThread sixDemoThread = new SixDemoThread();
        //1. način da kreirate inicirate kreianje novog Thread
        sixDemoThread.start();
        //2. način
        Runnable runnable = new Worker();
        new Thread(runnable).start();
        Runnable runnable1 = () -> System.out.println("Neki blok koda će izvršavati : " + Thread.currentThread().getName());
        new Thread(runnable1).start();
    }

    @Override
    public void run() {
        System.out.println("Ja sam pmoćnik MAIN Thread i ime mi je: " + Thread.currentThread().getName());
    }
}
