package six;

public class SimpleThreads {

    static void threadMessage(String message){
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }

    private static class MessageLoop implements Runnable{
        @Override
        public void run() {
            String[] vaznePoruke ={
                    "Threadove može kreirati kroz extends Thread",
                    "Threadove možemo kreirati kroz implements Runnable",
                    "Uradite zadatak broj 1 : 'Izbaci Duplikat'",
                    "Uradite zadatak broj 2: 'Soritrati Stringove'..Nedimova krivica",
                    "Uradite zadatak broj 3: 'Doraditi NumberContainer sa add & remove'"
            };
            try {
                for (String vaznaPoruka : vaznePoruke) {
                    //pauzu od 4 sekunde
                    Thread.sleep(4000);
                    threadMessage(vaznaPoruka);
                }
            }catch (InterruptedException exc){
               threadMessage("Nisam završio a prekinut sam ");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //1 sat sam napisao u milisekundama
        long strpljenje = 1000 * 10;
        Thread worker = new Thread(new MessageLoop());
        worker.start();
        long startTime = System.currentTimeMillis();
        while (worker.isAlive()){
            threadMessage("Još te čekam...");
            //čekat ću te maksimalno 1 sekundu da završiš sa 5 poruka
            worker.join(1000);
            long periodRadaRadnika = System.currentTimeMillis()-startTime;
            if(periodRadaRadnika>strpljenje){
                threadMessage("Umoran sam od čekanja ..");
                worker.interrupt();
            }
        }
        threadMessage("KOnačno...nek si uspio završit posao....");

    }
}
