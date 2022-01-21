package five.niti;

public class SleepMessages {
    public static void main(String[] args) throws InterruptedException {
        String[] vaznePoruke ={
                "Threadove može kreirati kroz extends Thread",
                "Threadove možemo kreirati kroz implements Runnable",
                "Uradite zadatak broj 1 : 'Izbaci Duplikat'",
                "Uradite zadatak broj 2: 'Soritrati Stringove'..Nedimova krivica",
                "Uradite zadatak broj 3: 'Doraditi NumberContainer sa add & remove'"
        };
        for(String poruka: vaznePoruke){
            System.out.println(poruka);
            Thread.sleep(4000);
        }
    }
}
