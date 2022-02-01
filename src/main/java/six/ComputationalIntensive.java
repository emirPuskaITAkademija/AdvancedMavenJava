package six;

import java.util.stream.IntStream;

//1. sekvencijalno : MAIN
//2. paraleno: workers i MAIN
public class ComputationalIntensive {
    public static final int MAX = 2000;

    static double compute(double value){
        System.out.println("THREAD: " + Thread.currentThread().getName());
        double result = 0;
        for(int i = 0; i<MAX; i++){
            for(int j = 0; j<MAX; j++){
                result = result + Math.sqrt(i*j);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        double result = IntStream.range(0, MAX)
                .parallel()
                .mapToDouble(ComputationalIntensive::compute)
                .sum();
        System.out.println("RESULT = " + result);
        System.out.println((System.currentTimeMillis()-startTime)/1000+" seconds");
    }
}
